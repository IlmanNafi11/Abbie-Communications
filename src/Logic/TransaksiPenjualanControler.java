package Logic;

import Data_Acces.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TransaksiPenjualanControler {

    private String idTransaksi;
    private String idProduk;
    private String namaProduk;
    private int jumlah;
    private String noHpMember;
    private String namaMember;
    private String idMember;
    private float total;
    private Date tanggal;
    private String kodePromo;
    private String idUser;
    private ConfigTable model;
    private ExceptionHandler exceptionHandler;
    private DbTransaksi dbTransaksi;
    private DbProduct dbProduct;
    private DbSupplier dbSupplier;
    private DbMember dbMember;

    public TransaksiPenjualanControler(String idTransaksi, String idProduk, String namaProduk, int jumlah, String noHp, float total, Date tanggal, String kodePromo, String idUser) {
        this.idTransaksi = idTransaksi;
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.jumlah = jumlah;
        this.noHpMember = noHp;
        this.total = total;
        this.tanggal = tanggal;
        this.kodePromo = kodePromo;
        this.idUser = idUser;
        exceptionHandler = new ExceptionHandler();
        dbTransaksi = new DbTransaksi();
        dbProduct = new DbProduct();
        dbSupplier = new DbSupplier();
        dbMember = new DbMember();
        model = new ConfigTable();
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

    // generate id transaksi
    public String GenerateIdProduct() {
        return idTransaksi = "TRP" + GenerateRandom(4);
    }

    // get tanggal terbaru
    private Date GetDate() {
        return new Date();
    }

    private boolean ValidateNamaProduk() {
        if (!namaProduk.equalsIgnoreCase("Product Name") && !namaProduk.equals("")) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Please choose one of the product ID!");
            return false;
        }
    }

    public int ValidateQuantity(JTextField txtQuantity) {
        try {
            int jumlahBeli = Integer.parseInt(txtQuantity.getText());
            if (jumlahBeli != 0) {
                return jumlahBeli;
            }
        } catch (NumberFormatException e) {
            exceptionHandler.getErrorKesalahan("Invalid purchase amount!");
        }
        return 0;
    }

    // set comboBox id produk berdasarkan kategorinya
    public void SetComboProdukId(JComboBox<String> comboBoxKategori, JComboBox<String> comboBoxId) {
        String Getkategori = (String) comboBoxKategori.getSelectedItem();
        if (Getkategori != null) {
            try {
                ArrayList<String> getIdProduk = dbProduct.GetIdProduk(Getkategori);
                comboBoxId.removeAllItems();
                comboBoxId.addItem("Product ID");
                for (String idProduk : getIdProduk) {
                    comboBoxId.addItem(idProduk);
                    comboBoxId.setSelectedItem("Product ID");
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }

    }

    public void SetTxtProdukName(String idProduct, JTextField txtProdukName) {
        if (idProduct != "Product ID") {
            namaProduk = dbProduct.GetProdukName(idProduct);
            txtProdukName.setText(namaProduk);
        } else {
            txtProdukName.setText("Product Name");
        }
    }

    public void SetTxtQuantity(JTextField txtNamaProduct, JTextField txtQuantity) {
        String namaProduk = txtNamaProduct.getText();
        if (!namaProduk.equalsIgnoreCase("Product Name")) {
            txtQuantity.setText("1");
        } else {
            txtQuantity.setText("Quantity");
        }
    }

    public void SetTxtNamaMember(JTextField noHpMember, JTextField namaMember) {
        ArrayList<String> dataMember = dbMember.GekMember(noHpMember.getText());
        if (!dataMember.isEmpty()) {
            namaMember.setText(dataMember.get(1));
        } else {
            namaMember.setText("Member Name");
            exceptionHandler.getErrorKesalahan("Member not found!");
        }
    }

    public ConfigTable modelTabel() {
        model.addColumn("Product Name");
        model.addColumn("Quantity");
        model.addColumn("Price");
        return model;
    }

    public int GetHargaProduk(String idProduk) {
        return dbProduct.GetPrice(idProduk);
    }

    public boolean InsertData() {
        if (ValidateNamaProduk() && jumlah != 0) {
            this.tanggal = GetDate();
            boolean confirm = exceptionHandler.confirmSave("Save transactions?");
            if (confirm) {
                dbTransaksi.AddSaleTransaction(idTransaksi, idProduk, namaProduk, jumlah, idMember, total, tanggal, kodePromo, idUser);
                return true;
            }
        }
        return false;
    }
}
