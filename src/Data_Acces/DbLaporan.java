package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;
import java.util.ArrayList;
import java.util.Date;

public class DbLaporan {
    private ExceptionHandler exceptionHandler;
    
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
            exceptionHandler.Kesalahan("A failure occurred when trying to add report data");
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
    
    public ArrayList<Object[]> GetDataLaporan(int bulan, int tahun) {
        ArrayList<Object[]> listLaporan = new ArrayList<>();
        exceptionHandler = new ExceptionHandler();
        String queryGetData = "SELECT * FROM laporan WHERE MONTH(tanggal) = ? AND  YEAR(tanggal) = ?;";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(queryGetData);
            stGet.setInt(1, bulan);
            stGet.setInt(2, tahun);
            ResultSet rs = stGet.executeQuery();
            while (rs.next()) {
                int idLaporan = rs.getInt("id_laporan");
                Date tanggal = rs.getDate("tanggal");
                int incomePenjualan = rs.getInt("pemasukan_penjualan");
                int incomeServis = rs.getInt("pemasukan_service");
                int pengeluaran = rs.getInt("jumlah_pengeluaran");
                Object[] data = new Object[]{idLaporan, tanggal, incomePenjualan, incomeServis, pengeluaran};
                listLaporan.add(data);
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred when trying to retrieve report data");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return listLaporan;
    }
}
