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
            exceptionHandler.succesSavePersonData("Data saved successfully !");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to save supplier data" + e);
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
            exceptionHandler.succesSavePersonData("Data changed successfully !");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to change supplier data" + e);
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

    public void DeleteDataSupplier(String idSupplier) {
        String sqlDelete = "DELETE FROM supplier WHERE id_supplier = ?";
        Connection koneksi = null;
        exceptionHandler = new ExceptionHandler();
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stDelete = koneksi.prepareStatement(sqlDelete);
            stDelete.setString(1, idSupplier);
            stDelete.executeUpdate();
            exceptionHandler.succesDeleteData("Data deleted successfully !");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to delete data" + e);
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

    public ConfigTable GetAllDataSupplier() {
        ConfigTable dataTable = new ConfigTable();
        String sqlGetData = "SELECT * FROM supplier";
        dataTable.addColumn("Supplier ID");
        dataTable.addColumn("Supplier Name");
        dataTable.addColumn("Telephone Number");
        dataTable.addColumn("Category");
        Connection koneksi = null;
        exceptionHandler = new ExceptionHandler();
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(sqlGetData);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {
                dataTable.addRow(new Object[]{
                    rs.getString("id_supplier"),
                    rs.getString("nama_supplier"),
                    rs.getString("tlp_supplier"),
                    rs.getString("kategori")
                });
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to get data");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
                }
            }
        }
        return dataTable;
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
            exceptionHandler.getErrorKesalahan("Failed when trying to retrieve supplier ID! " + e.getMessage());
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
            exceptionHandler.getErrorKesalahan("Failed when trying to retrieve supplier name! " + e.getMessage());
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
}
