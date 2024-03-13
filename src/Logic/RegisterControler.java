package Logic;

public class RegisterControler {
    private String nik;
    private String nama;
    private String noHp;
    private String alamat;
    private String username;
    private String password;
    private String role;

    public RegisterControler(String nik, String nama, String noHp, String alamat, String username, String password, String role) {
        this.nik = nik;
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
        this.username = username;
        this.password = password;
        this.role = role;
    }
     
    public void display(){
        System.out.println(nik);
        System.out.println(username);
    }
}
