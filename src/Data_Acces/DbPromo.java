package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;

public class DbPromo {

    private ExceptionHandler exceptionHandler;

    public void InsertDiskon(String kodeDiskon, String kategori, int minimum, int jumlahDiskon, String status) {
        String queryInsert = "INSERT INTO promo (kode_diskon, kategori, minimum, nilai, status) VALUES (?, ? , ? , ?, ?)";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, kodeDiskon);
            stInsert.setString(2, kategori);
            stInsert.setInt(3, minimum);
            stInsert.setInt(4, jumlahDiskon);
            stInsert.setString(5, status);
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

    public void ChangeDiskon(String kodeDiskon, String kategori, int minimum, int jumlahDiskon, String status) {
        String queryChange = "UPDATE promo SET kategori = ?, minimum = ?, nilai = ?, status = ? WHERE kode_diskon = ?";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryChange);
            stInsert.setString(1, kategori);
            stInsert.setInt(2, minimum);
            stInsert.setInt(3, jumlahDiskon);
            stInsert.setString(4, status);
            stInsert.setString(5, kodeDiskon);
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
