package Data_Acces;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import Logic.*;
import Connections.ClassKoneksi;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class DbDashboard {
    private ExceptionHandler exceptionHandler;

    public DbDashboard() {
        exceptionHandler = new ExceptionHandler();
    }
    
    
    public int GetTotalMember() {
        Connection koneksi = null;
        String sqlGetData ="SELECT COUNT(*) AS total_member FROM member";
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(sqlGetData);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {                
                return rs.getInt("total_member");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed in the process of adding up the total members");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return 0;
    }
    
    public int GetTotalProductSold(LocalDate tanggal){
        Connection koneksi = null;
        String sqlGetData = "SELECT SUM(quantity) AS total_sold FROM transaksi_detail WHERE tanggal = ?";
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(sqlGetData);
            stGet.setDate(1, java.sql.Date.valueOf(tanggal));
            ResultSet rs = stGet.executeQuery();
            while (rs.next()) {                
                return rs.getInt("total_sold");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed in the process of adding up the total product sold");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return 0;   
    }
    
    public double GetTotalPemasukan(LocalDate tanggal){
        Connection koneksi = null;
        double total = 0;
        String sqlGetData = "SELECT SUM(pemasukan_penjualan) AS total_penjualan, SUM(pemasukan_service) AS total_service FROM laporan WHERE tanggal = ?";
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(sqlGetData);
            stGet.setDate(1, java.sql.Date.valueOf(tanggal));
            ResultSet rs = stGet.executeQuery();
            while (rs.next()) {              
                total = rs.getDouble("total_penjualan") + rs.getDouble("total_service");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed in the process of adding up the total product sold");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return total; 
    }
    
    public double GetTotalPengeluaran(LocalDate tanggal){
        Connection koneksi = null;
        double total = 0;
        String sqlGetData = "SELECT jumlah_pengeluaran FROM laporan WHERE tanggal = ?";
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(sqlGetData);
            stGet.setDate(1, java.sql.Date.valueOf(tanggal));
            ResultSet rs = stGet.executeQuery();
            while (rs.next()) {   
                total = rs.getDouble("jumlah_pengeluaran");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed in the process of adding up the total product sold");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return total;
    }
    
    public ArrayList<Object[]> GetTransaksiDetailData(Date tgl){
        Object []data = null;
        Connection koneksi = null;
        ArrayList<Object[]> listData = new ArrayList<>();
        String sqlGetData = "SELECT td.id_transaksi, td.subtotal, td.tanggal, prod.nama_produk FROM transaksi_detail td INNER JOIN produk prod ON td.product_id = prod.id_produk WHERE DATE(td.tanggal) = ?";
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(sqlGetData);
            stGet.setDate(1, new java.sql.Date(tgl.getTime()));
            ResultSet rs = stGet.executeQuery();
            while (rs.next()) {
                String idTransaksi = rs.getString("id_transaksi");
                String namaProduk = rs.getString("nama_produk");
                double subTotal = rs.getDouble("subtotal");
                Date tanggal = rs.getDate("tanggal");
                data = new Object[]{idTransaksi, namaProduk, subTotal, tanggal};
                listData.add(data);
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed in the process of adding up the total product sold");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return listData;
    }
    
    public ArrayList<Object[]> GetTransaksiServisData(Date tgl){
        Object[] data = null;
        Connection koneksi = null;
        ArrayList<Object[]> listData = new ArrayList<>();
        String sqlGetData = "SELECT id_transaksi, keterangan, biaya, tanggal FROM transaksi_servis WHERE DATE(tanggal) = ?";
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(sqlGetData);
            stGet.setDate(1, new java.sql.Date(tgl.getTime()));
            ResultSet rs = stGet.executeQuery();
            while (rs.next()) {
                String idTransaksi = rs.getString("id_transaksi");
                String namaProduk = rs.getString("keterangan");
                double subTotal = rs.getDouble("biaya");
                Date tanggal = rs.getDate("tanggal");
                data = new Object[]{idTransaksi, namaProduk, subTotal, tanggal};
                listData.add(data);
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed in the process of adding up the total product sold");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return listData;
    }
}
