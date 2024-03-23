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
    
    
    
    public void AddSaleTransaction(String idTransaksi, String idProduk, String namaProduk, int jumlah, String idMember, float total, Date tanggal, String kategori, String kodePromo, String idUser){
        exceptionHandler = new ExceptionHandler();
        String queryInsert = "INSERT INTO transaksi_penjualan (id_transaksi, id_produk, nama_produk, jumlah, id_member, biaya, tanggal, kategori, kode_promo, id_user) VALUES (?, ?, ? , ?, ?, ?, ?, ?, ?, ?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idTransaksi);
            stInsert.setString(2, idProduk);
            stInsert.setString(3, namaProduk);
            stInsert.setInt(4, jumlah);
            stInsert.setString(5, idMember);
            stInsert.setFloat(6, total);
            stInsert.setDate(7, new java.sql.Date(tanggal.getTime()));
            stInsert.setString(8, kategori);
            stInsert.setString(9, kodePromo);
            stInsert.setString(10, idUser);
            stInsert.executeUpdate();
            exceptionHandler.getSucces("Transaction successful!");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("A failure occurred while saving transaction data!" + e.getMessage());
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
