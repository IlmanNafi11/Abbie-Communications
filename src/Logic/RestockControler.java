package Logic;

import Data_Acces.*;
import java.awt.Color;
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
    private ConfigTable model;

    public RestockControler(String idTransaksi, String kategory, String productId, String productName, int quantity, String idSupplier, String supplierName, int price) {
        this.transactionId = idTransaksi;
        this.category = kategory;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.supplierId = idSupplier;
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
            exceptionHandler.Kesalahan("Select one of the Restock data you want to change");
        }
        return false;
    }

    private boolean ValidateKategori() {
        if (!category.equalsIgnoreCase("Category")) {
            return true;
        } else {
            exceptionHandler.Kesalahan("Choose one of the product categories!");
        }
        return false;
    }

    private boolean ValidateSupplierId() {
        if (!supplierId.equalsIgnoreCase("Supplier ID")) {
            return true;
        } else {
            exceptionHandler.Kesalahan("Choose one of the Supplier ID!");
        }
        return false;
    }

    private boolean ValidateProductId() {
        if (!productId.equalsIgnoreCase("Product ID")) {
            return true;
        } else {
            exceptionHandler.Kesalahan("Choose one of the Product ID!");
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
            exceptionHandler.Kesalahan("Invalid restock amount!");;
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
            exceptionHandler.Kesalahan("Invalid price amount!");;
        }
        return 0;
    }

    private float CalculateTotal() {
        return quantity * price;
    }

    public ConfigTable SetModelTable() {
        model = new ConfigTable();
        model.addColumn("Transaction ID");
        model.addColumn("Category");
        model.addColumn("Product Name");
        model.addColumn("Quantity");
        model.addColumn("Price");
        model.addColumn("Supplier ID");
        model.addColumn("Total");
        model.addColumn("Date");
        return model;
    }

    public void GetAllData(JTable table) {
        model = (ConfigTable) table.getModel();
        ArrayList<Object[]> listData = dbRestock.GetAllDataRestock();
        for (Object[] data : listData) {
            model.addRow(data);
        }
    }

    public void SearchTransaksi(JTable table, JTextField txtSearch) {
        String teksSearch = txtSearch.getText().trim();
        model = (ConfigTable) table.getModel();
        model.setRowCount(0);
        ArrayList<Object[]> DataProduct;
        if (!teksSearch.equalsIgnoreCase("Enter the restock transaction ID or date here")) {        
            DataProduct = dbRestock.SearchTransactionRestock(teksSearch);
            if (DataProduct.isEmpty()) {
                DataProduct = dbRestock.GetAllDataRestock();
                for (Object[] data : DataProduct) {
                    model.addRow(data);
                }
            } else {
                for (Object[] data : DataProduct) {
                    model.addRow(data);
                }
            }
            txtSearch.setText("Enter the restock transaction ID or date here");
            txtSearch.setForeground(new Color(153, 153, 153));
        } else {
            exceptionHandler.Kesalahan("Please enter the restock transaction ID or transaction date!");
            DataProduct = dbRestock.GetAllDataRestock();
            for (Object[] data : DataProduct) {
                model.addRow(data);
            }
        }
    }

    // set comboBox id produk berdasarkan kategorinya
    public void SetComboProdukId(JComboBox<String> comboBox) {
        try {
            productControler = new ProductControler(category, null);
            ArrayList<String> getIdProduk = productControler.getIdProduct();
            comboBox.removeAllItems();
            for (String idProduk : getIdProduk) {
                comboBox.addItem(idProduk);               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }

    public void SetTxtProdukName(String idProduct, JTextField txtProdukName) {
        if (idProduct != "Product ID") {
            productControler = new ProductControler(category, idProduct);
            productName = productControler.getNamaProduct();
            txtProdukName.setText(productName);
        } else {
            txtProdukName.setText("Product Name");
        }
    }

    //set item combo box id supplier berdasarkan kategori produk
    public void SetComboIdSupplier(JComboBox<String> comboBox) {
//        if (!category.equalsIgnoreCase("Category")) {
            supplierControler = new SupplierControler(null, null, null, category);
            ArrayList<String> getIdSupplier = supplierControler.GetIdSupplier();
            comboBox.removeAllItems();
            for (String idSupplier : getIdSupplier) {
                comboBox.addItem(idSupplier);
            }
//        }    
    }

    public void setTxtSupplierName(String idSupplier, JTextField txtSupplierName) {
        if (supplierId != "Supplier ID") {
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
            boolean confirm = exceptionHandler.ConfirmSave("Save Transaction?");
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
            boolean confirm = exceptionHandler.ConfirmSave("Save data changes restock?");
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
            boolean confirm = exceptionHandler.ConfirmDeleteData("Are you sure you want to delete the data?");
            if (confirm) {
                dbRestock.DeleteData(idTransaksi);
                return true;
            }
        } else {
            exceptionHandler.Kesalahan("Please, Select one of the data you want to delete!");
        }
        return false;
    }
}
