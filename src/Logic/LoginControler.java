package Logic;

import Data_Acces.DbUserManager;
import java.security.MessageDigest;

public class LoginControler {

    private String username;
    private String password;
    private DbUserManager dbUserManager;
    private ExceptionHandler exceptionHandler;

    public LoginControler(String username, String password) {
        this.username = username;
        this.password = password;
        exceptionHandler = new ExceptionHandler();
        dbUserManager = new DbUserManager();
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
            exceptionHandler.getErrorKesalahan("A failure occurred while trying to encrypt the password! " + e.getMessage());
        }
        return null;
    }

    private boolean VerifField() {
        if (!username.trim().equalsIgnoreCase("Username") && !username.trim().equals("")
                && !password.trim().equalsIgnoreCase("Password") && !password.trim().equalsIgnoreCase("")) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("All fields must be filled in!");
        }
        return false;
    }

    public String AuthLogin() {
        if (VerifField()) {
            String Hashpassword = HashSandi(password);
            String getRole = dbUserManager.AuthLogin(username, Hashpassword);
            return getRole;
        }
        return null;
    }
}
