package Logic;

import Data_Acces.DbUserManager;

public class AuthRegister {

    private String nik;
    private String nama;
    private String noHp;
    private String alamat;
    private String username;
    private String password;
    private String Repas;
    private String role;
    private String idAkun;
    private ExceptionHandler exceptionHandler;
    private DbUserManager dbUserManager;

    public AuthRegister(String nik, String nama, String noHp, String alamat, String username, String password, String rePass, String role, String idAkun) {
        this.nik = nik;
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
        this.username = username;
        this.password = password;
        this.Repas = rePass;
        this.role = role;
        this.idAkun = idAkun;
        exceptionHandler = new ExceptionHandler();
        dbUserManager = new DbUserManager();
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

    public String getIdAkun() {
        return idAkun;
    }

    private boolean VerifPassword() {
        if (password.trim().equalsIgnoreCase(Repas.trim())) {
            if (password.trim().length() >= 8) {
                return true;
            } else {
                exceptionHandler.Kesalahan("The password must consist of at least 8 characters!");
            }
        } else {
            exceptionHandler.Kesalahan("Password and password confirmation must have the same value");
        }
        return false;
    }
    
    private boolean VerifIdRfid(){
        if (!idAkun.trim().equalsIgnoreCase("RfidD ID, paste your Rfid ID card into the scanner") && idAkun.length() > 8 && idAkun.length() < 12) {
            return true;
        }
        return false;
    }

    private boolean VerifNik() {
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

    private boolean VerifNama() {
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

    private boolean VerifAlamat() {
        if (alamat.length() <= 50) {
            return true;
        } else {
            exceptionHandler.Kesalahan("The maximum address consists of 50 characters!");
        }
        return false;
    }

    private boolean VerifNoHp() {
        if (noHp.matches("\\d+") && noHp.length() > 11 && noHp.length() < 14 && noHp.startsWith("08")) {
            boolean cekNoHp = dbUserManager.CekNoHp(noHp);
            if (!cekNoHp) {
                return true;
            } else {
                exceptionHandler.Kesalahan("Telephone number has been used!");
            }
        } else {
            exceptionHandler.Kesalahan("Invalid phone number!");
        }
        return false;
    }

    private boolean CekUsername() {
        boolean cekUsername = !dbUserManager.CekUsername(username);
        if (cekUsername) {
            return true;
        } else {
            exceptionHandler.Kesalahan("Username has been used!");
        }
        return false;
    }

    public boolean VerifBio() {
        if (!nik.trim().equalsIgnoreCase("NIK") && !nik.equals("") && !nama.trim().equalsIgnoreCase("Name") && !nama.equals("")
                && !noHp.trim().equalsIgnoreCase("Phone Number") && !noHp.equals("") && !alamat.trim().equalsIgnoreCase("Address") && !alamat.equals("")) {
            if (VerifNik() && VerifNama() && VerifNoHp() && VerifAlamat()) {
                return true;
            }
        } else {
            exceptionHandler.Kesalahan("All fields must be filled in!");
        }
        return false;
    }

    public boolean VerifFieldAkun() {
        if (CekUsername()) {
            if (!username.trim().equalsIgnoreCase("Username") && !username.equals("") && !password.trim().equalsIgnoreCase("Password") && !Repas.trim().equalsIgnoreCase("Re-Enter Password")
                    && role != null && VerifIdRfid()) {
                if (VerifPassword()) {
                    return true;
                }
            } else {
                exceptionHandler.Kesalahan("All fields must be filled in!");
            }
        }
        return false;
    }

}
