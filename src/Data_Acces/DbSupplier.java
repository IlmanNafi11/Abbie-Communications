package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;
import java.util.ArrayList;

public class DbSupplier {

    private String idSupplier;
    private String namaSupplier;
    private String noHp;
    private String kategori;
    private ExceptionHandler exceptionHandler;

    public DbSupplier(String idSupplier, String namaSupplier, String noHp, String kategori) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.noHp = noHp;
        this.kategori = kategori;
        exceptionHandler = new ExceptionHandler();
    }

    public boolean InsertSupplierData() {
        String sqlInsert = "INSERT INTO supplier (id_supplier, nama_supplier, tlp_supplier, kategori) VALUES (?, ?, ?, ?)";
        try {
            boolean confirm = exceptionHandler.confirmSaveDataPerson("Save Supplier Data?");
            if (confirm) {
                Connection koneksi = ClassKoneksi.GetConnection();
                PreparedStatement stInsert = koneksi.prepareStatement(sqlInsert);
                stInsert.setString(1, idSupplier);
                stInsert.setString(2, namaSupplier);
                stInsert.setString(3, noHp);
                stInsert.setString(4, kategori);
                stInsert.executeUpdate();
                exceptionHandler.succesSavePersonData("Data saved successfully !");
                return true;
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to save supplier data" + e);
        }
        return false;
    }

    public boolean ChangeSupplierData() {
        String sqlInsert = "UPDATE supplier SET nama_supplier = ?, tlp_supplier = ?, kategori = ? WHERE id_supplier = ?";
        try {
            boolean confirm = exceptionHandler.confirmChangePerson("Change Supplier data?");
            if (confirm) {
                Connection koneksi = ClassKoneksi.GetConnection();
                PreparedStatement stInsert = koneksi.prepareStatement(sqlInsert);
                stInsert.setString(1, namaSupplier);
                stInsert.setString(2, noHp);
                stInsert.setString(3, kategori);
                stInsert.setString(4, idSupplier);
                stInsert.executeUpdate();
                exceptionHandler.succesSavePersonData("Data changed successfully !");
                return true;
            }

        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to change supplier data" + e);
        }
        return false;
    }

    public ConfigTable GetAllDataSupplier() {
        ConfigTable dataTable = new ConfigTable();
        String sqlGetData = "SELECT * FROM supplier";
        dataTable.addColumn("Supplier ID");
        dataTable.addColumn("Supplier Name");
        dataTable.addColumn("Telephone Number");
        dataTable.addColumn("Category");
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
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
        }
        return dataTable;
    }

    public boolean DeleteDataSupplier() {
        String sqlDelete = "DELETE FROM supplier WHERE id_supplier = ?";
        try {
            boolean confirm = exceptionHandler.confirmDeleteData("Delete Supplier Data?");
            Connection koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stDelete = koneksi.prepareStatement(sqlDelete);
            stDelete.setString(1, idSupplier);
            if (confirm) {
                stDelete.executeUpdate();
                exceptionHandler.succesDeleteData("Data deleted successfully !");
                return true;
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to delete data" + e);
        }
        return false;
    }

    // get id supplier berdasarkan kategori produk
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
}
