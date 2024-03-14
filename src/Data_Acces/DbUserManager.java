package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;

public class DbUserManager {

    private ExceptionHandler error;

    public boolean cekNik(String nik) {
        error = new ExceptionHandler();
        String sqlNik = "SELECT COUNT(*) FROM data_pengguna WHERE nik=?";
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stNik = koneksi.prepareStatement(sqlNik);
            stNik.setString(1, nik);
            ResultSet rs = stNik.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            error.getErrorKesalahan("Gagal mengecek Nik");
        }
        return false;
    }

    public boolean cekUsername(String username) {
        error = new ExceptionHandler();
        String sqlUsername = "SELECT COUNT(*) FROM akun WHERE LOWER(username)= LOWER(?)";
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stUsername = koneksi.prepareStatement(sqlUsername);
            stUsername.setString(1, username);
            ResultSet rs = stUsername.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            error.getErrorKesalahan("Gagal mengecek username");
        }
        return false;
    }

    public void add(String id_user, String id_akun, String nik, String nama, String noHp, String alamat, String username, String password, String role) {
        error = new ExceptionHandler();
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
            String sqlBio = "INSERT INTO data_pengguna (id_user, nik, nama, noHp, alamat, posisi) VALUES (?,?,?,?,?,?)";
            PreparedStatement stBio = koneksi.prepareStatement(sqlBio);
            stBio.setString(1, id_user);
            stBio.setString(2, nik);
            stBio.setString(3, nama);
            stBio.setString(4, noHp);
            stBio.setString(5, alamat);
            stBio.setString(6, role);
            stBio.executeUpdate();

            String sqlAkun = "INSERT INTO akun (id_akun, username, password, id_user) VALUES (?,?,?,?)";
            PreparedStatement stAkun = koneksi.prepareStatement(sqlAkun);
            stAkun.setString(1, id_akun);
            stAkun.setString(2, username);
            stAkun.setString(3, password);
            stAkun.setString(4, id_user);
            stAkun.executeUpdate();
        } catch (Exception e) {
            error.getErrorKesalahan("gagal" + e.getMessage());
        } 
    }
    
    public String authLogin(String username, String password){
        error = new ExceptionHandler();
        String sqlGetUser = "SELECT * FROM akun WHERE username = ? AND password = ?";
        String sqlGetRole = "SELECT * FROM data_pengguna WHERE id_user =?";
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stAuthLogin = koneksi.prepareStatement(sqlGetUser);
            stAuthLogin.setString(1, username);
            stAuthLogin.setString(2, password);
            ResultSet rs = stAuthLogin.executeQuery();
            if(rs.next()){
                String getId = rs.getString("id_user");
                PreparedStatement stGetRole = koneksi.prepareStatement(sqlGetRole);
                stGetRole.setString(1, getId);
                ResultSet rsGetRole = stGetRole.executeQuery();
                if(rsGetRole.next()){
                        String getRole = rsGetRole.getString("posisi");
                        return getRole;
                }
            } else {
                error.getErrorKesalahan("Username/Kata sandi salah");
            }
        } catch (Exception e) {
            error.getErrorKesalahan("Gagal melakukan authentikasi akun " + e);
        }
        return null;
    }
}
