package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Logic.*;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class DbTransaksi {

    private ExceptionHandler exceptionHandler;

    public void InsertTransaksi(String idTransaksi, Date tanggal, int total) {
        exceptionHandler = new ExceptionHandler();
        String queryInsert = "INSERT INTO transaksi (id_transaksi, tanggal, total) VALUES (?, ?, ?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idTransaksi);
            stInsert.setDate(2, new java.sql.Date(tanggal.getTime()));
            stInsert.setInt(3, total);
            stInsert.executeUpdate();
            exceptionHandler.SuccesSaveData("Transaction successful!");
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("A failure occurred while trying to save the transaction!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection! ");
                }
            }
        }
    }

    public void InsertDetailTransaksi(String idTransaksi, String idProduct, int jumlah, int subTotal, Date tanggal) {
        exceptionHandler = new ExceptionHandler();
        String queryInsert = "INSERT INTO transaksi_detail (id_transaksi, product_id, quantity, subtotal, tanggal) VALUES (?, ?, ?, ?, ?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idTransaksi);
            stInsert.setString(2, idProduct);
            stInsert.setInt(3, jumlah);
            stInsert.setInt(4, subTotal);
            stInsert.setDate(5, new java.sql.Date(tanggal.getTime()));
            stInsert.executeUpdate();
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("A failure occurred while trying to save transaction details!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
    }

    public void InsertTransaksiMember(String idTransaksi, String id_member) {
        exceptionHandler = new ExceptionHandler();
        String queryInsert = "INSERT INTO transaksi_member (id_transaksi, id_member) VALUES (?,?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idTransaksi);
            stInsert.setString(2, id_member);
            stInsert.executeUpdate();
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("A failure occurred while trying to save member transactions!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
    }

    public void InsertDetailTransaksiDiskon(String idTransaksi, String kodeDiskon, float totalDiskon) {
        exceptionHandler = new ExceptionHandler();
        String queryInsert = "INSERT INTO detail_transaksi_diskon (id_transaksi, kode_diskon, total_diskon) VALUES (?,?,?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idTransaksi);
            stInsert.setString(2, kodeDiskon);
            stInsert.setFloat(3, totalDiskon);
            stInsert.executeUpdate();
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("A failure occurred while trying to save discount transaction details!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
    }

    public void InsertTransaksiService(String idTransaksi, String keterangan, String namaCustomer, String noHp, String alamat, int biaya, Date tanggal) {
        exceptionHandler = new ExceptionHandler();
        String queryInsert = "INSERT INTO transaksi_servis (id_transaksi, keterangan, nama_customer, tlp_customer, alamat_customer, biaya, tanggal) VALUES(?, ?, ?, ?, ?, ?, ?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idTransaksi);
            stInsert.setString(2, keterangan);
            stInsert.setString(3, namaCustomer);
            stInsert.setString(4, noHp);
            stInsert.setString(5, alamat);
            stInsert.setInt(6, biaya);
            stInsert.setDate(7, new java.sql.Date(tanggal.getTime()));
            stInsert.executeUpdate();
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("A failure occurred while trying to save service transaction data!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
    }

    public void PrintStrukPenjualan(String idTransaksi, String namaKasir, String namaMember, int total, int diskon, int tunai, int kembalian, String kodePromo) {
        Connection koneksi = null;
        String member = "Not a member";
        int jumlahDiskon = 0;
        if (!namaMember.equalsIgnoreCase("Member Name")) {
            member = namaMember;
            if (!kodePromo.equalsIgnoreCase("Discount ID")) {
                jumlahDiskon = diskon;
            }
        }
        try {
            koneksi = ClassKoneksi.GetConnection();
            InputStream path = getClass().getResourceAsStream("/report/StrukPenjualan.jasper");
            Map<String, Object> parameter = new HashMap<>();
            parameter.put("idTransaksi", idTransaksi);
            parameter.put("kasir", namaKasir);
            parameter.put("member", member);
            parameter.put("total", total);
            parameter.put("diskon", jumlahDiskon);
            parameter.put("tunai", tunai);
            parameter.put("kembalian", kembalian);
            JasperPrint jasperPrint = JasperFillManager.fillReport(path, parameter, koneksi);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred when printing the transaction receipt");
            e.printStackTrace();
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
    }

    public void PrintStrukService(String idTransaksi, String namaTeknisi, int total, int tunai, int kembalian) {
        exceptionHandler = new ExceptionHandler();
        String id = idTransaksi;
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            InputStream path = getClass().getResourceAsStream("/report/StrukService.jasper");
            Map<String, Object> parameter = new HashMap<>();
            parameter.put("idTransaksi", id);
            parameter.put("teknisi", namaTeknisi);
            parameter.put("total", total);
            parameter.put("tunai", tunai);
            parameter.put("kembalian", kembalian);
            JasperPrint jasperPrint = JasperFillManager.fillReport(path, parameter, koneksi);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred while trying to print a transaction receipt!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
    }
}
