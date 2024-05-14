package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;
import java.util.ArrayList;

public class DbSupplier {

    private ExceptionHandler exceptionHandler;

    public void InsertSupplierData(String idSupplier, String namaSupplier, String noHp, String kategori) {
        String sqlInsert = "INSERT INTO supplier (id_supplier, nama_supplier, tlp_supplier, kategori) VALUES (?, ?, ?, ?)";
        Connection koneksi = null;
        exceptionHandler = new ExceptionHandler();
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(sqlInsert);
            stInsert.setString(1, idSupplier);
            stInsert.setString(2, namaSupplier);
            stInsert.setString(3, noHp);
            stInsert.setString(4, kategori);
            stInsert.executeUpdate();
            exceptionHandler.SuccesSaveData("Data saved successfully !");
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("Failed to save supplier data");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection! ");
                }
            }
        }
    }

    public void ChangeSupplierData(String idSupplier, String namaSupplier, String noHp, String kategori) {
        String sqlInsert = "UPDATE supplier SET nama_supplier = ?, tlp_supplier = ?, kategori = ? WHERE id_supplier = ?";
        Connection koneksi = null;
        exceptionHandler = new ExceptionHandler();
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(sqlInsert);
            stInsert.setString(1, namaSupplier);
            stInsert.setString(2, noHp);
            stInsert.setString(3, kategori);
            stInsert.setString(4, idSupplier);
            stInsert.executeUpdate();
            exceptionHandler.SuccesSavePersonData("Data changed successfully !");
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("Failed to change supplier data");
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

    public void DeleteDataSupplier(String idSupplier) {
        String sqlDelete = "DELETE FROM supplier WHERE id_supplier = ?";
        Connection koneksi = null;
        exceptionHandler = new ExceptionHandler();
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stDelete = koneksi.prepareStatement(sqlDelete);
            stDelete.setString(1, idSupplier);
            stDelete.executeUpdate();
            exceptionHandler.SuccesDeleteData("Data deleted successfully !");
        } catch (Exception e) {
            exceptionHandler.FailedDelete("Failed when trying to delete data");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection! ");
                }
            }
        }
    }

    public ArrayList<Object[]> GetAllDataSupplier() {
        String sqlGetData = "SELECT * FROM supplier";
        Connection koneksi = null;
        exceptionHandler = new ExceptionHandler();
        ArrayList<Object[]> listDataSupplier = new ArrayList<>();
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(sqlGetData);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {
                String idSupplier = rs.getString("id_supplier");
                String namaSupplier = rs.getString("nama_supplier");
                String noHpSupplier = rs.getString("tlp_supplier");
                String kategori = rs.getString("kategori");
                Object[] data = new Object[]{idSupplier, namaSupplier, noHpSupplier, kategori};
                listDataSupplier.add(data);
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed when trying to get data");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection! ");
                }
            }
        }
        return listDataSupplier;
    }

    public ArrayList<Object[]> SearchSupplier(String inputSearch) {
        ArrayList<Object[]> listDataSupplier = new ArrayList<>();
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        String querySerach = "SELECT * FROM supplier WHERE id_supplier LIKE ? OR nama_supplier LIKE ? OR tlp_supplier LIKE ?";
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stSearch = koneksi.prepareStatement(querySerach);
            stSearch.setString(1, "%" + inputSearch + "%");
            stSearch.setString(2, "%" + inputSearch + "%");
            stSearch.setString(3, "%" + inputSearch + "%");
            ResultSet rs = stSearch.executeQuery();
            while (rs.next()) {
                String idSupplier = rs.getString("id_supplier");
                String namaSupplier = rs.getString("nama_supplier");
                String noHpSupplier = rs.getString("tlp_supplier");
                String kategori = rs.getString("kategori");
                Object[] data = new Object[]{idSupplier, namaSupplier, noHpSupplier, kategori};
                listDataSupplier.add(data);
            }
            if (listDataSupplier.isEmpty()) {
                exceptionHandler.Kesalahan("Supplier not found!");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred when trying to search for supplier data!" + e.getMessage());
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
        return listDataSupplier;
    }

    // get id supplier berdasarkan kategori produk di kelas yang membutuhkan
    public ArrayList<String> GetIdSupplier(String kategori) {
        String queryGetIdSupplier = "SELECT id_supplier FROM supplier WHERE kategori = ?";
        ArrayList<String> idSupplier = new ArrayList<>();
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetId = koneksi.prepareStatement(queryGetIdSupplier);
            stGetId.setString(1, kategori);
            ResultSet rs = stGetId.executeQuery();
            while (rs.next()) {
                idSupplier.add(rs.getString("id_supplier"));
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed when trying to retrieve supplier ID! ");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection! ");
                }
            }
        }
        return idSupplier;
    }

    // get nama supplier berdasarkan id supplier di kelas yang membutuhkan
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
            exceptionHandler.Kesalahan("Failed when trying to retrieve supplier name! ");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection! ");
                }
            }
        }
        return namaSupplier;
    }
    
    public boolean CekNoHp(String noHp) {
        exceptionHandler = new ExceptionHandler();
        String sqlCekNoHp = "SELECT COUNT(*) FROM supplier WHERE tlp_supplier=?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stCek = koneksi.prepareStatement(sqlCekNoHp);
            stCek.setString(1, noHp);
            ResultSet rs = stCek.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed when checking Phone Number");
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
}
