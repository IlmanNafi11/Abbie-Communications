package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;
import java.util.ArrayList;

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
            exceptionHandler.Kesalahan("Failed to check member data ");
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
    
    // get data member berdasarkan no hp untuk transaksi penjualan
    public ArrayList<String> GetMember(String noHp){
        exceptionHandler = new ExceptionHandler();
        ArrayList<String> dataMember = new ArrayList<>();
        String queryCek = "SELECT id_member, nama_member FROM member WHERE tlp_member = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetId = koneksi.prepareStatement(queryCek);
            stGetId.setString(1, noHp);
            ResultSet rs = stGetId.executeQuery();
            while (rs.next()) {                
                dataMember.add(rs.getString("id_member"));
                dataMember.add(rs.getString("nama_member"));
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred while trying to retrieve member data!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return dataMember;
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
            exceptionHandler.SuccesSavePersonData("Member data has been successfully saved!");
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("Failed when trying to save member data! ");
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
            exceptionHandler.SuccesSavePersonData("Member data has been successfully Changed!");
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("Failed when trying to change member data!");
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

    public void DeleteMember(String idMember) {
        String queryDelete = "DELETE FROM member WHERE id_member = ?";
        Connection koneksi = null;
        exceptionHandler = new ExceptionHandler();
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stDelete = koneksi.prepareStatement(queryDelete);
            stDelete.setString(1, idMember);
            stDelete.executeUpdate();
            exceptionHandler.SuccesDeleteData("Member data has been successfully deleted!");
        } catch (Exception e) {
            exceptionHandler.FailedDelete("Failed when trying to delete member data ");
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

    // get data member utk insert ke table
    public ArrayList<Object[]> GetAllDataMember() {
        Connection koneksi = null;
        exceptionHandler = new ExceptionHandler();
        ArrayList<Object[]> listDataMember = new ArrayList<>();
        String queryGetData = "SELECT * FROM member";       
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(queryGetData);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {
                String idMember = rs.getString("id_member");
                String namaMember = rs.getString("nama_member");
                String noHpMember = rs.getString("tlp_member");
                String alamatMember = rs.getString("alamat_member");
                Object[] data = new Object[]{idMember, namaMember, noHpMember, alamatMember};
                listDataMember.add(data);
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed when trying to get member data!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return listDataMember;
    }
}
