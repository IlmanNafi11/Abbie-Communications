package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;

public class DbUserManager {

    private ExceptionHandler exceptionHandler;

    public boolean CekNik(String nik) {
        exceptionHandler = new ExceptionHandler();
        String sqlNik = "SELECT COUNT(*) FROM data_pengguna WHERE nik=?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stNik = koneksi.prepareStatement(sqlNik);
            stNik.setString(1, nik);
            ResultSet rs = stNik.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when checking ID");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!" + e.getMessage());
                }
            }
        }
        return false;
    }

    // cek apakah username telah digunakan
    public boolean CekUsername(String username) {
        exceptionHandler = new ExceptionHandler();
        String sqlUsername = "SELECT COUNT(*) FROM akun WHERE LOWER(username)= LOWER(?)";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stUsername = koneksi.prepareStatement(sqlUsername);
            stUsername.setString(1, username);
            ResultSet rs = stUsername.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed while checking username");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
                }
            }
        }
        return false;
    }

    public boolean CekNoHp(String noHp) {
        exceptionHandler = new ExceptionHandler();
        String queryCek = "SELECT COUNT(*) FROM data_pengguna WHERE noHp= ? ";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stCek = koneksi.prepareStatement(queryCek);
            stCek.setString(1, noHp);
            ResultSet rs = stCek.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to check phone number");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
                }
            }
        }
        return false;
    }

    public String AuthLogin(String username, String password) {
        exceptionHandler = new ExceptionHandler();
        String sqlGetUser = "SELECT * FROM akun WHERE username = ? AND password = ?";
        String sqlGetRole = "SELECT * FROM data_pengguna WHERE id_user =?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stAuthLogin = koneksi.prepareStatement(sqlGetUser);
            stAuthLogin.setString(1, username);
            stAuthLogin.setString(2, password);
            ResultSet rs = stAuthLogin.executeQuery();
            if (rs.next()) {
                String getId = rs.getString("id_user");
                PreparedStatement stGetRole = koneksi.prepareStatement(sqlGetRole);
                stGetRole.setString(1, getId);
                ResultSet rsGetRole = stGetRole.executeQuery();
                if (rsGetRole.next()) {
                    String getRole = rsGetRole.getString("posisi");
                    return getRole;
                }
            } else {
                exceptionHandler.getErrorKesalahan("Incorrect username or password!");
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("A failure occurred during authentication " + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
                }
            }
        }
        return null;
    }

    public String AuthResetPassword(String nik) {
        exceptionHandler = new ExceptionHandler();
        String sqlNik = "SELECT * FROM data_pengguna WHERE nik = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stCek = koneksi.prepareStatement(sqlNik);
            stCek.setString(1, nik);
            ResultSet rs = stCek.executeQuery();
            if (rs.next()) {
                String getName = rs.getString("nama");
                return getName;
            } else {
                exceptionHandler.getErrorKesalahan("NIK tidak ditemukan");
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Gagal saat mencoba mencari nik");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
                }
            }
        }
        return null;
    }

    // get all data user untuk insert ke table
    public ConfigTable GetAllDataPengguna() {
        exceptionHandler = new ExceptionHandler();
        ConfigTable dataTable = new ConfigTable();
        String queryGetData = "SELECT dp.*, akun.id_akun FROM data_pengguna dp INNER JOIN akun ON dp.id_user = akun.id_user";
        dataTable.addColumn("User ID");
        dataTable.addColumn("NIK");
        dataTable.addColumn("Name");
        dataTable.addColumn("Phone Number");
        dataTable.addColumn("Address");
        dataTable.addColumn("Position");
        dataTable.addColumn("Account ID");
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(queryGetData);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {
                dataTable.addRow(new Object[]{
                    rs.getString("id_user"),
                    rs.getString("nik"),
                    rs.getString("nama"),
                    rs.getString("noHp"),
                    rs.getString("alamat"),
                    rs.getString("posisi"),
                    rs.getString("id_akun")
                });
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to get data " + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection!" + e.getMessage());
                }
            }
        }
        return dataTable;
    }

    public void AddData(String id_user, String id_akun, String nik, String nama, String noHp, String alamat, String username, String password, String role) {
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
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
            exceptionHandler.getErrorKesalahan("An error occurred during the registration process!" + e.getMessage());
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

    public boolean ResetPassword(String nik, String password) {
        exceptionHandler = new ExceptionHandler();
        String queryGetIdUser = "SELECT * FROM data_pengguna WHERE nik = ?";
        String queryUpdatePass = "UPDATE akun SET password = ? WHERE id_user = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetId = koneksi.prepareStatement(queryGetIdUser);
            stGetId.setString(1, nik);
            ResultSet rsGetId = stGetId.executeQuery();
            if (rsGetId.next()) {
                String getId = rsGetId.getString("id_user");
                PreparedStatement stReset = koneksi.prepareStatement(queryUpdatePass);
                stReset.setString(1, password);
                stReset.setString(2, getId);
                stReset.executeUpdate();
                exceptionHandler.getSucces("Password updated successfully");
                return true;
            } else {
                exceptionHandler.getErrorKesalahan("A failure occurred while trying to fetch in user !");
            }
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("A failure occurred while trying to update the password! " + e.getMessage());
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.getErrorKesalahan("A failure occurred while disconnecting the database connection! " + e.getMessage());
                }
            }
        }
        return false;
    }

    // db User Data
    // update data pengguna(owner previlage)
    public void ChangeUserData(String userId, String nik, String nama, String noHp, String alamat, String posisi) {
        String queryUpdate = "UPDATE data_pengguna SET nik = ?, nama = ?, noHp = ?, alamat = ?, posisi = ? WHERE id_user = ?";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stUpdate = koneksi.prepareStatement(queryUpdate);
            stUpdate.setString(1, nik);
            stUpdate.setString(2, nama);
            stUpdate.setString(3, noHp);
            stUpdate.setString(4, alamat);
            stUpdate.setString(5, posisi);
            stUpdate.setString(6, userId);
            stUpdate.executeUpdate();
            exceptionHandler.getSucces("User data updated successfully!");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to update user data! " + e.getMessage());
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

    // delete data pengguna(owner previlage)
    public void DeleteUserData(String idUser) {
        String queryDelete = "DELETE FROM data_pengguna WHERE id_user = ?";
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stDelete = koneksi.prepareStatement(queryDelete);
            stDelete.setString(1, idUser);
            stDelete.executeUpdate();
            exceptionHandler.succesDeleteData("User data deleted successfully!");
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed when trying to delete user data! " + e.getMessage());
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
}
