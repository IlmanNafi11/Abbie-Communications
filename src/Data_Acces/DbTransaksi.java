package Data_Acces;

import Connections.ClassKoneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Logic.*;

import java.util.ArrayList;
import java.util.Date;

public class DbTransaksi {
    private ExceptionHandler exceptionHandler;

    public void InsertTransaksi(String idTransaksi, Date tanggal, float total) {
        exceptionHandler = new ExceptionHandler();
        String queryInsert = "INSERT INTO transaksi (id_transaksi, tanggal, total) VALUES (?, ?, ?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idTransaksi);
            stInsert.setDate(2, new java.sql.Date(tanggal.getTime()));
            stInsert.setFloat(3, total);
            stInsert.executeUpdate();
            exceptionHandler.getSucces("Transaction successful!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            exceptionHandler.getErrorKesalahan("A failure occurred while trying to save the transaction!" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
                }
            }
        }
    }

    public void InsertDetailTransaksi(String idTransaksi, String idProduct, int jumlah, float subTotal, Date tanggal) {
        exceptionHandler = new ExceptionHandler();
        String queryInsert = "INSERT INTO transaksi_detail (id_transaksi, product_id, quantity, subtotal, tanggal) VALUES (?, ?, ?, ?, ?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idTransaksi);
            stInsert.setString(2, idProduct);
            stInsert.setInt(3, jumlah);
            stInsert.setFloat(4, subTotal);
            stInsert.setDate(5, new java.sql.Date(tanggal.getTime()));
            stInsert.executeUpdate();
            // konfirmasi
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("A failure occurred while trying to save transaction details!" + e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
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
            // konfirmasi
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("A failure occurred while trying to save member transactions!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
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
            // konfirmasi
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("A failure occurred while trying to save discount transaction details!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
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
            stInsert.setString(4, alamat);
            stInsert.setString(5, noHp);
            stInsert.setInt(6, biaya);
            stInsert.setDate(7, new java.sql.Date(tanggal.getTime()));
            stInsert.executeUpdate();
            exceptionHandler.getSucces("Transaction successful!");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Gagal insert data " + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! \" + e.getMessage()");
                }
            }
        }
    }
}
