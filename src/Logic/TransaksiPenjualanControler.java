package Logic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import Data_Acces.DbMember;
import Data_Acces.DbSupplier;
import Data_Acces.DbTransaksi;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TransaksiPenjualanControler {

    private String idTransaksi;
    private String idProduk;
    private String namaProduk;
    private int jumlah;
    private int hargaProduct;
    private String noHpMember;
    private String namaMember;
    private String idMember;
    private int subTotal;
    private int total;
    private Date tanggal;
    private String kodePromo;
    private ConfigTable model;
    private ExceptionHandler exceptionHandler;
    private DbTransaksi dbTransaksi;
    private DbSupplier dbSupplier;
    private DbMember dbMember;
    private ProductControler productControler;
    private PromoContoler promoContoler;

    public TransaksiPenjualanControler(String idTransaksi, String idProduk, String namaProduk, int jumlah, String noHp, int total, String kodePromo) {
        this.idTransaksi = idTransaksi;
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.jumlah = jumlah;
        this.noHpMember = noHp;
        this.total = total;
        this.kodePromo = kodePromo;
        exceptionHandler = new ExceptionHandler();
        dbTransaksi = new DbTransaksi();
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
    public String GenerateIdTransaksi() {
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

    private int ValidateQuantity(JTextField txtQuantity) {
        try {
            int jumlahBeli = Integer.parseInt(txtQuantity.getText());
            return jumlahBeli;
        } catch (NumberFormatException e) {
            exceptionHandler.getErrorKesalahan("Invalid purchase amount!");
        }
        return 0;
    }

    private int ValidatePay(JTextField txtPay) {
        try {
            int jumlahBayar = Integer.parseInt(txtPay.getText());
            return jumlahBayar;
        } catch (NumberFormatException e) {
            exceptionHandler.getErrorKesalahan("Invalid payment amount!");
        }
        return 0;
    }

    private boolean ValidateTotal(int total) {
        try {
            int cekTotal = total;
            return true;
        } catch (NumberFormatException e) {
            exceptionHandler.getErrorKesalahan("Input data produk terlebih dahulu");
        }
        return false;
    }

    private boolean ValidateMember() {
        if (!noHpMember.equalsIgnoreCase("Phone Number")) {
            return true;
        }
        return false;
    }

    // validasi pilihan combo box diskon(blm ke aply)
    public boolean ValidateComboKodeDiskon(JComboBox<String> comboDiskon) {
        String kodeDiskon = (String) comboDiskon.getSelectedItem();
        if (!kodeDiskon.equalsIgnoreCase("Discount Code")) {
            boolean confirm = exceptionHandler.ConfirmDiscount("");
            if (confirm) {
                return true;
            }
        }
        return false;
    }

    // set field nama produk, dan quantity
    public void SetFieldTransaksi(JTextField txtIdProduct, JTextField txtNamaProduct, JTextField txtQuantity) {
        idProduk = txtIdProduct.getText();
        productControler = new ProductControler(null, null, idProduk, null, 0, 0);
        namaProduk = productControler.getNamaProduct();
        if (namaProduk != null) {
            txtNamaProduct.setText(namaProduk);
            txtQuantity.setText("1");
            txtQuantity.requestFocus();
        } else {
            exceptionHandler.getErrorKesalahan("Product with Id" + idProduk + " not found!");
            txtNamaProduct.setText("Product Name");
        }
    }

    // tambahkan data ke tabel
    public Object[] AddToTable(JTextField txtIdProduct, JTextField txtNamaProduct, JTextField txtQuantity, JLabel bg) {
        Object[] data = null;
        idProduk = txtIdProduct.getText();
        namaProduk = txtNamaProduct.getText();
        productControler = new ProductControler(namaProduk, null, idProduk, null, 0, 0);
        jumlah = ValidateQuantity(txtQuantity);
        if (jumlah != 0) {
            hargaProduct = productControler.getHarga();
            subTotal = jumlah * hargaProduct;
            data = new Object[]{idProduk, namaProduk, jumlah, hargaProduct, subTotal};
            txtIdProduct.setText("Product ID");
            txtIdProduct.setForeground(new Color(153, 153, 153));
            txtNamaProduct.setText("Product Name");
            txtQuantity.setText("Quantity");
            bg.requestFocus();
        } else {
            exceptionHandler.getErrorKesalahan("The minimum purchase amount is 1 product");
        }
        return data;
    }

    // perbarui textField total
    public void UpdateTotal(JTable tabel, JTextField txtTotal) {
        total = 0;
        for (int i = 0; i < tabel.getRowCount(); i++) {
            total += Double.parseDouble(tabel.getValueAt(i, 4).toString());
        }
        txtTotal.setText(String.valueOf(total));
        txtTotal.setForeground(Color.BLACK);
    }

    // get kode diskon untuk diset ke combo kode diskon
    public void GetDiskon(JTextField txtNamaMember, JTextField txtTotal, JComboBox<String> comboDiskon) {
        namaMember = txtNamaMember.getText().trim();
        if (!namaMember.equalsIgnoreCase("Member Name")) {
            try {
                int totalBelanja = Integer.parseInt(txtTotal.getText());
                promoContoler = new PromoContoler(null, 0, 0, null);
                    ArrayList<String> GetkodeDiskon = promoContoler.getKodeDiskon(totalBelanja);
                    comboDiskon.removeAllItems();
                    comboDiskon.addItem("Discount Code");
                    comboDiskon.setSelectedItem("Discount Code");
                    for (String kodeDiskon : GetkodeDiskon) {
                        comboDiskon.addItem(kodeDiskon);
                    }
            } catch (NumberFormatException e) {
                exceptionHandler.getErrorKesalahan("Add purchased products to get discounts!");
            }
        }
    }

    public int GetDiscountAmount(JComboBox<String> comboDiskon) {
            if (!kodePromo.equalsIgnoreCase("Discount Code")) {
            boolean confirm = exceptionHandler.ConfirmDiscount("Attention! Are you sure you chose the discount code? Discount codes cannot be changed once they have been used!");
            if (confirm) {
                promoContoler = new PromoContoler(kodePromo, 0, 0, null);
                int jumlahDiskon = promoContoler.GetDiscountAmount();
                exceptionHandler.getSucces("Successfully obtained a discount of Rp. " + jumlahDiskon);
                comboDiskon.setEnabled(false);
                return jumlahDiskon;
            } else {
                comboDiskon.setSelectedItem("Discount Code");
            }
        }
        return 0;
    }

    public void HitungTotal(JTextField txtTotal, int diskon) {
        total = Integer.parseInt(txtTotal.getText());
        int totalAkhir = total - diskon;
        txtTotal.setText(String.valueOf(totalAkhir));
    }
    
    public void HitungKembalian(JTextField txtTotal, JTextField txtPay, JTextField txtRefund){
        total = Integer.parseInt(txtTotal.getText());
        int jumlahBayar = Integer.parseInt(txtPay.getText());
        int hasil;
        if (total > jumlahBayar) {
            hasil = total - jumlahBayar;
            exceptionHandler.getErrorKesalahan("The payment amount is less than Rp. " + hasil);
            txtPay.setForeground(Color.red);
            txtRefund.setText("Refund");
        } else {
            hasil = jumlahBayar - total;
            txtPay.setForeground(Color.BLACK);
            txtRefund.setText("Rp. " +String.valueOf(hasil));
        }
    }

    public void SetTxtNamaMember(JTextField noHpMember, JTextField namaMember, JComboBox<String> cmbKodeDiskon) {
        ArrayList<String> dataMember = dbMember.GetMember(noHpMember.getText());
        if (!dataMember.isEmpty()) {
            namaMember.setText(dataMember.get(1));
        } else {
            namaMember.setText("Member Name");
            exceptionHandler.getErrorKesalahan("Member not found!");
            cmbKodeDiskon.removeAllItems();
            cmbKodeDiskon.addItem("Discount Code");
            cmbKodeDiskon.setSelectedItem("Discount Code");
        }
    }

    public ConfigTable modelTabel() {
        model.addColumn("Product ID");
        model.addColumn("Product Name");
        model.addColumn("Quantity");
        model.addColumn("Price");
        model.addColumn("sub-Total");
        return model;
    }

    public boolean InsertData() {
        if (ValidateNamaProduk() && jumlah != 0) {
            this.tanggal = GetDate();
            boolean confirm = exceptionHandler.confirmSave("Save transactions?");
            if (confirm) {
//                dbTransaksi.AddSaleTransaction(idTransaksi, idProduk, namaProduk, jumlah, idMember, total, tanggal, kodePromo, idUser);
                return true;
            }
        }
        return false;
    }
}
