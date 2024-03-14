package Logic;

import Data_Acces.DbUserManager;
import java.security.MessageDigest;

public class ChangeUserDataControler {

    private String username;
    private String password;
    private String repassword;
    private String posisi;
    private String noHp;
    private String nama;
    private String alamat;
    private String nik;
    private ExceptionHandler error;

    public ChangeUserDataControler(String nik) {
        this.nik = nik;
    }

    public ChangeUserDataControler(String password, String repassword, String nik) {
        this.password = password;
        this.repassword = repassword;
        this.nik = nik;
    }

    public String cekNik() {
        DbUserManager dbUserManager = new DbUserManager();
        if (!nik.equalsIgnoreCase("NIK") && !nik.equals("")) {
            return dbUserManager.authResetPassword(nik);
        }
        return null;
    }

    private boolean verifPassword() {
        error = new ExceptionHandler();
        if (!password.equalsIgnoreCase("Enter New Password") && !password.equals("")
                && !repassword.equalsIgnoreCase("Re-Enter New Password") && !repassword.equals("")) {
            if (password.equalsIgnoreCase(repassword)) {
                return true;
            } else {
                error.getErrorKesalahan("Password harus sama");
            }
        } else {
            error.getErrorKesalahan("field tidak boleh ada yang kosong");
        }
        return false;
    }

    private String HashSandi(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA");
            md.update(password.getBytes());
            byte[] rbt = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : rbt) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            error.getErrorKesalahan("Gagal meng enkripsi password");
        }
        return null;
    }

    public boolean resetPassword() {
        error = new ExceptionHandler();
        DbUserManager dbUserManager = new DbUserManager();
        String hashPassword = HashSandi(password);
        if (verifPassword()) {
            dbUserManager.resetPassword(nik, hashPassword);
            error.getSucces("UPDATE SUCCES");
            return true;
        }
        return false;
    }
}
