package Logic;

import Data_Acces.DbRegisterHandler;
import javax.swing.JOptionPane;

public class AuthRegister {

    private String nik;
    private String nama;
    private String noHp;
    private String alamat;
    private String username;
    private String password;
    private String Repas;
    private String role;
    private ErrorHandler error;

    public AuthRegister(String nik, String nama, String noHp, String alamat, String username, String password, String rePass, String role) {
        this.nik = nik;
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
        this.username = username;
        this.password = password;
        this.Repas = rePass;
        this.role = role;
        error = new ErrorHandler();
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public boolean verifPassword() {
        if (password.trim().equalsIgnoreCase(Repas.trim())) {
            if (password.trim().length() >= 8) {
                return true;
            } else {
                error.getErrorKesalahan("Password harus lebih dari 8 digit");
            }
        } else {
            error.getErrorKesalahan("Password dengan repassword harus sama");
        }
        return false;
    }

    public boolean verifNik() {
        if (nik.matches("\\d+")) {
            if (nik.length() == 16) {
                DbRegisterHandler dbRegisterHandler = new DbRegisterHandler();
                if (!dbRegisterHandler.cekNik(nik)) {
                    return true;
                } else {
                    error.getErrorKesalahan("NIK telah terdaftar");
                }
            } else {
                error.getErrorKesalahan("NIK tidak valid : harus berjumlah 16");
            }
        } else {
            error.getErrorKesalahan("NIK tidak valid : NIK harus berupa angka");
        }
        return false;
    }

    public boolean verifNama() {
        if (nama.matches("[a-zA-Z]+")) {
            if (nama.length() <= 25) {
                return true;
            } else {
                error.getErrorKesalahan("Nama tidak boleh lebih dari 25 Digit");
            }
        } else {
            error.getErrorKesalahan("Nama harus berupa huruf");
        }
        return false;
    }

    public boolean verifAlamat() {
        if (alamat.length() <= 50) {
            return true;
        } else {
            error.getErrorKesalahan("Alamat tidak boleh lebih dari 50 Digit");
        }
        return false;
    }

    public boolean verifNoHp() {
        if (noHp.matches("\\d+")) {
            if (noHp.length() > 11 && noHp.length() < 14) {
                return true;
            } else {
                error.getErrorKesalahan("No Hp tidak valid : No Hp harus berjumlah antara 12-13 digit");
            }
        } else {
            error.getErrorKesalahan("No Hp tidak valid : No Hp harus berupa angka");
        }
        return false;
    }

    private boolean cekUsername() {
        DbRegisterHandler dbRegisterHandler = new DbRegisterHandler();
        if (!dbRegisterHandler.cekUsername(username)) {
            return true;
        } else {
            error.getErrorKesalahan("Username telah digunakan");
        }
        return false;
    }

    public boolean verifBio() {
        if (!nik.trim().equalsIgnoreCase("NIK") && !nik.equals("") && !nama.trim().equalsIgnoreCase("Name") && !nama.equals("")
                && !noHp.trim().equalsIgnoreCase("Phone Number") && !noHp.equals("") && !alamat.trim().equalsIgnoreCase("Address") && !alamat.equals("")) {
            if (verifNik() && verifNama() && verifNoHp() && verifAlamat()) {
                return true;
            }
        } else {
            error.getErrorKesalahan("Field tidak boleh ada yang kosong");
        }
        return false;
    }

    public boolean verifFieldAkun() {
        if (cekUsername()) {
            if (verifPassword()) {
                if (!username.trim().equalsIgnoreCase("Username") && !username.equals("") && !password.trim().equalsIgnoreCase("Password") && !password.equals("")
                        && !role.trim().equals("")) {
                    return true;
                } else {
                    error.getErrorKesalahan("Field tidak boleh ada yang kosong");
                }
            }
        }
        return false;
    }

}
