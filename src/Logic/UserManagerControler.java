package Logic;

import Data_Acces.DbUserManager;
import java.util.ArrayList;
import javax.swing.JTable;

public class UserManagerControler {

    private String username;
    private String password;
    private String idUser;
    private String nama;
    private String noHp;
    private String alamat;
    private String nik;
    private String role;
    private String nikLama;
    private String usernameLama;
    private String noHpLama;
    private ExceptionHandler exceptionHandler;
    private DbUserManager dbUserManager;

    public UserManagerControler(String username, String password, String idUser, String nama, String noHp, String alamat, String nik, String role) {
        this.username = username;
        this.password = password;
        this.idUser = idUser;
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
        this.nik = nik;
        this.role = role;
        exceptionHandler = new ExceptionHandler();
        dbUserManager = new DbUserManager();
    }

    // set nik lama
    public void SetNikLama(String nik) {
        this.nikLama = nik;
    }

    // set username lama;
    public void SetUsernameLama(String username) {
        this.usernameLama = username;
    }

    // set no hp lama
    public void SetNoHpLama(String noHp) {
        this.noHpLama = noHp;
    }

    // Validasi nik, harus berupa angka, berjumlah 16 dan pengecekan apakah telah terdaftar
    private boolean CekNik() {
        if (nik.matches("\\d+") && nik.length() == 16) {
            DbUserManager dbRegisterHandler = new DbUserManager();
            if (!dbRegisterHandler.cekNik(nik)) {
                return true;
            } else {
                exceptionHandler.getErrorKesalahan("NIK telah terdaftar");
            }
        } else {
            exceptionHandler.getErrorKesalahan("NIK tidak valid !");
        }
        return false;
    }

    // validasi username apakah telah digunakan
    private boolean cekUsername() {
        if (!dbUserManager.cekUsername(username)) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Username telah digunakan");
        }
        return false;
    }

    // cek ketersediaan noHp
    private boolean cekNoHp() {
        if (noHp.matches("\\d+") && noHp.length() > 11 && noHp.length() < 14) {
            if (!dbUserManager.CekNoHp(noHp)) {
                return true;
            } else {
                exceptionHandler.getErrorKesalahan("no hp telah digunakan");
            }
        } else {
            exceptionHandler.getErrorKesalahan("No Hp tidak valid !");
        }
        return false;
    }

    // validasi nik baru jika terjadi perubahan
    private boolean ValidateNikBaru() {
        if (nik.equalsIgnoreCase(nikLama)) {
            return true;
        } else if (CekNik()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean ValidasiUsernameBaru() {
        if (username.equalsIgnoreCase(usernameLama)) {
            return true;
        } else if (cekUsername()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean ValidasiNoHpBaru() {
        if (noHp.equalsIgnoreCase(noHpLama)) {
            return true;
        } else if (cekNoHp()) {
            return true;
        } else {
            return false;
        }
    }

    // validasi field nama;
    private boolean ValidasiNama() {
        if (nama.matches("[a-zA-Z .]+")) {
            if (nama.length() <= 25) {
                return true;
            } else {
                exceptionHandler.getErrorKesalahan("Nama tidak boleh lebih dari 25 Digit");
            }
        } else {
            exceptionHandler.getErrorKesalahan("Nama harus berupa huruf");
        }
        return false;
    }

    //validasi field alamat
    public boolean ValidasiAlamat() {
        if (alamat.length() <= 50) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Alamat tidak boleh lebih dari 50 Digit");
        }
        return false;
    }

    public boolean ValidasiField() {
        if (!nik.trim().equalsIgnoreCase("NIK") && !nik.equals("") && !nama.trim().equalsIgnoreCase("Name") && !nama.equals("")
                && !noHp.trim().equalsIgnoreCase("Phone Number") && !noHp.equals("") && !alamat.trim().equalsIgnoreCase("Address") && !alamat.equals("")) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Field tidak boleh ada yang kosong");
        }
        return false;
    }

    public boolean ValidateRow(int row, JTable table) {
        if (row != -1) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Select one of the product data you want to change");
        }
        return false;
    }

    // change data user di kelas user data
    public boolean ChangeUserData() {
        if (ValidateNikBaru() && ValidasiNoHpBaru() && ValidasiNama() && ValidasiAlamat() && ValidasiField()) {
            boolean succes = dbUserManager.ChangeUserData(idUser, nik, nama, noHp, alamat, role);
            if (succes) {
                return true;
            }
        }
        return false;
    }

    public boolean DeleteUserData(JTable table) {
        int getRow = table.getSelectedRow();
        if (getRow != -1) {
            idUser = table.getValueAt(getRow, 0).toString();
            boolean succes = dbUserManager.DeleteUserData(idUser);
            if (succes) {
                return true;
            }
        } else {
            exceptionHandler.getErrorKesalahan("Select one of the data you want to delete !");
        }

        return false;
    }

    // get all data pengguna
    public ConfigTable GetAllData() {
        return dbUserManager.GetAllDataPengguna();
    }

    // isi field change user data di kelas change user data(previlage owner)
    public ArrayList<String> IsiStringField(int row, JTable table) {
        ArrayList<String> data = new ArrayList<>();
        String idUser = table.getValueAt(row, 0).toString();
        String nik = table.getValueAt(row, 1).toString();
        String nama = table.getValueAt(row, 2).toString();
        String noHp = table.getValueAt(row, 3).toString();
        String alamat = table.getValueAt(row, 4).toString();
        String posisi = table.getValueAt(row, 5).toString();
        data.add(idUser);
        data.add(nik);
        data.add(nama);
        data.add(noHp);
        data.add(alamat);
        data.add(posisi);
        return data;
    }
}
