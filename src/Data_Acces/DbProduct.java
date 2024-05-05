package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;
import java.util.ArrayList;

public class DbProduct {

    private ExceptionHandler exceptionHandler;

    // insert data ke database table produk
    public void InsertProduct(String kategori, String idProduk, String namaProduk, int stok, String idSupplier, float harga, byte[] barcode) {
        exceptionHandler = new ExceptionHandler();
        String sqlInsert = "INSERT INTO produk (id_produk, nama_produk, kategori, jumlah, harga, id_supplier, barcode) VALUES (?,?,?,?,?,?,?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(sqlInsert);
            stInsert.setString(1, idProduk);
            stInsert.setString(2, namaProduk);
            stInsert.setString(3, kategori);
            stInsert.setInt(4, stok);
            stInsert.setFloat(5, harga);
            stInsert.setString(6, idSupplier);
            stInsert.setBytes(7, barcode);
            stInsert.executeUpdate();
            exceptionHandler.SuccesSaveData("New product data saved successfully!");
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("Failed to save product data!");
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

    // ubah data produk
    public void ChangeDataProduct(String kategori, String idProduk, String namaProduk, int stok, String idSupplier, float harga) {
        exceptionHandler = new ExceptionHandler();
        String sqlInsert = "UPDATE produk SET nama_produk = ?, kategori = ?, jumlah = ?, harga = ?, id_supplier = ? WHERE id_produk = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(sqlInsert);
            stInsert.setString(1, namaProduk);
            stInsert.setString(2, kategori);
            stInsert.setInt(3, stok);
            stInsert.setFloat(4, harga);
            stInsert.setString(5, idSupplier);
            stInsert.setString(6, idProduk);
            stInsert.executeUpdate();
            exceptionHandler.SuccesSaveData("Product data updated successfully!");
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("Failed to change product data!");
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

    public void DeleteProduk(String idProduk) {
        String queryDelete = "DELETE FROM produk WHERE id_produk = ?";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stDelete = koneksi.prepareStatement(queryDelete);
            stDelete.setString(1, idProduk);
            stDelete.executeUpdate();
            exceptionHandler.SuccesDeleteData("Product successfully removed!");
        } catch (Exception e) {
            exceptionHandler.FailedDelete("Failed when trying to remove product!");
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
    
    public ArrayList<Object[]> SearchProduct(String inputSearch) {
        ArrayList<Object[]> listDataProduk = new ArrayList<>();
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        String querySerach = "SELECT * FROM produk WHERE id_produk LIKE ? OR nama_produk LIKE ?";
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stSearch = koneksi.prepareStatement(querySerach);
            stSearch.setString(1, "%" + inputSearch + "%");
            stSearch.setString(2, "%" + inputSearch + "%");
            ResultSet rs = stSearch.executeQuery();
            while (rs.next()) {
                String idProduk = rs.getString("id_produk");
                String namaProduk = rs.getString("nama_produk");
                String kategori = rs.getString("kategori");
                int quantity = rs.getInt("jumlah");
                int price = rs.getInt("harga");
                Object[] data = new Object[]{idProduk, namaProduk, kategori, quantity, price};
                listDataProduk.add(data);
            }
            if (listDataProduk.isEmpty()) {
                exceptionHandler.Kesalahan("Product not found!");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred when trying to search for product data!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return listDataProduk;
    }
    
    public byte[] GetBarcode(String idProduct){
        byte[] barcode = null;
        String queryGet = "SELECT barcode FROM produk WHERE id_produk = ?";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(queryGet);
            stGet.setString(1, idProduct);
            ResultSet rs = stGet.executeQuery();
            while(rs.next()){
                 barcode = rs.getBytes("barcode");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed to get barcode!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return barcode;
    }

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
            exceptionHandler.Kesalahan("Failed to check product data");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return false;
    }

    // get id supplier berdasarkan id product ketika perubahan data
    public String GetSupplierByIdProduk(String idProduk) {
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
            exceptionHandler.Kesalahan("Failed when trying to retrieve supplier ID!");
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

    public ArrayList<Object[]> GetAllDataProduk() {
        exceptionHandler = new ExceptionHandler();
        String queryGetData = "SELECT * FROM produk";
        Connection koneksi = null;
        ArrayList<Object[]> listDataProduct = new ArrayList<>();
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(queryGetData);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {
                    String idProduk = rs.getString("id_produk");
                    String namaProduk = rs.getString("nama_produk");
                    String kategori = rs.getString("kategori");
                    int quantity = rs.getInt("jumlah");
                    int price = rs.getInt("harga");
                    Object[] data = new Object[]{idProduk, namaProduk, kategori, quantity, price}; 
                    listDataProduct.add(data);
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed when trying to get data ");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return listDataProduct;
    }

    // get idProduk berdasarkan kategori untuk kelas Restok controler
    public ArrayList<String> GetIdProduk(String kategori) {
        String queryGetId = "SELECT id_produk FROM produk WHERE kategori = ?";
        ArrayList<String> idProduk = new ArrayList<>();
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetId = koneksi.prepareStatement(queryGetId);
            stGetId.setString(1, kategori);
            ResultSet rs = stGetId.executeQuery();
            while (rs.next()) {
                idProduk.add(rs.getString("id_produk"));
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed when trying to retrieve the Product ID");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection! ");
                }
            }
        }
        return idProduk;
    }

    // get produk name berdasarkan id produk untuk kelas restock, transaksi
    public String GetProdukName(String idProduk) {
        String queryGetName = "SELECT nama_produk FROM produk WHERE id_produk = ?";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetName = koneksi.prepareStatement(queryGetName);
            stGetName.setString(1, idProduk);
            ResultSet rs = stGetName.executeQuery();
            while (rs.next()) {
                return rs.getString("nama_produk");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred when trying to retrieve the product name");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection! ");
                }
            }
        }
        return null;
    }
    
    // get price untuk transaksi
    public int GetPrice(String idProduct){
        exceptionHandler = new ExceptionHandler();
        String queryGet = "SELECT harga FROM produk WHERE id_produk = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(queryGet);
            stGet.setString(1, idProduct);
            ResultSet rs = stGet.executeQuery();
            while (rs.next()) {                
                return rs.getInt("harga");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A Failure occurred while retrieving product prices!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection! ");
                }
            }
        }
        return 0;
    }
    
    // get jumlah stok untuk validasi ketika transaksi
    public int GetStok(String idProduct){
        exceptionHandler = new ExceptionHandler();
        String queryGet = "SELECT jumlah FROM produk WHERE id_produk = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(queryGet);
            stGet.setString(1, idProduct);
            ResultSet rs = stGet.executeQuery();
            while (rs.next()) {                
                return rs.getInt("jumlah");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred when trying to retrieve the product stock quantity");
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

    // belum implementasi
    public ConfigTable SearchProduct(String namaProduk, String idProduct, String kategori){
        ConfigTable dataProduct = new ConfigTable();
        String sqlGetProduct = "SELECT * FROM produk WHERE idProduct = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetProduk = koneksi.prepareStatement(sqlGetProduct);
            stGetProduk.setString(1, namaProduk);
            stGetProduk.setString(2, idProduct);
            stGetProduk.setString(3, kategori);
            ResultSet rsGet = stGetProduk.executeQuery();
            while (rsGet.next()) {
                dataProduct.addRow(new  Object[]{
                        rsGet.getString("id_produk"),
                        rsGet.getString("nama_produk")
                });
            }
        } catch (Exception e) {

        }
        return dataProduct;
    }
}
