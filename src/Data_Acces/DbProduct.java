package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Logic.*;

public class DbProduct {

    private ExceptionHandler error;

    // validasi ketersediaan nama produk
    public boolean cekProduk(String namaProduk) {
        error = new ExceptionHandler();
        String sqlCek = "SELECT COUNT(*) FROM produk WHERE nama_produk=?";
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stCekNama = koneksi.prepareStatement(sqlCek);
            stCekNama.setString(1, namaProduk);
            ResultSet rs = stCekNama.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            error.getErrorKesalahan("Failed to check product data");
        }
        return false;
    }

    // insert data ke database table produk
    public void insertProduct(String kategori, String idProduk, String namaProduk, int stok, String idSupplier, float harga) {
        error = new ExceptionHandler();
        String sqlInsert = "INSERT INTO produk (id_produk, nama_produk, kategori, jumlah, harga, id_supplier) VALUES (?,?,?,?,?,?)";
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(sqlInsert);
            stInsert.setString(1, idProduk);
            stInsert.setString(2, namaProduk);
            stInsert.setString(3, kategori);
            stInsert.setInt(4, stok);
            stInsert.setFloat(5, harga);
            stInsert.setString(6, idSupplier);
            stInsert.executeUpdate();
        } catch (Exception e) {
            error.getErrorKesalahan("Failed to save product data" + e);
        }
    }

    // ubah data produk
    public void changeDataProduct(String kategori, String idProduk, String namaProduk, int stok, String idSupplier, float harga) {
        error = new ExceptionHandler();
        String sqlInsert = "UPDATE produk SET nama_produk = ?, kategori = ?, jumlah = ?, harga = ?, id_supplier = ? WHERE id_produk = ?";
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(sqlInsert);
            stInsert.setString(1, namaProduk);
            stInsert.setString(2, kategori);
            stInsert.setInt(3, stok);
            stInsert.setFloat(4, harga);
            stInsert.setString(5, idSupplier);
            stInsert.setString(6, idProduk);
            stInsert.executeUpdate();
        } catch (Exception e) {
            error.getErrorKesalahan("Failed to change product data" + e);
        }
    }

    // get id supplier berdasarkan kategori
    public ArrayList<String> getIdSupplier(String kategori) {
        String sqlGetProduct = "SELECT id_supplier FROM supplier WHERE kategori = ?";
        ArrayList<String> idSupplier = new ArrayList<>();
        error = new ExceptionHandler();
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetId = koneksi.prepareStatement(sqlGetProduct);
            stGetId.setString(1, kategori);
            ResultSet rs = stGetId.executeQuery();
            while (rs.next()) {
                idSupplier.add(rs.getString("id_supplier"));
            }
        } catch (Exception e) {
            error.getErrorKesalahan("gagal saat mencoba mengambil id_supplier" + e);
        }
        return idSupplier;
    }

    // get nama supplier berdasarkan id supplier
    public String getSupplierName(String supplierId) {
        String sqlGetName = "SELECT nama_supplier FROM supplier WHERE id_supplier = ?";
        String namaSupplier = null;
        error = new ExceptionHandler();
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetName = koneksi.prepareStatement(sqlGetName);
            stGetName.setString(1, supplierId);
            ResultSet rs = stGetName.executeQuery();
            while (rs.next()) {
                namaSupplier = rs.getString("nama_supplier");
            }
        } catch (Exception e) {
            error.getErrorKesalahan("gagal saat mengambil nama supplier");
        }
        return namaSupplier;
    }

}
