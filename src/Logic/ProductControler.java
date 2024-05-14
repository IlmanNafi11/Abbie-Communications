package Logic;

import java.util.ArrayList;
import Data_Acces.*;
import com.onbarcode.barcode.EAN13;
import com.onbarcode.barcode.IBarcode;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ProductControler {

    private String namaProduct;
    private String kategori;
    private String idProduct;
    private String idSupplier;
    private int harga;
    private int jumlahStock;
    private String namaLama;
    private ExceptionHandler exception;
    private SupplierControler supplierControler;
    private DbProduct dbProduct;
    private ConfigTable model;

    public ProductControler(String kategori, String idProduct) {
        this.kategori = kategori;
        this.idProduct = idProduct;
        exception = new ExceptionHandler();
        dbProduct = new DbProduct();
    }

    // get nama produk berdasarkan id untuk kelas transaksi dan restok
    public String getNamaProduct(String produkId) {
        namaProduct = dbProduct.GetProdukName(produkId);
        return namaProduct;
    }

    // get harga produk berdasarkan id untuk kelas transaksi;
    public int getHarga() {
        harga = dbProduct.GetPrice(idProduct);
        return harga;
    }

    // get jumlah stok produk untuk keperluan validasi sebelum transaksi
    public int GetJumlahStock() {
        jumlahStock = dbProduct.GetStok(idProduct);
        return jumlahStock;
    }

    // get id produk berdasarkan kategori yang dipilih pada combo box
    public ArrayList<String> getIdProduct() {
        ArrayList<String> produkId = dbProduct.GetIdProduk(kategori);
        return produkId;
    }

    // set nama lama untuk melacak perubahan nama produk saat update data produk
    public void SetNamaLama(String nama) {
        this.namaLama = nama;
    }

    // generate angka random
    private String GenerateRandom(int angka) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < angka; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }

    // generate id produk
    public void GenerateIdProduct(JTextField txtIdProduct) {
        idProduct = GenerateRandom(12);
        txtIdProduct.setText(idProduct);
        txtIdProduct.setForeground(Color.BLACK);
    }

    private byte[] GenerateBarcode() {
        byte[] byteBarcode = null;
        if (!kategori.equalsIgnoreCase("Category")) {
            try {
                EAN13 barcode = new EAN13();
                barcode.setData(idProduct);
                barcode.setUom(IBarcode.UOM_PIXEL);
                barcode.setX(3f);
                barcode.setY(75f);
                barcode.setLeftMargin(0f);
                barcode.setRightMargin(0f);
                barcode.setTopMargin(0f);
                barcode.setBottomMargin(0f);
                barcode.setResolution(72);
                barcode.setShowText(true);
                barcode.setTextFont(new Font("Arial", 0, 12));
                barcode.setTextMargin(6);
                barcode.setRotate(IBarcode.ROTATE_0);
                BufferedImage imgBarcode = barcode.drawBarcode();

                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                ImageIO.write(imgBarcode, "gif", bytes);
                byteBarcode = bytes.toByteArray();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return byteBarcode;
    }

    //set item combo box id supplier berdasarkan kategori produk
    public void SetIdSupplierByCategory(String kategori, JComboBox<String> comboBox) {
        if (kategori != null) {
            try {
                supplierControler = new SupplierControler(null, null, null, kategori);
                ArrayList<String> GetidSupplier = supplierControler.GetIdSupplier();
                comboBox.removeAllItems();
                for (String idSupplier : GetidSupplier) {
                    comboBox.addItem(idSupplier);
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    // set id supplier berdasarkan id produk saat update data
    public String GetSupplierIdByIdProduct(String produkId) {
        this.idSupplier = dbProduct.GetSupplierByIdProduk(produkId);
        return idSupplier;
    }

    private boolean ValidasiComboBox() {
        if (!kategori.equalsIgnoreCase("Category")) {
            if (!idSupplier.equalsIgnoreCase("Supplier ID")) {
                return true;
            } else {
                exception.Kesalahan("Please select supplier ID!");
            }
        } else {
            exception.Kesalahan("Please Select a product category!");
        }
        return false;
    }

    // get nama supplier berdasarkan id supplier yang dipilih di combo box
    public void GetSupplierName(String suplierId, JTextField txtNamaSupplier) {
        if (suplierId != "Supplier ID") {
            supplierControler = new SupplierControler(suplierId, null, null, null);
            String namaSupplier = supplierControler.GetSupplierName();
            txtNamaSupplier.setText(namaSupplier);
            txtNamaSupplier.setForeground(Color.BLACK);
        } else {
            txtNamaSupplier.setText("Supplier Name");
            txtNamaSupplier.setForeground(new Color(153, 153, 153));
        }
    }

    // cek apakah data produk telah tersedia
    private boolean ValidasiDataProduk() {
        boolean getProduct = dbProduct.CekProduk(namaProduct);
        if (!getProduct) {
            return true;
        }
        exception.Kesalahan("Product has been registered!");
        return false;
    }

    // validasi nama produk(Insert)
    private boolean ValidasiNama() {
        if (!namaProduct.equalsIgnoreCase("Product Name") && !namaProduct.equals("")) {
            if (namaProduct.length() <= 35) {
                return true;
            } else {
                exception.Kesalahan("The Product Name must not exceed 35 characters!");
            }
        } else {
            exception.Kesalahan("All columns must be filled in");
        }
        return false;
    }

    // validasi nama, cek apakah nama telah digunakan sebelum proses update
    private boolean ValidateUpdateName() {
        if (namaProduct.equalsIgnoreCase(namaLama)) {
            return true;
        } else if (ValidasiDataProduk()) {
            return true;
        } else {
            return false;
        }
    }

    // validasi harga produk
    public int ValidasiHarga(JTextField txtHarga) {
        try {
            this.harga = Integer.parseInt(txtHarga.getText());
            if (harga != 0) {
                return harga;
            } else {
                exception.Kesalahan("The price amount must be more than 0");
            }
        } catch (Exception e) {
            exception.Kesalahan("Price amount is invalid");
        }
        return 0;
    }
    
    // validasi jumlah print
    private boolean ValidatejmlPrintData(JComboBox<String> cmbJumlah){
        String jumlahPrint = (String) cmbJumlah.getSelectedItem();
        if (!jumlahPrint.equalsIgnoreCase("Select print amount")) {
            return true;
        } else {
            exception.Kesalahan("Choose the number of prints available!");
        }
        return false;
    }
    
    // Validasi id produk untuk print
    private boolean ValidateIdProductForPrint(JTextField txtIdProduk){
        idProduct = txtIdProduk.getText();
        if (!idProduct.trim().equalsIgnoreCase("Product ID")) {
            return true;
        } else {
            exception.Kesalahan("Enter the Id of the product you want to print!");
        }
        return false;
    }

    public boolean ValidateQuantityWhenChange(JTextField txtkuantitas) {
        try {
            jumlahStock = Integer.parseInt(txtkuantitas.getText());
            return true;
        } catch (NumberFormatException e) {
            exception.Kesalahan("Invalid quantity amount!");
            return false;
        }
    }

    public void setTxtQuantity(JTextField txtProductName, JTextField txtquantity) {
        namaProduct = txtProductName.getText();
        if (!namaProduct.trim().equalsIgnoreCase("") && !namaProduct.trim().equalsIgnoreCase("Product Name")) {
            txtquantity.setText("0 - Restock in the restock menu to increase the stock amount");
        } else {
            txtquantity.setText("Quantity");
        }
    }

    public ArrayList<String> IsiStringField(JTable table) {
        int row = table.getSelectedRow();
        ArrayList<String> data = new ArrayList<>();
        idProduct = table.getValueAt(row, 0).toString();
        namaProduct = table.getValueAt(row, 1).toString();
        kategori = table.getValueAt(row, 2).toString();
        data.add(idProduct);
        data.add(namaProduct);
        data.add(kategori);
        return data;
    }

    public ArrayList<Integer> IsiIntField(JTable table) {
        int row = table.getSelectedRow();
        ArrayList<Integer> data = new ArrayList<>();
        int stok = (Integer) table.getValueAt(row, 3);
        harga = (Integer) table.getValueAt(row, 4);
        data.add(harga);
        data.add(stok);
        return data;
    }

    public void DisplayBarcode(JComboBox<String> cmbKategori, JLabel lblBarcode) {
        kategori = (String) cmbKategori.getSelectedItem();
        byte[] iconBarcode = GenerateBarcode();
        if (iconBarcode != null) {
            ImageIcon imgBarcode = new ImageIcon(iconBarcode);
            lblBarcode.setIcon(imgBarcode);
            lblBarcode.setText("");
        } else {
            lblBarcode.setIcon(null);
            lblBarcode.setForeground(new Color(153, 153, 153));
            lblBarcode.setText("Barcode");
        }
    }

    public ImageIcon GetBarcode(String idProduct) {
        byte[] iconBarcode = dbProduct.GetBarcode(idProduct);
        ImageIcon imgBarcode = new ImageIcon(iconBarcode);
        return imgBarcode;
    }

    public boolean ValidateRow(JTable table) {
        int row = table.getSelectedRow();
        if (row != -1) {
            return true;
        } else {
            exception.Kesalahan("Select one of the product data you want to change");
        }
        return false;
    }

    public ConfigTable SetModelTable() {
        model = new ConfigTable();
        model.addColumn("Product ID");
        model.addColumn("Product Name");
        model.addColumn("Category");
        model.addColumn("Quantity");
        model.addColumn("Price");
        return model;
    }

    public void GetAllData(JTable table) {
        model = (ConfigTable) table.getModel();
        ArrayList<Object[]> DataProduct = dbProduct.GetAllDataProduk();
        for (Object[] data : DataProduct) {
            model.addRow(data);
        }
    }

    public void SearchData(JTable table, JTextField txtSearch) {
        String teksSearch = txtSearch.getText();
        model = (ConfigTable) table.getModel();
        model.setRowCount(0);
        ArrayList<Object[]> DataProduct;
        if (!teksSearch.equalsIgnoreCase("Enter the ID or product name here")) {
            DataProduct = dbProduct.SearchProduct(teksSearch);
            if (DataProduct.isEmpty()) {
                DataProduct = dbProduct.GetAllDataProduk();
                for (Object[] data : DataProduct) {
                    model.addRow(data);
                }
            } else {
                for (Object[] data : DataProduct) {
                    model.addRow(data);
                }
            }
            txtSearch.setText("Enter the ID or product name here");
            txtSearch.setForeground(new Color(153, 153, 153));
        } else {
            exception.Kesalahan("Please enter the product ID or name of the product you want to search for!");
            DataProduct = dbProduct.GetAllDataProduk();
            for (Object[] data : DataProduct) {
                model.addRow(data);
            }
        }
    }

    public void SelectionSort(JTable table, int columnIndex, JComboBox<String> JComboSortByPrice) {
        String price = (String) JComboSortByPrice.getSelectedItem();
        model = (ConfigTable) table.getModel();
        int rowCount = model.getRowCount();
        if (price.equalsIgnoreCase("Sort by price: lowest")) {
            for (int i = 0; i < rowCount - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < rowCount; j++) {
                    double minValue = Double.parseDouble(model.getValueAt(minIndex, columnIndex).toString());
                    double currentValue = Double.parseDouble(model.getValueAt(j, columnIndex).toString());
                    if (currentValue < minValue) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    swapRows(model, i, minIndex);
                }
            }
        } else if (price.equalsIgnoreCase("Sort by price: highest")) {
            for (int i = 0; i < rowCount - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < rowCount; j++) {
                    double maxValue = Double.parseDouble(model.getValueAt(maxIndex, columnIndex).toString());
                    double currentValue = Double.parseDouble(model.getValueAt(j, columnIndex).toString());
                    if (currentValue > maxValue) {
                        maxIndex = j;
                    }
                }
                if (maxIndex != i) {
                    swapRows(model, i, maxIndex);
                }
            }
        } else {
            table.setModel(SetModelTable());
        }
    }

    private void swapRows(ConfigTable model, int i, int j) {
        int columnCount = model.getColumnCount();
        Object[] temp = new Object[columnCount];

        for (int k = 0; k < columnCount; k++) {
            temp[k] = model.getValueAt(i, k);
            model.setValueAt(model.getValueAt(j, k), i, k);
            model.setValueAt(temp[k], j, k);
        }
    }

    public void PrintAllProduct() {
        dbProduct.PrintAllProduct();
    }

    public boolean PrintDataSelected(JTextField txtIdProduct, JComboBox<String> cmbJumlah) {
        if (ValidateIdProductForPrint(txtIdProduct) && ValidatejmlPrintData(cmbJumlah)) {
            idProduct = txtIdProduct.getText();
            String jumlahPrint = (String) cmbJumlah.getSelectedItem();
            int limit = Integer.parseInt(jumlahPrint);
            dbProduct.PrintProductBySelected(idProduct, limit);
            return true;
        }
        return false;
    }

    public void SetDataToPrint(JTextField txtIdProduct, JTextField txtNamaProduct, JTextField txtHarga) {
        idProduct = txtIdProduct.getText();
        namaProduct = getNamaProduct(idProduct);
        harga = getHarga();
        txtNamaProduct.setText(namaProduct);
        txtHarga.setText(String.valueOf(harga));
    }

    // insert data produk
    public boolean InsertProduct(JTextField txtIdProduk, JTextField txtNamaProduk, JTextField txtJmlStock, JComboBox<String> cmbIdSupplier, JComboBox<String> cmbKategori, JTextField txtHargaProduk) {
        kategori = (String) cmbKategori.getSelectedItem();
        idProduct = txtIdProduk.getText();
        namaProduct = txtNamaProduk.getText();
        idSupplier = (String) cmbIdSupplier.getSelectedItem();
        harga = ValidasiHarga(txtHargaProduk);
        jumlahStock = Integer.parseInt(txtJmlStock.getText().split(" - ")[0]);
        if (ValidasiDataProduk() && ValidasiNama() && harga != 0) {
            byte[] barcode = GenerateBarcode();
            boolean confirm = exception.ConfirmSave("Save product data?");
            if (confirm) {
                dbProduct.InsertProduct(kategori, idProduct, namaProduct, jumlahStock, idSupplier, harga, barcode);
                return true;
            }
        }
        return false;
    }

    // update data produk
    public boolean ChangeProductData(JTextField txtIdProduk, JTextField txtNamaProduk, JTextField txtJmlStock, JComboBox<String> cmbIdSupplier, JComboBox<String> cmbKategori, JTextField txtHargaProduk, String namaLama) {
        kategori = (String) cmbKategori.getSelectedItem();
        idProduct = txtIdProduk.getText();
        namaProduct = txtNamaProduk.getText();
        SetNamaLama(namaLama);
        idSupplier = (String) cmbIdSupplier.getSelectedItem();
        harga = ValidasiHarga(txtHargaProduk);
        if (ValidasiComboBox() && ValidateUpdateName() && ValidasiNama() && ValidateQuantityWhenChange(txtJmlStock) && harga != 0) {
            jumlahStock = Integer.parseInt(txtJmlStock.getText());
            boolean confirm = exception.ConfirmSave("Save product data changes?");
            if (confirm) {
                dbProduct.ChangeDataProduct(kategori, idProduct, namaProduct, jumlahStock, idSupplier, harga);
                return true;
            }
        }
        return false;
    }

    public boolean DeleteDataProduk(JTable tabel) {
        int getRow = tabel.getSelectedRow();
        if (getRow != -1) {
            boolean confirm = exception.ConfirmDeleteData("Delete Product?");
            idProduct = tabel.getValueAt(getRow, 0).toString();
            if (confirm) {
                dbProduct.DeleteProduk(idProduct);
                return true;
            }
        } else {
            exception.Kesalahan("Select one of the data you want to delete !");
        }
        return false;
    }
}
