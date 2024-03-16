
package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;

public class DbPromo {
    
    private ExceptionHandler exceptionHandler;
    
    public boolean InsertDiskon(String kodeDiskon, String kategori, int minimum, int jumlahDiskon, String status){
        String queryInsert = "INSERT INTO promo (kode_diskon, kategori, minimum, nilai, status) VALUES (?, ? , ? , ?, ?)";
        exceptionHandler = new ExceptionHandler();
        boolean confirm = exceptionHandler.confirmSave("Save Discount?");
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, kodeDiskon);
            stInsert.setString(2, kategori);
            stInsert.setInt(3, minimum);
            stInsert.setInt(4, jumlahDiskon);
            stInsert.setString(5, status);
            if (confirm) {
                stInsert.executeUpdate();
                exceptionHandler.getSucces("Discount successfully saved");
                return true;
            }  
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to save discount"+ e.getMessage());
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
    
    public boolean ChangeDiskon(String kodeDiskon, String kategori, int minimum, int jumlahDiskon, String status){
        String queryChange = "UPDATE promo SET kategori = ?, minimum = ?, nilai = ?, status = ? WHERE kode_diskon = ?";
        exceptionHandler = new ExceptionHandler();
        boolean confirm = exceptionHandler.confirmSave("Save changes?");
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryChange); 
            stInsert.setString(1, kategori);
            stInsert.setInt(2, minimum);
            stInsert.setInt(3, jumlahDiskon);
            stInsert.setString(4, status);
            stInsert.setString(5, kodeDiskon);
            if (confirm) {
                stInsert.executeUpdate();
                exceptionHandler.getSucces("Discount successfully changed");
                return true;
            }  
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to update discount data!"+ e.getMessage());
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
    
    public boolean DeleteDiskon(String kodeDiskon){
        String queryDelete = "DELETE FROM promo WHERE kode_diskon = ?";
        exceptionHandler = new ExceptionHandler();
        boolean confirm = exceptionHandler.confirmDeleteData("Delete Discount?");
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stDelete = koneksi.prepareStatement(queryDelete);
            stDelete.setString(1, kodeDiskon);
            if (confirm) {
                stDelete.executeUpdate();
                exceptionHandler.succesDeleteData("Discount successfully removed!");
                return true;
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to remove discount!" + e.getMessage());
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
    
    // get data utk di insert ke table
    public ConfigTable GetAllDataPromo() {
        ConfigTable dataTable = new ConfigTable();
        String queryGetData = "SELECT * FROM promo";
        dataTable.addColumn("Discount Code");
        dataTable.addColumn("Category");
        dataTable.addColumn("Minimum Purchase");
        dataTable.addColumn("Discount amount");
        dataTable.addColumn("Status");
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(queryGetData);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {
                dataTable.addRow(new Object[]{
                    rs.getString("kode_diskon"),
                    rs.getString("kategori"),
                    rs.getInt("minimum"),
                    rs.getInt("nilai"),
                    rs.getString("status")
                });
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to get data " + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return dataTable;
    }
}
