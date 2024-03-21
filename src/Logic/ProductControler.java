package Logic;

import java.util.ArrayList;
import Data_Acces.*;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ProductControler {

    private String namaProduct;
    private String kategori;
    private String idProduct;
    private String idSupplier;
    private String namaSuppplier;
    private float harga;
    private String barcode;
    private int jumlahStock;
    private String namaLama;
    private ExceptionHandler exception;
    private DbProduct dbProduct;
    private DbSupplier dbSupplier;

    public ProductControler(String namaProduct, String kategori, String idProduct, String idSupplier, float harga, int jumlahStock) {
        this.namaProduct = namaProduct;
        this.kategori = kategori;
        this.idProduct = idProduct;
        this.idSupplier = idSupplier;
        this.harga = harga;
        this.jumlahStock = jumlahStock;
        exception = new ExceptionHandler();
        dbProduct = new DbProduct();
        dbSupplier = new DbSupplier();
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
    public String GenerateIdProduct() {
        if (kategori.equalsIgnoreCase("Accessories")) {
            this.idProduct = "ACS" + GenerateRandom(4);
        } else if (kategori.equalsIgnoreCase("Phone credit/Internet credit")) {
            this.idProduct = "PIC" + GenerateRandom(4);
        } else if (kategori.equalsIgnoreCase("Electronic")) {
            this.idProduct = "ELC" + GenerateRandom(4);
        } else if (kategori.equalsIgnoreCase("Part")) {
            this.idProduct = "PRT" + GenerateRandom(4);
        } else {
            this.idProduct = "Product ID";
        }
        return idProduct;
    }

    //set item combo box id supplier berdasarkan kategori produk
    public void SetIdSupplier(String kategori, JComboBox<String> comboBox) {
        if (kategori != null) {
            try {
                ArrayList<String> getIdSupplier = dbSupplier.GetIdSupplier(kategori);
                comboBox.removeAllItems();
                for (String idSupplier : getIdSupplier) {
                    comboBox.addItem(idSupplier);
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    // set id supplier berdasarkan id produk saat update data
    public String SetSupplierId(String produkId) {
        this.idSupplier = dbProduct.GetSupplierByIdProduk(produkId);
        return idSupplier;
    }

    private boolean ValidasiComboBox() {
        if (!kategori.equalsIgnoreCase("Category")) {
            if (!idSupplier.equalsIgnoreCase("Supplier ID")) {
                return true;
            } else {
                exception.getErrorKesalahan("Please select supplier ID!");
            }
        } else {
            exception.getErrorKesalahan("Please Select a product category!");
        }
        return false;
    }

    // get nama supplier berdasarkan id supplier yang dipilih di combo box
    public String GetSupplierName(String idSupplier) {
        if (idSupplier != null) {
            namaSuppplier = dbSupplier.GetSupplierName(idSupplier);
            if (namaSuppplier != null) {
                return namaSuppplier;
            }
        }
        return namaSuppplier = "Supplier Name";
    }

    // cek apakah data produk telah tersedia
    private boolean ValidasiDataProduk() {
        boolean getProduct = dbProduct.CekProduk(namaProduct);
        if (!getProduct) {
            return true;
        }
        exception.getErrorKesalahan("Product has been registered!");
        return false;
    }

    // validasi nama produk(Insert)
    private boolean ValidasiNama() {
        if (!namaProduct.equalsIgnoreCase("Product Name") && !namaProduct.equals("")) {
            if (namaProduct.length() <= 25) {
                return true;
            } else {
                exception.getErrorKesalahan("The Product Name must not exceed 25 characters!");
            }
        }
        exception.getErrorKesalahan("All columns must be filled in");
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

    // validasi stok
    public int ValidasiStok(JTextField txtStok) {
        try {
            this.jumlahStock = Integer.parseInt(txtStok.getText());
            if (jumlahStock != 0) {
                return jumlahStock;
            } else {
                exception.getErrorKesalahan("The Stock amount must be more than 0");
            }
        } catch (NumberFormatException e) {
            exception.getErrorKesalahan("Invalid stock quantity");;
        }
        return 0;
    }

    // validasi harga produk
    public float ValidasiHarga(JTextField txtHarga) {
        try {
            this.harga = Integer.parseInt(txtHarga.getText());
            if (harga != 0) {
                return harga;
            } else {
                exception.getErrorKesalahan("The price amount must be more than 0");
            }
        } catch (Exception e) {
            exception.getErrorKesalahan("Price amount is invalid");
        }
        return 0;
    }

    public ArrayList<String> IsiStringField(JTable table) {
        int row = table.getSelectedRow();
        ArrayList<String> data = new ArrayList<>();
        String idProduk = table.getValueAt(row, 0).toString();
        String namaProduk = table.getValueAt(row, 1).toString();
        String kategori = table.getValueAt(row, 2).toString();
        data.add(idProduk);
        data.add(namaProduk);
        data.add(kategori);
        return data;
    }

    public ArrayList<Integer> IsiIntField(JTable table) {
        int row = table.getSelectedRow();
        ArrayList<Integer> data = new ArrayList<>();
        int stok = (Integer) table.getValueAt(row, 3);
        int harga = (Integer) table.getValueAt(row, 4);
        data.add(harga);
        data.add(stok);
        return data;
    }

    public boolean ValidateRow(JTable table) {
        int row = table.getSelectedRow();
        if (row != -1) {
            return true;
        } else {
            exception.getErrorKesalahan("Select one of the product data you want to change");
        }
        return false;
    }

    public ConfigTable GetAllData() {
        return dbProduct.GetAllDataProduk();
    }

    // insert data produk
    public boolean InsertProduct() {
        if (ValidasiDataProduk() && ValidasiNama() && jumlahStock != 0 && harga != 0) {
            boolean confirm = exception.confirmSave("Save product data?");
            if (confirm) {
                dbProduct.InsertProduct(kategori, idProduct, namaProduct, jumlahStock, idSupplier, harga);
                return true;
            }
        }
        return false;
    }

    // update data produk
    public boolean ChangeProductData() {
        if (ValidasiComboBox() && ValidateUpdateName() && ValidasiNama() && jumlahStock != 0 && harga != 0) {
            boolean confirm = exception.confirmSave("Save product data changes?");
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
            boolean confirm = exception.confirmDeleteData("Delete Product?");
            idProduct = tabel.getValueAt(getRow, 0).toString();
            if (confirm) {
                dbProduct.DeleteProduk(idProduct);
                return true;
            }
        } else {
            exception.getErrorKesalahan("Select one of the data you want to delete !");
        }
        return false;
    }
}
