package Logic;

import Data_Acces.DbTransaksi;
import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Random;

public class TransaksiServiceControler {

    private String idTransaksi;
    private String idProduct;
    private String namaProduk;
    private int hargaProduct;
    private String information;
    private int biaya;
    private int kuantitas;
    private int subTotal;
    private int total;
    private int jumlahBayar;
    private String namaCustomer;
    private String noHpCustomer;
    private String alamatCustomer;
    private Date tanggal;
    private ExceptionHandler exceptionHandler;
    private ConfigTable model;
    private DbTransaksi dbTransaksi;
    private ProductControler productControler;

    public TransaksiServiceControler(String information, String idProduct, String namaProduk, int kuantitas, int biaya, int total, String namaCustomer, String noHpCustomer, String alamatCustomer) {
        this.information = information;
        this.biaya = biaya;
        this.total = total;
        this.namaCustomer = namaCustomer;
        this.noHpCustomer = noHpCustomer;
        this.alamatCustomer = alamatCustomer;
        this.idProduct = idProduct;
        this.namaProduk = namaProduk;
        this.kuantitas = kuantitas;
        exceptionHandler = new ExceptionHandler();
        model = new ConfigTable();
        dbTransaksi = new DbTransaksi();
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

    // get tanggal terbaru
    private Date GetDate() {
        return new Date();
    }

    private boolean ValidateInformation() {
        if (!information.equalsIgnoreCase("Information") && !information.equalsIgnoreCase("")) {
            return true;
        }
        exceptionHandler.Kesalahan("The information column cannot be empty");
        return false;
    }

    public int ValidateBiaya(JTextField txtBiaya) {
        try {
            biaya = Integer.parseInt(txtBiaya.getText());
            if (biaya != 0) {
                return biaya;
            } else {
                exceptionHandler.Kesalahan("The total service fee must be more than 0!");
            }
        } catch (NumberFormatException e) {
            exceptionHandler.Kesalahan("Service fee amount is invalid!");
        }
        return 0;
    }

    public int ValidateQuantity(JTextField txtQuantity) {
        try {
            kuantitas = Integer.parseInt(txtQuantity.getText());
            if (kuantitas != 0) {
                return kuantitas;
            } else {
                exceptionHandler.Kesalahan("The quantity value must be greater than 0!");
            }
        } catch (NumberFormatException e) {
            exceptionHandler.Kesalahan("Invalid quantity value!");
        }
        return 0;
    }

    private boolean ValidateNamaCustomer() {
        if (!namaCustomer.equalsIgnoreCase("Customer Name")) {
            return true;
        } else {
            exceptionHandler.Kesalahan("Invalid customer name!");
        }
        return false;
    }

    private boolean ValidateAlamatCustomer() {
        if (!alamatCustomer.equalsIgnoreCase("Customer Address")) {
            return true;
        } else {
            exceptionHandler.Kesalahan("Invalid customer address!");
        }
        return false;
    }

    private boolean ValidateNoHpCustomer() {
        if (!noHpCustomer.equalsIgnoreCase("Customer Telephone Number")) {
            return true;
        } else {
            exceptionHandler.Kesalahan("Customer phone number is invalid!");
        }
        return false;
    }

    public int ValidatePayment(JTextField txtPayment) {
        try {
            jumlahBayar = Integer.parseInt(txtPayment.getText());
            if (jumlahBayar != 0 && jumlahBayar >= total) {
                return jumlahBayar;
            } else {
                exceptionHandler.Kesalahan("The payment amount must be greater than 0 and the total purchase!");
            }
        } catch (NumberFormatException e) {
            exceptionHandler.Kesalahan("Invalid payment amount!");
        }
        return jumlahBayar = 0;
    }

    private Object[] GetDataService() {
        Object[] data = null;
        if (ValidateInformation() && biaya != 0) {
            kuantitas = 1;
            idProduct = "0000SRVC";
            subTotal = kuantitas * biaya;
            data = new Object[]{idProduct, information, kuantitas, biaya, subTotal};
        }
        return data;
    }

    private Object[] GetDataPart() {
        Object[] dataPart = null;
        productControler = new ProductControler(null, idProduct);
        int stock = productControler.GetJumlahStock();
        if (stock != 0) {
            if (stock >= kuantitas) {
                if (!namaProduk.trim().equalsIgnoreCase("Product Name") && !namaProduk.trim().equalsIgnoreCase("")) {
                    subTotal = kuantitas * biaya;
                    dataPart = new Object[]{idProduct, namaProduk, kuantitas, biaya, subTotal};
                } else {
                    exceptionHandler.Kesalahan("All fields must be filled in!");
                }
            } else {
                exceptionHandler.Kesalahan("Sorry, there are only "+stock+" stocks available");
            }
        } else {
            exceptionHandler.Kesalahan("Sorry, the stock of the product you purchased is not available!");
        }
        return dataPart;
    }

    // isi field tambah part berdasarkan id product
    public void SetDataPart(JTextField txtIdProduct, JTextField txtNamaProduct, JTextField txtHarga, JTextField txtQuantity) {
        idProduct = txtIdProduct.getText();
        productControler = new ProductControler(null, idProduct);
        namaProduk = productControler.getNamaProduct(idProduct);
        hargaProduct = productControler.getHarga();
        if (namaProduk != null) {
            txtNamaProduct.setText(namaProduk);
            txtHarga.setText(String.valueOf(hargaProduct));
            txtQuantity.setText("1");
            txtQuantity.setForeground(Color.BLACK);
            txtQuantity.requestFocus();
        } else {
            exceptionHandler.Kesalahan("Product not found!");
            txtNamaProduct.setText("Product Name");
            txtHarga.setText("Price");
            txtQuantity.setText("Quantity");
            txtNamaProduct.setForeground(new Color(153, 153, 153));
            txtHarga.setForeground(new Color(153, 153, 153));
            txtQuantity.setForeground(new Color(153, 153, 153));
        }
    }

    public void AddDataServiceToTable(JTable table, JTextField txtInformasi, JTextField txtBiaya) {
        model = (ConfigTable) table.getModel();
        if (GetDataService() != null) {
            model.addRow(GetDataService());
            txtInformasi.setText("Information");
            txtBiaya.setText("Cost");
            txtInformasi.setForeground(new Color(153, 153, 153));
            txtBiaya.setForeground(new Color(153, 153, 153));
        }
    }

    public boolean AddDataPart(JTable table, JTextField txtQuantity) {
        model = (ConfigTable) table.getModel();
        if (ValidateQuantity(txtQuantity) != 0 && GetDataPart() != null) {
            model.addRow(GetDataPart());
            return true;
        }
        return false;
    }

    public void UpdateTotal(JTable tabel, JTextField txttotal) {
        total = 0;
        for (int i = 0; i < tabel.getRowCount(); i++) {
            total += Double.parseDouble(tabel.getValueAt(i, 4).toString());
        }
        txttotal.setText(String.valueOf(total));
    }

    public void ClearDataTransaksi(JTextField txtInformasi, JTextField txtBiaya, JTextField txtNamaCustomer, JTextField txtNoHpCustomer, JTextField txtAlamat, JTextField txtTotal, JTextField txtPay, JTextField txtRefund, JTable table) {
        txtInformasi.setText("Information");
        txtBiaya.setText("Cost");
        txtNamaCustomer.setText("Customer Name");
        txtNoHpCustomer.setText("Customer Telephone Number");
        txtAlamat.setText("Customer Address");
        txtTotal.setText("Total");
        txtPay.setText("Pay");
        txtRefund.setText("Refund");
        model = (ConfigTable) table.getModel();
        model.setRowCount(0);
        txtInformasi.setForeground(new Color(153, 153, 153));
        txtBiaya.setForeground(new Color(153, 153, 153));
        txtNamaCustomer.setForeground(new Color(153, 153, 153));
        txtNoHpCustomer.setForeground(new Color(153, 153, 153));
        txtAlamat.setForeground(new Color(153, 153, 153));
        txtTotal.setForeground(new Color(153, 153, 153));
        txtPay.setForeground(new Color(153, 153, 153));
        txtRefund.setForeground(new Color(153, 153, 153));
    }

    public void HitungKembalian(JTextField txtTotal, JTextField txtBayar, JTextField txtKembalian) {
        jumlahBayar = Integer.parseInt(txtBayar.getText());
        int kembalian = 0;
        if (total > jumlahBayar) {
            kembalian = total - jumlahBayar;
            exceptionHandler.Kesalahan("The payment amount is less than Rp. " + kembalian);
            txtBayar.setForeground(Color.red);
            txtKembalian.setText("Refund");
        } else {
            kembalian = jumlahBayar - total;
            txtBayar.setForeground(Color.black);
            txtKembalian.setText(String.valueOf(kembalian));
        }
    }

    public ConfigTable modelTable() {
        model.addColumn("Product ID");
        model.addColumn("Product Name/Information");
        model.addColumn("Quantity");
        model.addColumn("Price");
        model.addColumn("Sub-Total");
        return model;
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

    public boolean InsertTransaksi(JTable tabel, String namaTeknisi, int total, int pay, int kembalian, String idUser) {
        this.idTransaksi = GenerateIdTransaksi();
        this.tanggal = GetDate();
        ConfigTable modelTable = (ConfigTable) tabel.getModel();
        if (ValidateNamaCustomer() && ValidateNoHpCustomer() && ValidateAlamatCustomer()) {
            if (jumlahBayar != 0) {
                boolean confirm = exceptionHandler.ConfirmSave("Save Transactions?");
                if (confirm) {
                    try {
                        dbTransaksi.InsertTransaksi(idTransaksi, tanggal, total, idUser);
                        for (int i = 0; i < modelTable.getRowCount(); i++) {
                            idProduct = (String) modelTable.getValueAt(i, 0);
                            namaProduk = (String) modelTable.getValueAt(i, 1);
                            kuantitas = (int) modelTable.getValueAt(i, 2);
                            hargaProduct = (int) modelTable.getValueAt(i, 3);
                            subTotal = hargaProduct * kuantitas;
                            if (idProduct.equalsIgnoreCase("0000SRVC")) {
                                dbTransaksi.InsertTransaksiService(idTransaksi, namaProduk, namaCustomer, noHpCustomer, alamatCustomer, subTotal, tanggal);
                            } else {
                                dbTransaksi.InsertDetailTransaksi(idTransaksi, idProduct, kuantitas, subTotal, tanggal);
                            }
                        }
                        dbTransaksi.PrintStrukService(idTransaksi, namaTeknisi, total, pay, kembalian);
                        return true;
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
        }
        return false;
    }
}
