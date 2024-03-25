package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Logic.*;

public class DbPromo {

    private ExceptionHandler exceptionHandler;

    public void InsertDiskon(String kodeDiskon, int minimum, int jumlahDiskon, String status) {
        String queryInsert = "INSERT INTO promo (kode_diskon, minimum, diskon, status) VALUES (? , ? , ?, ?)";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, kodeDiskon);
            stInsert.setInt(2, minimum);
            stInsert.setInt(3, jumlahDiskon);
            stInsert.setString(4, status);
            stInsert.executeUpdate();
            exceptionHandler.getSucces("Discount successfully saved");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to save discount" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
    }

    public void ChangeDiskon(String kodeDiskon, int minimum, int jumlahDiskon, String status) {
        String queryChange = "UPDATE promo SET minimum = ?, diskon = ?, status = ? WHERE kode_diskon = ?";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryChange);
            stInsert.setInt(1, minimum);
            stInsert.setInt(2, jumlahDiskon);
            stInsert.setString(3, status);
            stInsert.setString(4, kodeDiskon);
            stInsert.executeUpdate();
            exceptionHandler.getSucces("Discount successfully changed");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to update discount data!" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
    }

    public void DeleteDiskon(String kodeDiskon) {
        String queryDelete = "DELETE FROM promo WHERE kode_diskon = ?";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stDelete = koneksi.prepareStatement(queryDelete);
            stDelete.setString(1, kodeDiskon);
            stDelete.executeUpdate();
            exceptionHandler.succesDeleteData("Discount successfully removed!");
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
    }

    // get all data utk insert ke table
    public ConfigTable GetAllDataPromo() {
        ConfigTable dataTable = new ConfigTable();
        exceptionHandler = new ExceptionHandler();
        String queryGetData = "SELECT * FROM promo";
        dataTable.addColumn("Discount Code");
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
                    rs.getInt("minimum"),
                    rs.getInt("diskon"),
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

    public ArrayList<String> GetKodeDiskon(int total) {
        ArrayList<String> kodeDiskon = new ArrayList<>();
        exceptionHandler = new ExceptionHandler();
        String queryGet = "SELECT kode_diskon FROM promo WHERE ? > minimum";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(queryGet);
            stGet.setInt(1, total);
            ResultSet rs = stGet.executeQuery();
            while (rs.next()) {
                kodeDiskon.add(rs.getString("kode_diskon"));
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("A failure occurred while trying to retrieve the promo code!" + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return kodeDiskon;
    }
    
    public int GetDiskon(String kodeDiskon){
        exceptionHandler  = new ExceptionHandler();
        String queryGet = "SELECT diskon FROM promo WHERE kode_diskon = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGet = koneksi.prepareStatement(queryGet);
            stGet.setString(1, kodeDiskon);
            ResultSet rs = stGet.executeQuery();
            while (rs.next()) {                
                return rs.getInt("diskon");
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("A failure occurred while retrieving the discount amount!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return 0;
    }
}
