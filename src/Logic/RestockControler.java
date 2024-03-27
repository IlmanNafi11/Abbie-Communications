package Logic;

import Data_Acces.*;
import java.util.Date;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.util.ArrayList;

public class RestockControler {

    private String transactionId;
    private String category;
    private String productId;
    private String productName;
    private int quantity;
    private String supplierId;
    private String supplierName;
    private int price;
    private float total;
    private Date tanggal;
    private ExceptionHandler exceptionHandler;
    private ProductControler productControler;
    private SupplierControler supplierControler;
    private DbRestock dbRestock;

    public RestockControler(String idTransaksi, String kategory, String productId, String productName, int quantity, String supplierId, String supplierName, int price) {
        this.transactionId = idTransaksi;
        this.category = kategory;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.price = price;
        exceptionHandler = new ExceptionHandler();
        dbRestock = new DbRestock();
    }

    private String GenerateRandom(int angka) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < angka; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }

    public String GenerateIdTransaksi() {
        return transactionId = "RST" + GenerateRandom(4);
    }

    // get tanggal terbaru
    private Date GetDate() {
        return new Date();
    }

    public boolean ValidateSelectedRow(JTable table) {
        int row = table.getSelectedRow();
        if (row != -1) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Select one of the Restock data you want to change");
        }
        return false;
    }

    private boolean ValidateKategori() {
        if (!category.equalsIgnoreCase("Category")) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Choose one of the product categories!");
        }
        return false;
    }

    private boolean ValidateSupplierId() {
        if (!supplierId.equalsIgnoreCase("Supplier ID")) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Choose one of the Supplier ID!");
        }
        return false;
    }

    private boolean ValidateProductId() {
        if (!productId.equalsIgnoreCase("Product ID")) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Choose one of the Product ID!");
        }
        return false;
    }

    public int ValidateQuantity(JTextField txtQuantity) {
        try {
            this.quantity = Integer.parseInt(txtQuantity.getText());
            if (quantity != 0) {
                return quantity;
            }
        } catch (NumberFormatException e) {
            exceptionHandler.getErrorKesalahan("Invalid restock amount!");;
        }
        return 0;
    }

    public int ValidatePrice(JTextField txtPrice) {
        try {
            this.price = Integer.parseInt(txtPrice.getText());
            if (price != 0) {
                return price;
            }
        } catch (NumberFormatException e) {
            exceptionHandler.getErrorKesalahan("Invalid price amount!");;
        }
        return 0;
    }

    private float CalculateTotal() {
        return quantity * price;
    }

    public ConfigTable GetAllData() {
        return dbRestock.GetAllDataRestock();
    }

    // set comboBox id produk berdasarkan kategorinya
    public void SetComboProdukId(JComboBox<String> comboBox) {
        try {
            productControler = new ProductControler(null, category, null, null, 0, 0);
            ArrayList<String> getIdProduk = productControler.getIdProduct();
            comboBox.removeAllItems();
            for (String idProduk : getIdProduk) {
                comboBox.addItem(idProduk);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void SetTxtProdukName(String idProdct, JTextField txtProdukName) {
        if (idProdct != "Product ID") {
            productControler = new ProductControler(null, category, productId, null, 0, 0);
            productName = productControler.getNamaProduct();
            txtProdukName.setText(productName);
        } else {
            txtProdukName.setText("Product Name");
        }
    }

    //set item combo box id supplier berdasarkan kategori produk
    public void SetComboIdSupplier(JComboBox<String> comboBox) {
        try {
            supplierControler = new SupplierControler(null, null, null, category);
            ArrayList<String> getIdSupplier = supplierControler.GetIdSupplier();
            comboBox.removeAllItems();
            for (String idSupplier : getIdSupplier) {
                comboBox.addItem(idSupplier);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setTxtSupplierName(String idSupplier, JTextField txtSupplierName) {
        if (idSupplier != "Supplier ID") {
            supplierControler = new SupplierControler(supplierId, null, null, null);
            supplierName = supplierControler.GetSupplierName();
            txtSupplierName.setText(supplierName);
        } else {
            txtSupplierName.setText("Supplier Name");
        }
    }

    public ArrayList<String> IsiStringField(JTable table) {
        int row = table.getSelectedRow();
        ArrayList<String> data = new ArrayList<>();
        String idTransaksi = table.getValueAt(row, 0).toString();
        String idProduk = dbRestock.GetIdProduct(idTransaksi);
        String kategori = table.getValueAt(row, 1).toString();
        String namaProduk = table.getValueAt(row, 2).toString();
        String idSupplier = table.getValueAt(row, 5).toString();
        supplierControler = new SupplierControler(idSupplier, null, null, null);
        String namaSupplier = supplierControler.GetSupplierName();
        data.add(idTransaksi);
        data.add(kategori);
        data.add(idProduk);
        data.add(namaProduk);
        data.add(idSupplier);
        data.add(namaSupplier);
        return data;
    }

    public ArrayList<Integer> IsiIntField(JTable table) {
        int row = table.getSelectedRow();
        ArrayList<Integer> data = new ArrayList<>();
        int jumlah = (Integer) table.getValueAt(row, 3);
        int harga = (Integer) table.getValueAt(row, 4);
        data.add(jumlah);
        data.add(harga);
        return data;
    }

    public boolean InsertData() {
        if (ValidateKategori() && ValidateProductId() && quantity != 0 && ValidateSupplierId() && price != 0) {
            GenerateIdTransaksi();
            this.tanggal = GetDate();
            this.total = CalculateTotal();
            boolean confirm = exceptionHandler.confirmSave("Save Transaction?");
            if (confirm) {
                dbRestock.InsertData(transactionId, productName, quantity, price, supplierId, productId, total, tanggal);
                return true;

            }
        }
        return false;
    }

    public boolean ChangeData() {
        if (ValidateKategori() && ValidateProductId() && quantity != 0 && ValidateSupplierId() && price != 0) {
            this.tanggal = GetDate();
            this.total = CalculateTotal();
            boolean confirm = exceptionHandler.confirmSave("Save data changes restock?");
            if (confirm) {
                dbRestock.ChangeRestockData(transactionId, productName, quantity, price, supplierId, productId, total, tanggal);
                return true;
            }
        }
        return false;
    }

    public boolean DeleteData(JTable table) {
        int row = table.getSelectedRow();
        if (row != -1) {
            String idTransaksi = table.getValueAt(row, 0).toString();
            boolean confirm = exceptionHandler.confirmDeleteData("Are you sure you want to delete the data?");
            if (confirm) {
                dbRestock.DeleteData(idTransaksi);
                return true;
            }
        } else {
            exceptionHandler.getErrorKesalahan("Please, Select one of the data you want to delete!");
        }
        return false;
    }
}
