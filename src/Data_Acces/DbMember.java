package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;

public class DbMember {

    private ExceptionHandler exceptionHandler;

    public boolean cekMember(String noHp) {
        exceptionHandler = new ExceptionHandler();
        String queryCek = "SELECT COUNT(*) FROM member WHERE tlp_member = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stCekMember = koneksi.prepareStatement(queryCek);
            stCekMember.setString(1, noHp);
            ResultSet rs = stCekMember.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to check member data " + e);
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

    public void InsertMember(String idMember, String namaMember, String noHp, String alamatMember) {
        String queryInsert = "INSERT INTO member (id_member, nama_member, tlp_member, alamat_member) VALUES (?, ?, ?, ?)";
        Connection koneksi = null;
        exceptionHandler = new ExceptionHandler();
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idMember);
            stInsert.setString(2, namaMember);
            stInsert.setString(3, noHp);
            stInsert.setString(4, alamatMember);
            stInsert.executeUpdate();
            exceptionHandler.succesSavePersonData("Member data has been successfully saved");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to save member data " + e);
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

    public void ChangeMember(String namaMember, String noHp, String alamatMember, String idMember) {
        String queryUpdate = "UPDATE member SET nama_member = ?, tlp_member = ?, alamat_member = ? WHERE id_member = ?";
        Connection koneksi = null;
        exceptionHandler = new ExceptionHandler();
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stChange = koneksi.prepareStatement(queryUpdate);
            stChange.setString(1, namaMember);
            stChange.setString(2, noHp);
            stChange.setString(3, alamatMember);
            stChange.setString(4, idMember);
            stChange.executeUpdate();
            exceptionHandler.succesSavePersonData("Member data has been successfully Changed");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to change member data " + e.getMessage());
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

    public void DeleteMember(String idMember) {
        String queryDelete = "DELETE FROM member WHERE id_member = ?";
        Connection koneksi = null;
        exceptionHandler = new ExceptionHandler();
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stDelete = koneksi.prepareStatement(queryDelete);
            stDelete.setString(1, idMember);
            stDelete.executeUpdate();
            exceptionHandler.succesDeleteData("Member data has been successfully deleted");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to delete member data " + e);
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

    // get data member utk insert ke table
    public ConfigTable GetAllDataMember() {
        ConfigTable dataTable = new ConfigTable();
        Connection koneksi = null;
        exceptionHandler = new ExceptionHandler();
        String queryGetData = "SELECT * FROM member";
        dataTable.addColumn("Member ID");
        dataTable.addColumn("Member Name");
        dataTable.addColumn("Telephone");
        dataTable.addColumn("Address");
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(queryGetData);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {
                dataTable.addRow(new Object[]{
                    rs.getString("id_member"),
                    rs.getString("nama_member"),
                    rs.getString("tlp_member"),
                    rs.getString("alamat_member"),});
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to get data " + e);
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
