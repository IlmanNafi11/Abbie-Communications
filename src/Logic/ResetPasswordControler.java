package Logic;

import Data_Acces.DbUserManager;
import java.security.MessageDigest;

public class ResetPasswordControler {

    private String password;
    private String repassword;
    private String nik;
    private ExceptionHandler exceptionHandler;
    private DbUserManager dbUserManager;

    public ResetPasswordControler(String password, String repassword, String nik) {
        this.password = password;
        this.repassword = repassword;
        this.nik = nik;
        exceptionHandler = new ExceptionHandler();
        dbUserManager = new DbUserManager();
    }

    public String GetName() {
        if (!nik.equalsIgnoreCase("NIK") && !nik.equals("")) {
            return dbUserManager.AuthResetPassword(nik);
        } else {
            exceptionHandler.Kesalahan("Please enter your NIK!");
        }
        return null;
    }

    private boolean VerifPassword() {
        if (!password.equalsIgnoreCase("Enter New Password") && !password.equals("")
                && !repassword.equalsIgnoreCase("Re-Enter New Password") && !repassword.equals("")) {
            if (password.equalsIgnoreCase(repassword)) {
                return true;
            } else {
                exceptionHandler.Kesalahan("Password and confirm password must be the same value!");
            }
        } else {
            exceptionHandler.Kesalahan("All fields must be filled in!");
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
            exceptionHandler.Kesalahan("A failure occurred while trying to encrypt the password!");
        }
        return null;
    }

    public boolean ResetPassword() {
        String hashPassword = HashSandi(password);
        if (VerifPassword()) {
            boolean confirm = exceptionHandler.ConfirmChangePerson("Are you sure you want to update your password? make sure the new password is easy to remember!");
            if (confirm) {
                dbUserManager.ResetPassword(nik, hashPassword);
                return true;
            }
        }
        return false;
    }
}
