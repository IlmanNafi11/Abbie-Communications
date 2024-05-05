package Data_Acces;

import Connections.ClassKoneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Logic.*;

import java.util.ArrayList;

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
            exceptionHandler.Kesalahan("Failed when checking ID");
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
            exceptionHandler.Kesalahan("Failed while checking username");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection! ");
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
            exceptionHandler.Kesalahan("Failed to check phone number");
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

    public String AuthLogin(String username, String password, String idAkun) {
        exceptionHandler = new ExceptionHandler();
        String sqlGetUser = "SELECT * FROM akun WHERE username = ? AND password = ? OR id_akun = ?";
        String sqlGetRole = "SELECT * FROM data_pengguna WHERE id_user =?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stAuthLogin = koneksi.prepareStatement(sqlGetUser);
            stAuthLogin.setString(1, username);
            stAuthLogin.setString(2, password);
            stAuthLogin.setString(3, idAkun);
            ResultSet rs = stAuthLogin.executeQuery();
            if (rs.next()) {
                String getId = rs.getString("id_user");
                PreparedStatement stGetRole = koneksi.prepareStatement(sqlGetRole);
                stGetRole.setString(1, getId);
                ResultSet rsGetRole = stGetRole.executeQuery();
                if (rsGetRole.next()) {
                    return rsGetRole.getString("posisi");
                }
            } else {
                exceptionHandler.Kesalahan("Incorrect username or password or id akun not registered!");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred during authentication");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return null;
    }

    public String GetUsername(String role, String idUser) {
        exceptionHandler = new ExceptionHandler();
        String sqlIdAkun = "SELECT username FROM akun WHERE id_akun = ?";
        Connection koneksi = null;
        if (role != null) {
            try {
                koneksi = ClassKoneksi.GetConnection();
                PreparedStatement stGet = koneksi.prepareStatement(sqlIdAkun);
                stGet.setString(1, idUser);
                ResultSet rs = stGet.executeQuery();
                while (rs.next()) {
                    return rs.getString("username");
                }
            } catch (Exception e) {
                exceptionHandler.Kesalahan("There was a failure while trying to retrieve the user's username!");
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
                exceptionHandler.Kesalahan("NIK not found!");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred while searching for NIK data!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return null;
    }

    // get all data user untuk insert ke table
    public ArrayList<Object[]> GetAllDataPengguna() {
        exceptionHandler = new ExceptionHandler();
        ArrayList<Object[]> listDataPengguna = new ArrayList<>();
        String queryGetData = "SELECT dp.*, akun.id_akun FROM data_pengguna dp INNER JOIN akun ON dp.id_user = akun.id_user";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(queryGetData);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {
                String idUser = rs.getString("id_user");
                String nik = rs.getString("nik");
                String nama = rs.getString("nama");
                String noHp = rs.getString("noHp");
                String alamat = rs.getString("alamat");
                String posisi = rs.getString("posisi");
                String idAkun = rs.getString("id_akun");
                Object[] data = new Object[]{idUser, nik, nama, noHp, alamat, posisi, idAkun};
                listDataPengguna.add(data);
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("Failed when trying to get data ");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return listDataPengguna;
    }

    public ArrayList<Object[]> SearchDataPengguna(String inputSearch) {
        ArrayList<Object[]> listDataPengguna = new ArrayList<>();
        exceptionHandler = new ExceptionHandler();
        Connection koneksi = null;
        String querySerach = "SELECT dp.*, akun.id_akun FROM data_pengguna dp INNER JOIN akun ON dp.id_user = akun.id_user WHERE akun.id_akun LIKE ? OR dp.noHp LIKE ?";
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stSearch = koneksi.prepareStatement(querySerach);
            stSearch.setString(1, "%" + inputSearch + "%");
            stSearch.setString(2, "%" + inputSearch + "%");
            ResultSet rs = stSearch.executeQuery();
            while (rs.next()) {
                String idUser = rs.getString("id_user");
                String nik = rs.getString("nik");
                String nama = rs.getString("nama");
                String noHp = rs.getString("noHp");
                String alamat = rs.getString("alamat");
                String posisi = rs.getString("posisi");
                String idAkun = rs.getString("id_akun");
                Object[] data = new Object[]{idUser, nik, nama, noHp, alamat, posisi, idAkun};
                listDataPengguna.add(data);
            }
            if (listDataPengguna.isEmpty()) {
                exceptionHandler.Kesalahan("User data not found!");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred when trying to search for user data!");
            e.printStackTrace();
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return listDataPengguna;
    }

    // get data user untuk field menu profile
    public ArrayList<String> GetDataProfile(String username) {
        ArrayList<String> data = new ArrayList<>();
        exceptionHandler = new ExceptionHandler();
        String queryGetData = "SELECT dp.* FROM data_pengguna dp JOIN akun a ON dp.id_user = a.id_user WHERE a.username = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stGetData = koneksi.prepareStatement(queryGetData);
            stGetData.setString(1, username);
            ResultSet rs = stGetData.executeQuery();
            while (rs.next()) {
                data.add(rs.getString("id_user"));
                data.add(rs.getString("nik"));
                data.add(rs.getString("nama"));
                data.add(rs.getString("noHp"));
                data.add(rs.getString("alamat"));
                data.add(rs.getString("posisi"));
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred when trying to retrieve user data!");
        } finally {
            if (koneksi != null) {
                try {
                    koneksi.close();
                } catch (Exception e) {
                    exceptionHandler.Kesalahan("A failure occurred while disconnecting the database connection!");
                }
            }
        }
        return data;
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
            exceptionHandler.Kesalahan("An error occurred during the registration process!");
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
                exceptionHandler.SuccesSavePersonData("Password updated successfully");
                return true;
            } else {
                exceptionHandler.GagalTersimpan("A failure occurred while trying to fetch in user !");
            }
        } catch (Exception e) {
            exceptionHandler.Kesalahan("A failure occurred while trying to update the password!");
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
            exceptionHandler.SuccesSavePersonData("User data updated successfully!");
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("Failed when trying to update user data!");
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
            exceptionHandler.SuccesDeleteData("User data deleted successfully!");
        } catch (Exception e) {
            exceptionHandler.FailedDelete("Failed when trying to delete user data!");
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

    // update profile
    public void UpdateProfile(String idUser, String username, String namaUser, String nik, String noHp, String alamat) {
        exceptionHandler = new ExceptionHandler();
        String queryUpdateUserData = "UPDATE data_pengguna SET nik = ?, nama = ?, noHp = ?, alamat = ? WHERE id_user = ?";
        String queryUpdateAkun = "UPDATE akun SET username = ? WHERE id_user = ?";
        Connection koneksi = null;
        try {
            koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stUpdateUser = koneksi.prepareStatement(queryUpdateUserData);
            PreparedStatement stUpdateAkun = koneksi.prepareStatement(queryUpdateAkun);
            stUpdateUser.setString(1, nik);
            stUpdateUser.setString(2, namaUser);
            stUpdateUser.setString(3, noHp);
            stUpdateUser.setString(4, alamat);
            stUpdateUser.setString(5, idUser);

            stUpdateAkun.setString(1, username);
            stUpdateAkun.setString(2, idUser);
            stUpdateUser.executeUpdate();
            stUpdateAkun.executeUpdate();
            exceptionHandler.SuccesSavePersonData("Profile data updated successfully!");
        } catch (Exception e) {
            exceptionHandler.GagalTersimpan("Failed when trying to update profile!");
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
}
