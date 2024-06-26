package Logic;

import Data_Acces.DbUserManager;
import java.security.MessageDigest;
import java.util.ArrayList;

public class LoginControler {

    private String username;
    private String password;
    private String idAkun;
    private DbUserManager dbUserManager;
    private ExceptionHandler exceptionHandler;

    public LoginControler(String username, String password, String idAkun) {
        this.username = username;
        this.password = password;
        this.idAkun = idAkun;
        exceptionHandler = new ExceptionHandler();
        dbUserManager = new DbUserManager();
    }
    
    public ArrayList<String> DataProfile(){
        return dbUserManager.GetDataProfile(username);
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

    private boolean VerifField() {
        if (!username.trim().equalsIgnoreCase("Username") && !username.trim().equals("")
                && !password.trim().equalsIgnoreCase("Password") && !password.trim().equalsIgnoreCase("")) {
            return true;
        } else {
            exceptionHandler.Kesalahan("All fields must be filled in!");
        }
        return false;
    }

    public String GetUsername(String role, String idAkun) {
        return dbUserManager.GetUsername(role, idAkun);
    }

    public String AuthLoginWithUsername() {
        if (VerifField()) {
            String Hashpassword = HashSandi(password);
            String role = dbUserManager.AuthLogin(username, Hashpassword, idAkun);
            if (role != null) {
                return role;
            } else {
                exceptionHandler.Kesalahan("Incorrect username or password!");
            }
        }
        return null;
    }

    public String AuthLoginRfid(){
        String role = dbUserManager.AuthLogin(username, null, idAkun);
        if (role != null) {
            return role;
        } else {
            exceptionHandler.Kesalahan("RFID ID not registered!");
        }
        return null;
    }
}
