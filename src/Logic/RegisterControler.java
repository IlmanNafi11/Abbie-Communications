package Logic;

public class RegisterControler {
    private VerifikasiField verifikasi;
    public RegisterControler(VerifikasiField verif) {
        this.verifikasi = verif;
    }
    
    public void display(){
        System.out.println(verifikasi.getNama());
        System.out.println(verifikasi.getUsername());
    }
}
