package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;
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
            exceptionHandler.getSucces("Restock transaction successfully saved");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to save Restock Transaction" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!" + e.getMessage());
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
            exceptionHandler.getSucces("Restock transaction successfully changed");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to change Restock Transaction" + e);
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!" + e.getMessage());
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
            exceptionHandler.succesDeleteData("Data deleted successfully!");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to delete data" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!" + e.getMessage());
                }
            }
        }
    }

    public ConfigTable GetAllDataRestock() {
        ConfigTable dataTable = new ConfigTable();
        String sqlGetData = "SELECT r.id_transaksi, r.nama_produk, r.jumlah, r.harga, r.id_supplier, r.total, r.tanggal, p.kategori FROM restock r JOIN produk p ON r.id_produk = p.id_produk";
        dataTable.addColumn("Transaction ID");
        dataTable.addColumn("Category");
        dataTable.addColumn("Product Name");
        dataTable.addColumn("Quantity");
        dataTable.addColumn("Price");
        dataTable.addColumn("Supplier ID");
        dataTable.addColumn("Total");
        dataTable.addColumn("Date");
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(sqlGetData);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {
                dataTable.addRow(new Object[]{
                    rs.getString("id_transaksi"),
                    rs.getString("kategori"),
                    rs.getString("nama_produk"),
                    rs.getInt("jumlah"),
                    rs.getInt("harga"),
                    rs.getString("id_supplier"),
                    rs.getInt("total"),
                    rs.getDate("tanggal")
                });
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to get data" + e.getMessage());
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
            exceptionHandler.getErrorKesalahan("Failed when trying to get Produk ID" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!" + e.getMessage());
                }
            }
        }
        return null;
    }

}
