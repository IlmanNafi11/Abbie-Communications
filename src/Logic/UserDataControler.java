package Logic;

import Data_Acces.DbUserManager;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;

public class UserDataControler {

    private String username;
    private String password;
    private String idUser;
    private String nama;
    private String noHp;
    private String alamat;
    private String nik;
    private String role;
    private String nikLama;
    private String noHpLama;
    private String usernameLama;
    private ExceptionHandler exceptionHandler;
    private DbUserManager dbUserManager;
    private ConfigTable model;

    public UserDataControler(String username, String password, String idUser, String nama, String noHp, String alamat, String nik, String role) {
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

    // set no hp lama
    public void SetNoHpLama(String noHp) {
        this.noHpLama = noHp;
    }

    public void SetUsernameLama(String usernameLama) {
        this.usernameLama = usernameLama;
    }

    // Validasi nik, harus berupa angka, berjumlah 16 dan pengecekan apakah telah terdaftar
    private boolean CekNik() {
        if (nik.matches("\\d+") && nik.length() == 16) {
            if (!dbUserManager.CekNik(nik)) {
                return true;
            } else {
                exceptionHandler.Kesalahan("Nik has registered!");
            }
        } else {
            exceptionHandler.Kesalahan("Nik is invalid!");
        }
        return false;
    }

    // cek ketersediaan noHp
    private boolean CekNoHp() {
        if (noHp.matches("\\d+") && noHp.length() > 11 && noHp.length() < 14) {
            if (!dbUserManager.CekNoHp(noHp)) {
                return true;
            } else {
                exceptionHandler.Kesalahan("The phone number is already in use!");
            }
        } else {
            exceptionHandler.Kesalahan("Invalid phone number!");
        }
        return false;
    }

    private boolean CekUsername() {
        boolean cekUsername = dbUserManager.CekUsername(username);
        if (!cekUsername) {
            return true;
        } else {
            exceptionHandler.Kesalahan("Username has been used!");
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

    private boolean ValidasiNoHpBaru() {
        if (noHp.equalsIgnoreCase(noHpLama)) {
            return true;
        } else if (CekNoHp()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean ValidasiUsernameBaru() {
        if (!username.equalsIgnoreCase("Username") && !username.equals("")) {
            if (username.equalsIgnoreCase(usernameLama)) {
                return true;
            } else if (CekUsername()) {
                return true;
            } else {
                return false;
            }
        } else {
            exceptionHandler.Kesalahan("All fields must be filled in!");
        }
        return false;
    }

    // validasi field nama;
    private boolean ValidasiNama() {
        if (nama.matches("[a-zA-Z .]+")) {
            if (nama.length() <= 25) {
                return true;
            } else {
                exceptionHandler.Kesalahan("The maximum name must be 25 characters!");
            }
        } else {
            exceptionHandler.Kesalahan("Invalid name!");
        }
        return false;
    }

    //validasi field alamat
    private boolean ValidasiAlamat() {
        if (alamat.length() <= 50) {
            return true;
        } else {
            exceptionHandler.Kesalahan("The maximum address consists of 50 characters!");
        }
        return false;
    }

    private boolean ValidasiRole() {
        if (!role.equalsIgnoreCase("Position")) {
            return true;
        } else {
            exceptionHandler.Kesalahan("Please, Select a user position!");
        }
        return false;
    }

    private boolean ValidasiField() {
        if (!nik.trim().equalsIgnoreCase("NIK") && !nik.equals("") && !nama.trim().equalsIgnoreCase("Name") && !nama.equals("")
                && !noHp.trim().equalsIgnoreCase("Phone Number") && !noHp.equals("") && !alamat.trim().equalsIgnoreCase("Address") && !alamat.equals("")) {
            return true;
        } else {
            exceptionHandler.Kesalahan("All fields must be filled in!");
        }
        return false;
    }

    public boolean ValidateRow(JTable table) {
        int row = table.getSelectedRow();
        if (row != -1) {
            return true;
        } else {
            exceptionHandler.Kesalahan("Select one of the product data you want to change");
        }
        return false;
    }

    // get all data pengguna
    public ConfigTable SetModelTable() {
        model = new ConfigTable();
        model.addColumn("User ID");
        model.addColumn("NIK");
        model.addColumn("Name");
        model.addColumn("Phone Number");
        model.addColumn("Address");
        model.addColumn("Position");
        model.addColumn("Account ID");
        return model;
    }

    public void GetAllData(JTable table) {
        model = (ConfigTable) table.getModel();
        ArrayList<Object[]> listDataPengguna = dbUserManager.GetAllDataPengguna();
        for (Object[] data : listDataPengguna) {
            model.addRow(data);
        }
    }

    public void SearchDataPengguna(JTable table, JTextField txtSearch) {
        String teksSearch = txtSearch.getText();
        model = (ConfigTable) table.getModel();
        model.setRowCount(0);
        ArrayList<Object[]> DataPengguna;
        if (!teksSearch.equalsIgnoreCase("Enter account ID or telephone number here")) {
            DataPengguna = dbUserManager.SearchDataPengguna(teksSearch);
            if (DataPengguna.isEmpty()) {
                DataPengguna = dbUserManager.GetAllDataPengguna();
                for (Object[] data : DataPengguna) {
                    model.addRow(data);
                }
            } else {
                for (Object[] data : DataPengguna) {
                    model.addRow(data);
                }
            }
            txtSearch.setText("Enter account ID or telephone number here");
            txtSearch.setForeground(new Color(153, 153, 153));
        } else {
            exceptionHandler.Kesalahan("Please enter the account ID or telephone number of the user you want to search for!");
            DataPengguna = dbUserManager.GetAllDataPengguna();
            for (Object[] data : DataPengguna) {
                model.addRow(data);
            }
        }
    }

    // isi field change user data di kelas change user data(previlage owner)
    public ArrayList<String> IsiStringField(JTable table) {
        int row = table.getSelectedRow();
        ArrayList<String> data = new ArrayList<>();
        idUser = table.getValueAt(row, 0).toString();
        nik = table.getValueAt(row, 1).toString();
        nama = table.getValueAt(row, 2).toString();
        noHp = table.getValueAt(row, 3).toString();
        alamat = table.getValueAt(row, 4).toString();
        String posisi = table.getValueAt(row, 5).toString();
        data.add(idUser);
        data.add(nik);
        data.add(nama);
        data.add(noHp);
        data.add(alamat);
        data.add(posisi);
        return data;
    }

    // change data user di kelas user data
    public boolean ChangeUserData() {
        if (ValidateNikBaru() && ValidasiNoHpBaru() && ValidasiNama() && ValidasiAlamat() && ValidasiField() && ValidasiRole()) {
            boolean confirm = exceptionHandler.ConfirmChangePerson("Update user data?");
            if (confirm) {
                dbUserManager.ChangeUserData(idUser, nik, nama, noHp, alamat, role);
                return true;
            }
        }
        return false;
    }

    public boolean DeleteUserData(JTable table) {
        int getRow = table.getSelectedRow();
        if (getRow != -1) {
            idUser = table.getValueAt(getRow, 0).toString();
            boolean confirm = exceptionHandler.ConfirmDeleteData("Warning! Are you sure you want to delete user data?" + "\nThis activity can cause the user's account to be deleted!");
            if (confirm) {
                dbUserManager.DeleteUserData(idUser);
                return true;
            }
        } else {
            exceptionHandler.Kesalahan("Select one of the data you want to delete !");
        }
        return false;
    }

    public boolean UpdateProfile() {
        if (ValidateNikBaru() && ValidasiUsernameBaru() && ValidasiNoHpBaru() && ValidasiField() && ValidasiNama() && ValidasiAlamat()) {
            boolean confirm = exceptionHandler.ConfirmChangePerson("Update profile?");
            if (confirm) {
                dbUserManager.UpdateProfile(idUser, username, nama, nik, noHp, alamat);
                return true;
            }
        }
        return false;
    }
}
