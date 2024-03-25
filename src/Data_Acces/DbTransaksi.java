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
    
    public void InsertTransaksi(String idTransaksi, Date tanggal, float total){
        exceptionHandler = new ExceptionHandler();
        String queryInsert = "INSERT INTO transaksi (id_transaksi, tanggal, total) VALUES (?, ?, ?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idTransaksi);
            stInsert.setDate(2, (java.sql.Date) tanggal);
            stInsert.setFloat(3, total);
            stInsert.executeUpdate();
            exceptionHandler.getSucces("Transaction successful!");
        } catch (Exception e) {
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
    
    public void InsertDetailTransaksi(String idTransaksi, String idProduct, int jumlah, float subTotal){
        exceptionHandler = new ExceptionHandler();
        String queryInsert = "INSERT INTO transaksi_detail (id_transaksi, product_id, quantity, subtotal) VALUES (?,?,?,?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idTransaksi);
            stInsert.setString(2, idProduct);
            stInsert.setInt(3, jumlah);
            stInsert.setFloat(4, subTotal);
            stInsert.executeUpdate();
            // konfirmasi
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("A failure occurred while trying to save transaction details!" + e.getMessage());
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
    
    public void InsertTransaksiMember(String idTransaksi, String id_member){
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
    
    public void InsertDetailTransaksiDiskon(String idTransaksi, String kodeDiskon, float totalDiskon){
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
}
