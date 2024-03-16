package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;

public class DbMember {

    private String idMember;
    private String noHp;
    private String namaMember;
    private String alamatMember;
    private ExceptionHandler exceptionHandler;

    public DbMember(String idMember, String noHp, String namaMember, String alamatMember) {
        this.idMember = idMember;
        this.noHp = noHp;
        this.namaMember = namaMember;
        this.alamatMember = alamatMember;
        exceptionHandler = new ExceptionHandler();
    }

    public DbMember(String noHp) {
        this.noHp = noHp;
        exceptionHandler = new ExceptionHandler();
    }

    public boolean cekMember() {
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

    public boolean InsertMember() {
        String queryInsert = "INSERT INTO member (id_member, nama_member, tlp_member, alamat_member) VALUES (?, ?, ?, ?)";
        boolean confirm = exceptionHandler.confirmSaveDataPerson("Save Member Data?");
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(queryInsert);
            stInsert.setString(1, idMember);
            stInsert.setString(2, namaMember);
            stInsert.setString(3, noHp);
            stInsert.setString(4, alamatMember);
            if (confirm) {
                stInsert.executeUpdate();
                exceptionHandler.succesSavePersonData("Member data has been successfully saved");
                return true;
            }
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
        return false;
    }

    public boolean ChangeMember() {
        String queryUpdate = "UPDATE member SET nama_member = ?, tlp_member = ?, alamat_member = ? WHERE id_member = ?";
        boolean confirm = exceptionHandler.confirmChangePerson("Change Member Data?");
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stChange = koneksi.prepareStatement(queryUpdate);
            stChange.setString(1, namaMember);
            stChange.setString(2, noHp);
            stChange.setString(3, alamatMember);
            stChange.setString(4, idMember);
            if (confirm) {
                stChange.executeUpdate();
                exceptionHandler.succesSavePersonData("Member data has been successfully Changed");
                return true;
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to change member data " + e);
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

    public boolean DeleteMember() {
        String queryDelete = "DELETE FROM member WHERE id_member = ?";
        boolean confirm = exceptionHandler.confirmDeleteData("Are you sure you deleted member data?");
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stDelete = koneksi.prepareStatement(queryDelete);
            stDelete.setString(1, idMember);
            if (confirm) {
                stDelete.executeUpdate();
                exceptionHandler.succesDeleteData("Member data has been successfully deleted");
                return true;
            }
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
        return false;
    }

    // get data member utk insert ke table
    public ConfigTable GetAllDataMember() {
        ConfigTable dataTable = new ConfigTable();
        Connection koneksi = null;
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
