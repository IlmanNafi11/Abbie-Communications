package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;

public class DbLaporan {
    private ExceptionHandler exceptionHandler;
    
    private void HitungPemasukanPenjualan(){
        String queryTotal = "SELECT tanggal, SUM(subtotal) AS total_subtotal FROM transaksi_detail GROUP BY tanggal";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stTotal = koneksi.prepareStatement(queryTotal);
            stTotal.executeQuery();
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("There was a failure when calculating total sales revenue!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
    }
    
    private void HitungPemasukanService(){
        String queryTotal = "SELECT tanggal, SUM(biaya) AS total_biaya FROM transaksi_service GROUP BY tanggal";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stTotal = koneksi.prepareStatement(queryTotal);
            stTotal.executeQuery();
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("A failure occurred while calculating the total service income");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
    }
    
    private void HitungPemasukanRestock(){
        String queryTotal = "SELECT tanggal, SUM(total) AS total_restock FROM restock GROUP BY tanggal";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stTotal = koneksi.prepareStatement(queryTotal);
            stTotal.executeQuery();
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("A failure occurred while calculating total expenses");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
    }
    
    public void InsertLaporan(String idUser){
        String queryInsert = "INSERT IGNORE INTO laporan(id_user, tanggal, pemasukan_penjualan, pemasukan_service, jumlah_pengeluaran)" +
                "SELECT ?, tanggal, COALESCE((SELECT SUM(subtotal) FROM transaksi_detail WHERE tanggal = l.tanggal), 0) AS pemasukan_penjualan, " +
                "COALESCE((SELECT SUM(biaya) FROM transaksi_servis WHERE tanggal = l.tanggal), 0) AS pemasukan_service, " +
                "COALESCE((SELECT SUM(total) FROM restock WHERE tanggal = l.tanggal), 0) AS jumlah_pengeluaran " +
                "FROM (SELECT DISTINCT tanggal FROM transaksi_detail UNION SELECT DISTINCT tanggal FROM transaksi_servis UNION SELECT DISTINCT tanggal FROM restock) AS l " +
                "ON DUPLICATE KEY UPDATE pemasukan_penjualan = VALUES(pemasukan_penjualan), pemasukan_service = VALUES(pemasukan_service), jumlah_pengeluaran = VALUES(jumlah_pengeluaran)";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idUser);
            stInsert.executeUpdate();
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Gagal" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
    }
    
    public ConfigTable GetDataLaporan(){
    exceptionHandler = new ExceptionHandler();
    ConfigTable dataTable = new ConfigTable();
    String queryGetData = "SELECT * FROM laporan";
    dataTable.addColumn("REPORT ID");
    dataTable.addColumn("DATE");
    dataTable.addColumn("Sales income");
    dataTable.addColumn("Service revenue");
    dataTable.addColumn("Expenditure");
    Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(queryGetData);
            ResultSet rs = stGet.executeQuery();
            while(rs.next()){
                dataTable.addRow(new Object[]{
                    rs.getInt("id_laporan"),
                    rs.getDate("tanggal"),
                    rs.getInt("pemasukan_penjualan"),
                    rs.getInt("pemasukan_service"),
                    rs.getInt("jumlah_pengeluaran")
                });
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("A failure occurred when trying to retrieve report data" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!" + e.getMessage());
                }
            }
        }
        return dataTable;
    }
}
