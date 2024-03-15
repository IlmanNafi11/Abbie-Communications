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
    private ExceptionHandler error;

    public RegisterControler(AuthRegister verif) {
        this.verifikasi = verif;
        this.nik = verifikasi.getNik();
        this.nama = verifikasi.getNama();
        this.noHp = verifikasi.getNoHp();
        this.alamat = verifikasi.getAlamat();
        this.username = verifikasi.getUsername();
        this.password = verifikasi.getPassword();
        this.role = verifikasi.getRole();
        error = new ExceptionHandler();
    }

    public String generateIdUser() {
        String defaultValue = "USR";
        String userId = defaultValue + generateRandom(4);
        return userId;
    }

    public String generateIdAkun() {
        String defaultValue = "ACN";
        String userId = defaultValue + generateRandom(4);
        return userId;
    }

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
            error.getErrorKesalahan("Gagal meng enkripsi password");
        }
        return null;
    }

    public boolean InsertData() {
        DbUserManager insert = new DbUserManager();
        String HashPassword = HashSandi(password);
        boolean confirm = error.confirmSave("Save Account?");
        if (confirm) {
            insert.add(generateIdUser(), generateIdAkun(), nik, nama, noHp, alamat, username, HashPassword, role);
            error.getSucces("Succes");
            return true;
        }
        return false;
    }
}
