package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;
import java.util.ArrayList;
import java.util.Date;

public class DbRestock {

    private ExceptionHandler exceptionHandler;

    public void InsertData(String idTransaksi, String namaProduk, int jumlah, int harga, String idSupplier, String idProduk, float total, Date tanggal) {
        exceptionHandler = new ExceptionHandler();
        String queryInsert = "INSERT INTO restock (id_transaksi, nama_produk, jumlah, harga, id_supplier, id_produk, total, tanggal) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idTransaksi);
            stInsert.setString(2, namaProduk);
            stInsert.setInt(3, jumlah);
            stInsert.setInt(4, harga);
            stInsert.setString(5, idSupplier);
            stInsert.setString(6, idProduk);
            stInsert.setFloat(7, total);
            stInsert.setDate(8, new java.sql.Date(tanggal.getTime()));
            stInsert.executeUpdate();
            exceptionHandler.SuccesSaveData("Restock transaction successfully saved");
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed to save Restock Transaction" + e.getMessage());
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

    public void ChangeRestockData(String idTransaksi, String namaProduk, int jumlah, int harga, String idSupplier, String idProduk, float total, Date tanggal) {
        exceptionHandler = new ExceptionHandler();
        String queryChange = "UPDATE restock SET nama_produk = ?, jumlah = ?, harga = ?, id_supplier = ?, id_produk = ?, total = ?, tanggal = ? WHERE id_transaksi = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stChange = koneksi.prepareStatement(queryChange);
            stChange.setString(1, namaProduk);
            stChange.setInt(2, jumlah);
            stChange.setInt(3, harga);
            stChange.setString(4, idSupplier);
            stChange.setString(5, idProduk);
            stChange.setFloat(6, total);
            stChange.setDate(7, new java.sql.Date(tanggal.getTime()));
            stChange.setString(8, idTransaksi);
            stChange.executeUpdate();
            exceptionHandler.SuccesSaveData("Restock transaction successfully changed");
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed to change Restock Transaction");
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

    public void DeleteData(String idTransaksi) {
        exceptionHandler = new ExceptionHandler();
        String queryDelete = "DELETE FROM restock WHERE id_transaksi = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stDelete = koneksi.prepareStatement(queryDelete);
            stDelete.setString(1, idTransaksi);
            stDelete.executeUpdate();
            exceptionHandler.SuccesDeleteData("Data deleted successfully!");
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed when trying to delete data");
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

    public ArrayList<Object[]> GetAllDataRestock() {
        exceptionHandler = new ExceptionHandler();
        ArrayList<Object[]> listData = new ArrayList<>();
        String sqlGetData = "SELECT r.id_transaksi, r.nama_produk, r.jumlah, r.harga, r.id_supplier, r.total, r.tanggal, p.kategori FROM restock r JOIN produk p ON r.id_produk = p.id_produk";      
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(sqlGetData);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {
                    String idTransaksi = rs.getString("id_transaksi");
                    String kategori = rs.getString("kategori");
                    String namaProduk = rs.getString("nama_produk");
                    int quantity = rs.getInt("jumlah");
                    int harga = rs.getInt("harga");
                    String idSupplier = rs.getString("id_supplier");
                    int total = rs.getInt("total");
                    Date tanggal = rs.getDate("tanggal");
                    Object[] data = new Object[]{idTransaksi, kategori, namaProduk, quantity, harga, idSupplier, total, tanggal};
                    listData.add(data);
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed when trying to get data");
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
    
    public ArrayList<Object[]> SearchTransactionRestock(String inputSearch) {
        ArrayList<Object[]> listData = new ArrayList<>();
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        String querySerach = "SELECT r.id_transaksi, r.nama_produk, r.jumlah, r.harga, r.id_supplier, r.total, r.tanggal, p.kategori FROM restock r JOIN produk p ON r.id_produk = p.id_produk WHERE r.id_transaksi LIKE ? OR r.tanggal LIKE ?";
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stSearch = koneksi.prepareStatement(querySerach);
            stSearch.setString(1, "%" + inputSearch + "%");
            stSearch.setString(2, "%" + inputSearch + "%");
            ResultSet rs = stSearch.executeQuery();
            while (rs.next()) {
                String idTransaksi = rs.getString("id_transaksi");
                    String kategori = rs.getString("kategori");
                    String namaProduk = rs.getString("nama_produk");
                    int quantity = rs.getInt("jumlah");
                    double harga = rs.getDouble("harga");
                    String idSupplier = rs.getString("id_supplier");
                    double total =rs.getDouble("total");
                    Date tanggal = rs.getDate("tanggal");
                    Object[] data = new Object[]{idTransaksi, kategori, namaProduk, quantity, harga, idSupplier, total, tanggal};
                    listData.add(data);
            }
            if (listData.isEmpty()) {
                exceptionHandler.Kesalahan("Transaction not found!");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred when trying to search for transaction data!" + e.getMessage());
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

    // get id produk by id transaksi
    public String GetIdProduct(String idTransaksi) {
        exceptionHandler = new ExceptionHandler();
        String queryGetId = "SELECT id_produk FROM restock WHERE id_transaksi = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetId = koneksi.prepareStatement(queryGetId);
            stGetId.setString(1, idTransaksi);
            ResultSet rs = stGetId.executeQuery();
            while (rs.next()) {
                return rs.getString("id_produk");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed when trying to get Produk ID");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return null;
    }

}
