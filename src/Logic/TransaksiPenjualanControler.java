package Logic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import Data_Acces.DbTransaksi;

public class TransaksiPenjualanControler {

    private String namaKasir;
    private String idTransaksi;
    private String idProduk;
    private String namaProduk;
    private int jumlah;
    private int hargaProduct;
    private String noHpMember;
    private String namaMember;
    private int subTotal;
    private int total;
    private Date tanggal;
    private String kodePromo;
    private ConfigTable model;
    private ExceptionHandler exceptionHandler;
    private DbTransaksi dbTransaksi;
    private ProductControler productControler;
    private PromoContoler promoContoler;
    private MemberControler memberControler;

    public TransaksiPenjualanControler(String namaKasir, String noHp, int total, String kodePromo) {
        this.namaKasir = namaKasir;
        this.noHpMember = noHp;
        this.total = total;
        this.kodePromo = kodePromo;
        exceptionHandler = new ExceptionHandler();
        dbTransaksi = new DbTransaksi();
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
        return GenerateRandom(11);
    }

    public ConfigTable modelTabel() {
        model.addColumn("Product ID");
        model.addColumn("Product Name");
        model.addColumn("Quantity");
        model.addColumn("Price");
        model.addColumn("sub-Total");
        return model;
    }

    // get tanggal terbaru
    private Date GetDate() {
        return new Date();
    }

    private boolean ValidateMember() {
        if (!noHpMember.equalsIgnoreCase("Phone Number")) {
            return true;
        }
        return false;
    }

    public void SetTxtNamaMember(JTextField txtNoHpMember, JTextField namaMember, JComboBox<String> cmbKodeDiskon) {
        noHpMember = txtNoHpMember.getText();
        if (ValidateMember()) {
            memberControler = new MemberControler(null, noHpMember, null, null);
            ArrayList<String> dataMember = memberControler.GetDataMember();
            if (!dataMember.isEmpty()) {
                namaMember.setText(dataMember.get(1));
            } else {
                namaMember.setText("Member Name");
                exceptionHandler.Kesalahan("Member not found!");
                cmbKodeDiskon.removeAllItems();
                cmbKodeDiskon.addItem("Discount Code");
                cmbKodeDiskon.setSelectedItem("Discount Code");
            }
        }
    }

    // set field nama produk, dan quantity setelah inputan idProduct
    public void SetFieldTransaksi(JTextField txtIdProduct, JTextField txtNamaProduct, JTextField txtQuantity) {
        idProduk = txtIdProduct.getText();
        productControler = new ProductControler(null, idProduk);
        namaProduk = productControler.getNamaProduct(idProduk);
        if (namaProduk != null) {
            txtNamaProduct.setText(namaProduk);
            txtQuantity.setText("1");
            txtQuantity.requestFocus();
            txtQuantity.setForeground(Color.BLACK);
        } else {
            exceptionHandler.Kesalahan("Product with Id" + idProduk + " not found!");
            txtNamaProduct.setText("Product Name");
        }
    }

    private int ValidateStock(String idProduct) {
        productControler = new ProductControler(null, idProduct);
        int stok = productControler.GetJumlahStock();
        return stok;
    }

    // validasi inputan jumlah pembelian
    private int ValidateQuantity(JTextField txtQuantity) {
        try {
            int jumlahBeli = Integer.parseInt(txtQuantity.getText());
            if (jumlahBeli != 0) {
                return jumlahBeli;
            } else {
                exceptionHandler.Kesalahan("The minimum purchase amount is 1 product");
            }
        } catch (NumberFormatException e) {
            exceptionHandler.Kesalahan("Invalid purchase amount!");
        }
        return 0;
    }

    // tambahkan data ke tabel
    public void AddToTable(JTextField txtIdProduct, JTextField txtNamaProduct, JTextField txtQuantity, JLabel bg, JTextField txtNamaMember, JTextField txtTotal, JComboBox<String> comboDiskon, JTable tabel) {
        model = (ConfigTable) tabel.getModel();
        Object[] data = null;
        idProduk = txtIdProduct.getText();
        namaProduk = txtNamaProduct.getText();
        productControler = new ProductControler(null, idProduk);
        int stock = ValidateStock(idProduk);
        if (stock != 0) {
            jumlah = ValidateQuantity(txtQuantity);
            if (jumlah != 0 && stock >= jumlah) {
                hargaProduct = productControler.getHarga();
                subTotal = jumlah * hargaProduct;
                data = new Object[]{idProduk, namaProduk, jumlah, hargaProduct, subTotal};
                txtIdProduct.setText("Product ID");
                txtIdProduct.setForeground(new Color(153, 153, 153));
                txtNamaProduct.setText("Product Name");
                txtQuantity.setText("Quantity");
                txtQuantity.setForeground(new Color(153, 153, 153));
                bg.requestFocus();
                model.addRow(data);
                UpdateTotal(tabel, txtTotal);
                GetDiskon(txtNamaMember, txtTotal, comboDiskon);
            } else {
                exceptionHandler.Kesalahan("Sorry, there are only "+stock+" stocks available");
            }
        } else {
            exceptionHandler.Kesalahan("Sorry, the stock of the product you purchased is not available!");
        }
    }

    // get kode diskon untuk diset ke combo kode diskon
    public void GetDiskon(JTextField txtNamaMember, JTextField txtTotal, JComboBox<String> comboDiskon) {
        namaMember = txtNamaMember.getText().trim();
        if (!namaMember.equalsIgnoreCase("Member Name")) {
            try {
                int totalBelanja = Integer.parseInt(txtTotal.getText());
                promoContoler = new PromoContoler(null, null);
                ArrayList<String> GetkodeDiskon = promoContoler.getKodeDiskon(totalBelanja);               
                comboDiskon.removeAllItems();
                comboDiskon.addItem("Discount Code");
                comboDiskon.setSelectedItem("Discount Code");
                for (String kodeDiskon : GetkodeDiskon) {
                    int jumlahDiskon = promoContoler.GetDiscountAmount(kodeDiskon);
                    comboDiskon.addItem(kodeDiskon + " - Rp. " + jumlahDiskon);
                }
            } catch (NumberFormatException e) {
                exceptionHandler.Kesalahan("Add purchased products to get discounts!");
            }
        }
    }

    // mendapatkan jumlah diskon dari kode diskon yang diapply
    public int GetDiscountAmount(JComboBox<String> comboDiskon) {
        if (!kodePromo.equalsIgnoreCase("Discount Code")) {
            String[] itemCombo = kodePromo.split(" - Rp. ");
            kodePromo = itemCombo[0];
            boolean confirm = exceptionHandler.ConfirmDiscount("Attention! Are you sure you chose the discount code? Discount codes cannot be changed once they have been used!");
            if (confirm) {
                promoContoler = new PromoContoler(kodePromo, null);
                int jumlahDiskon = promoContoler.GetDiscountAmount(kodePromo);
                exceptionHandler.SuccesSaveData("Successfully obtained a discount of Rp. " + jumlahDiskon);
                comboDiskon.setEnabled(false);
                return jumlahDiskon;
            } else {
                comboDiskon.setSelectedItem("Discount Code");
            }
        }
        return 0;
    }

    // perbarui textField total
    private void UpdateTotal(JTable tabel, JTextField txtTotal) {
        total = 0;
        for (int i = 0; i < tabel.getRowCount(); i++) {
            total += Double.parseDouble(tabel.getValueAt(i, 4).toString());
        }
        txtTotal.setText(String.valueOf(total));
    }

    // menghitung total yang harus dibayar
    public void HitungTotal(JTextField txtTotal, int diskon) {
        total = Integer.parseInt(txtTotal.getText());
        int totalAkhir = total - diskon;
        txtTotal.setText(String.valueOf(totalAkhir));
    }

    // menghitung kembalian
    public void HitungKembalian(JTextField txtTotal, JTextField txtPay, JTextField txtRefund) {
        total = Integer.parseInt(txtTotal.getText());
        int jumlahBayar = ValidatePay(txtPay);
        int hasil;
        if (jumlahBayar != 0) {
            if (total > jumlahBayar) {
                hasil = total - jumlahBayar;
                exceptionHandler.Kesalahan("The payment amount is less than Rp. " + hasil);
                txtPay.setForeground(Color.red);
                txtRefund.setText("Refund");
            } else {
                hasil = jumlahBayar - total;
                txtPay.setForeground(Color.BLACK);
                txtRefund.setText(String.valueOf(hasil));
            }
        }
    }

    private int ValidatePay(JTextField txtPay) {
        try {
            int jumlahBayar = Integer.parseInt(txtPay.getText());
            return jumlahBayar;
        } catch (NumberFormatException e) {
            exceptionHandler.Kesalahan("Invalid payment amount!");
        }
        return 0;
    }
    
    public void ClearDataTransaksi(JTable table, JTextField txtNamaMember, JTextField txtNoHpMember, JTextField txtTotal, JTextField txtPay, JTextField txtRefund, JComboBox<String> cmbDiskon){
        model = (ConfigTable) table.getModel();
        model.setRowCount(0);
        txtNamaMember.setText("Member Name");
        txtNoHpMember.setText("Member Telephone Number");
        txtTotal.setText("Total");
        txtPay.setText("Pay");
        txtRefund.setText("Refund");
        cmbDiskon.removeAllItems();
        cmbDiskon.addItem("Discount Code");
        cmbDiskon.setSelectedItem("Discount Code");
        cmbDiskon.setEnabled(true);
        txtNamaMember.setForeground(new Color(153,153,153));
        txtNoHpMember.setForeground(new Color(153,153,153));
        txtTotal.setForeground(new Color(153,153,153));
        txtPay.setForeground(new Color(153,153,153));
        txtRefund.setForeground(new Color(153,153,153));
    }

    public void DeleteDataTransakssi(JTable tabel, JTextField txtTotal) {
        int getRow = tabel.getSelectedRow();
        if (getRow != -1) {
            boolean confirm = exceptionHandler.ConfirmDeleteData("Remove a product from your purchase list?");
            if (confirm) {
                ConfigTable modelTable = (ConfigTable) tabel.getModel();
                modelTable.removeRow(getRow);
                UpdateTotal(tabel, txtTotal);
            }
        } else {
            exceptionHandler.Kesalahan("Please select a row to delete");
        }
    }

    private void InsertDetailTransaksi(JTable table, String idTransaksi) {
        model = (ConfigTable) table.getModel();
        try {
            for (int row = 0; row < model.getRowCount(); row++) {
                idProduk = (String) model.getValueAt(row, 0);
                jumlah = (int) model.getValueAt(row, 2);
                subTotal = (int) model.getValueAt(row, 4);
                dbTransaksi.InsertDetailTransaksi(idTransaksi, idProduk, jumlah, subTotal, tanggal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void InsertTransaksiMember(String idTransaksi) {
        memberControler = new MemberControler(null, noHpMember, null, null);
        ArrayList<String> dataMember = memberControler.GetDataMember();
        String idMember = dataMember.get(0);
        dbTransaksi.InsertTransaksiMember(idTransaksi, idMember);
    }

    private void InsertDetailTransaksiDiskon(String idTransaksi, int jumlahDiskon) {
        String[] itemKombo = kodePromo.split(" - Rp. ");
        kodePromo = itemKombo[0];
        dbTransaksi.InsertDetailTransaksiDiskon(idTransaksi, kodePromo, jumlahDiskon);
    }

    public boolean InsertTransaksiPenjualan(JTable table, int jumlahDiskon, String namaMember, JTextField txtPay, JTextField txtReturn, String idUser) {
        this.tanggal = GetDate();
        this.idTransaksi = GenerateIdTransaksi();
        int pay = Integer.parseInt(txtPay.getText());
        int kembalian = Integer.parseInt(txtReturn.getText());
        boolean confirm = exceptionHandler.ConfirmSave("Save transactions?");
        if (confirm) {
            dbTransaksi.InsertTransaksi(idTransaksi, tanggal, total, idUser);
            InsertDetailTransaksi(table, idTransaksi);
            if (!namaMember.equalsIgnoreCase("Member Name")) {
                InsertTransaksiMember(idTransaksi);
                if (!kodePromo.equalsIgnoreCase("Discount ID")) {               
                    InsertDetailTransaksiDiskon(idTransaksi, jumlahDiskon);
                }
            }
            dbTransaksi.PrintStrukPenjualan(idTransaksi, namaKasir, namaMember, total, jumlahDiskon, pay, kembalian, kodePromo);
            return true;
        }
        return false;
    }
}
