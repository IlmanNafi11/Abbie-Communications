package Logic;

import Data_Acces.DbUserManager;
import java.security.MessageDigest;
import java.util.Random;

public class RegisterControler {

    private AuthRegister verifikasi;
    private String nik;
    private String nama;
    private String noHp;
    private String alamat;
    private String username;
    private String password;
    private String role;
    private String idAkun;
    private ExceptionHandler exceptionHandler;
    private DbUserManager dbUserManager;

    public RegisterControler(AuthRegister verif) {
        this.verifikasi = verif;
        this.nik = verifikasi.getNik();
        this.nama = verifikasi.getNama();
        this.noHp = verifikasi.getNoHp();
        this.alamat = verifikasi.getAlamat();
        this.username = verifikasi.getUsername();
        this.password = verifikasi.getPassword();
        this.role = verifikasi.getRole();
        this.idAkun = verifikasi.getIdAkun();
        exceptionHandler = new ExceptionHandler();
        dbUserManager = new DbUserManager();
    }

    public String generateIdUser() {
        String defaultValue = "USR";
        String userId = defaultValue + generateRandom(4);
        return userId;
    }

//    public String generateIdAkun() {
//        String defaultValue = "ACN";
//        String userId = defaultValue + generateRandom(4);
//        return userId;
//    }

    public String generateRandom(int angka) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < angka; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }

    public String HashSandi(String password) {
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

    public boolean InsertData() {
        DbUserManager insert = new DbUserManager();
        String HashPassword = HashSandi(password);
        boolean confirm = exceptionHandler.confirmSave("Save account? Make sure all data has been filled in correctly!");
        if (confirm) {
            insert.AddData(generateIdUser(), idAkun, nik, nama, noHp, alamat, username, HashPassword, role);
            exceptionHandler.getSucces("Hooray, Registration has been successful!");
            return true;
        }
        return false;
    }
}
