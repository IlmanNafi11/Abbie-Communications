package Logic;

import Data_Acces.DbUserManager;
import java.security.MessageDigest;

public class LoginControler {

    private String username;
    private String password;
    private DbUserManager dbRegisterHandler;
    private ExceptionHandler error;

    public LoginControler(String username, String password) {
        this.username = username;
        this.password = password;
        error = new ExceptionHandler();
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

    private boolean verifField() {
        if (!username.trim().equalsIgnoreCase("Username") && !username.trim().equals("")
                && !password.trim().equalsIgnoreCase("Password") && !password.trim().equalsIgnoreCase("")) {
            return true;
        } else {
            error.getErrorKesalahan("Field tidak boleh ada yang kosong");
        }
        return false;
    }

    public String authLogin() {
        if (verifField()) {
            String Hashpassword = HashSandi(password);
            dbRegisterHandler = new DbUserManager();
            String getRole = dbRegisterHandler.authLogin(username, Hashpassword);
            return getRole;
        }
        return null;
    }
}
