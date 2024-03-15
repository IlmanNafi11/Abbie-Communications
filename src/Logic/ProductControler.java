package Logic;

import java.util.ArrayList;
import Data_Acces.*;
import javax.swing.JComboBox;

public class ProductControler {

    private String namaProduct;
    private String kategori;
    private String idProduct;
    private String idSupplier;
    private String namaSuppplier;
    private float harga;
    private String barcode;
    private int jumlahStock;
    private ExceptionHandler exception;
    private DbProduct dbProduct;
    ArrayList<String> addKategori = new ArrayList<>();

    public ProductControler(String namaProduct, String kategori, String idProduct, String idSupplier, float harga, int jumlahStock) {
        this.namaProduct = namaProduct;
        this.kategori = kategori;
        this.idProduct = idProduct;
        this.idSupplier = idSupplier;
        this.harga = harga;
        this.jumlahStock = jumlahStock;
        exception = new ExceptionHandler();
        dbProduct = new DbProduct();
    }

    public void getIdSupplier(JComboBox<String> comboBox) {
        try {
            ArrayList<String> getIdSupplier = dbProduct.getIdSupplier(kategori);
            comboBox.removeAllItems();
            for (String idSupplier : getIdSupplier) {
                comboBox.addItem(idSupplier);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public String getSupplierName() {
        namaSuppplier = dbProduct.getSupplierName(idSupplier);
        if (namaSuppplier != null) {
            return namaSuppplier;
        }
        return namaSuppplier = "Supplier Name";
    }

    private boolean validasiDataProduk() {

        boolean getProduct = dbProduct.cekProduk(namaProduct);
        if (!getProduct) {
            return true;
        }
        exception.getErrorKesalahan("Product telah terdaftar");
        return false;
    }

    private boolean validasiNama() {
        if (!namaProduct.equalsIgnoreCase("Product Name") && !namaProduct.equals("")) {
            if (namaProduct.length() <= 25) {
                return true;
            } else {
                exception.getErrorKesalahan("The Product Name must not exceed 25 digits");
            }
        }
        exception.getErrorKesalahan("All columns must be filled in");
        return false;
    }

    private boolean validasiStok() {
        if (jumlahStock != 0) {
            return true;
        } else {
            exception.getErrorKesalahan("The Stock amount must be more than 0");
        }
        exception.getErrorKesalahan("Invalid stock quantity");
        return false;
    }

    private boolean validasiHarga() {
        if (harga != 0) {
            return true;
        } else {
            exception.getErrorKesalahan("The price amount must be more than 0");
        }
        exception.getErrorKesalahan("Price amount is invalid");
        return false;
    }

    public void addProduct() {
        boolean confirm = exception.confirmSave("Save Product Data?");
        if (validasiDataProduk() && validasiNama() && validasiStok() && validasiHarga()) {
            if (confirm) {
                dbProduct.insertProduct(kategori, idProduct, namaProduct, jumlahStock, idSupplier, harga);
            }
        }
    }

    public void changeProductData() {
        boolean confirm = exception.confirmSave("Change Product Data?");
        if (validasiDataProduk() && validasiNama() && validasiStok() && validasiHarga()) {
            if (confirm) {
                dbProduct.changeDataProduct(kategori, idProduct, namaProduct, jumlahStock, idSupplier, harga);
            }
        }
    }
}
