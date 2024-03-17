package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Logic.*;

public class DbProduct {

    private ExceptionHandler exceptionHandler;

    // validasi ketersediaan nama produk
    public boolean CekProduk(String namaProduk) {
        exceptionHandler = new ExceptionHandler();
        String sqlCek = "SELECT COUNT(*) FROM produk WHERE nama_produk=?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stCekNama = koneksi.prepareStatement(sqlCek);
            stCekNama.setString(1, namaProduk);
            ResultSet rs = stCekNama.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to check product data");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!" + e.getMessage());
                }
            }
        }
        return false;
    }

    // insert data ke database table produk
    public boolean InsertProduct(String kategori, String idProduk, String namaProduk, int stok, String idSupplier, float harga) {
        exceptionHandler = new ExceptionHandler();
        String sqlInsert = "INSERT INTO produk (id_produk, nama_produk, kategori, jumlah, harga, id_supplier) VALUES (?,?,?,?,?,?)";
        Connection koneksi = null;
        boolean confirm = exceptionHandler.confirmSave("Save product data?");
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(sqlInsert);
            stInsert.setString(1, idProduk);
            stInsert.setString(2, namaProduk);
            stInsert.setString(3, kategori);
            stInsert.setInt(4, stok);
            stInsert.setFloat(5, harga);
            stInsert.setString(6, idSupplier);
            if (confirm) {
                stInsert.executeUpdate();
                exceptionHandler.getSucces("New product data saved successfully!");
                return true;
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to save product data" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!" + e.getMessage());
                }
            }
        }
        return false;
    }

    // ubah data produk
    public boolean ChangeDataProduct(String kategori, String idProduk, String namaProduk, int stok, String idSupplier, float harga) {
        exceptionHandler = new ExceptionHandler();
        String sqlInsert = "UPDATE produk SET nama_produk = ?, kategori = ?, jumlah = ?, harga = ?, id_supplier = ? WHERE id_produk = ?";
        Connection koneksi = null;
        boolean confirm = exceptionHandler.confirmSave("Save product data changes?");
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(sqlInsert);
            stInsert.setString(1, namaProduk);
            stInsert.setString(2, kategori);
            stInsert.setInt(3, stok);
            stInsert.setFloat(4, harga);
            stInsert.setString(5, idSupplier);
            stInsert.setString(6, idProduk);
            if (confirm) {
                stInsert.executeUpdate();
                exceptionHandler.getSucces("Product data updated successfully!");
                return true;
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to change product data" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
                }
            }
        }
        return false;
    }

    public boolean DeleteProduk(String idProduk) {
        String queryDelete = "DELETE FROM produk WHERE id_produk = ?";
        exceptionHandler = new ExceptionHandler();
        boolean confirm = exceptionHandler.confirmDeleteData("Delete Product?");
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stDelete = koneksi.prepareStatement(queryDelete);
            stDelete.setString(1, idProduk);
            if (confirm) {
                stDelete.executeUpdate();
                exceptionHandler.succesDeleteData("Product successfully removed!");
                return true;
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to remove product!" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return false;
    }

    // get id supplier berdasarkan kategori
    public ArrayList<String> GetIdSupplier(String kategori) {
        String sqlGetProduct = "SELECT id_supplier FROM supplier WHERE kategori = ?";
        ArrayList<String> idSupplier = new ArrayList<>();
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetId = koneksi.prepareStatement(sqlGetProduct);
            stGetId.setString(1, kategori);
            ResultSet rs = stGetId.executeQuery();
            while (rs.next()) {
                idSupplier.add(rs.getString("id_supplier"));
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("gagal saat mencoba mengambil id_supplier" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
                }
            }
        }
        return idSupplier;
    }

    // get id supplier berdasarkan id product ketika perubahan data
    public String GetSupplier(String idProduk) {
        String queryGetSupplier = "SELECT id_supplier FROM produk WHERE id_produk = ?";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(queryGetSupplier);
            stGet.setString(1, idProduk);
            ResultSet rsGet = stGet.executeQuery();
            while (rsGet.next()) {
                return rsGet.getString("id_supplier");
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to retrieve supplier ID!" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
                }
            }
        }
        return null;
    }

    // get nama supplier berdasarkan id supplier
    public String GetSupplierName(String supplierId) {
        String sqlGetName = "SELECT nama_supplier FROM supplier WHERE id_supplier = ?";
        String namaSupplier = null;
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetName = koneksi.prepareStatement(sqlGetName);
            stGetName.setString(1, supplierId);
            ResultSet rs = stGetName.executeQuery();
            while (rs.next()) {
                namaSupplier = rs.getString("nama_supplier");
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("gagal saat mengambil nama supplier" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
                }
            }
        }
        return namaSupplier;
    }

    public ConfigTable GetAllDataProduk() {
        exceptionHandler = new ExceptionHandler();
        ConfigTable dataTable = new ConfigTable();
        String queryGetData = "SELECT * FROM produk";
        dataTable.addColumn("Product ID");
        dataTable.addColumn("Product Name");
        dataTable.addColumn("Category");
        dataTable.addColumn("Quantity");
        dataTable.addColumn("Price");
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(queryGetData);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {
                dataTable.addRow(new Object[]{
                    rs.getString("id_produk"),
                    rs.getString("nama_produk"),
                    rs.getString("kategori"),
                    rs.getInt("jumlah"),
                    rs.getInt("harga")
                });
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to get data " + e.getMessage());
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
