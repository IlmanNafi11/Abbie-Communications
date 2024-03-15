package Logic;

import Data_Acces.DbSupplier;
import java.util.Random;

public class SupplierControler {

    private String idSupplier;
    private String namaSupplier;
    private String noHp;
    private String kategori;
    private ExceptionHandler exceptionHandler;

    public SupplierControler(String idSupplier,String namaSupplier, String noHp, String kategori) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.noHp = noHp;
        this.kategori = kategori;
        exceptionHandler = new ExceptionHandler();
    }

    private String GenerateRandom(int angka) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < angka; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }

    private String GenerateIdSupplier() {
        String defaultValue = "SUP";
        String supplierId = defaultValue + GenerateRandom(4);
        return supplierId;
    }

    private boolean ValueValidation() {
        if (!namaSupplier.equalsIgnoreCase("Supplier Name") && !namaSupplier.equals("") && !noHp.equalsIgnoreCase("Telephone Number") && !noHp.equals("")) {
            if (NameValidation() && PhoneNumberValidation()) {
                return true;
            }
        } else {
        exceptionHandler.getErrorKesalahan("All columns is must be filled in");
        }
        
        return false;
    }

    private boolean NameValidation() {
        if (namaSupplier.matches("[a-zA-Z .]+")) {
            if (namaSupplier.length() <= 25) {
                return true;
            } else {
                exceptionHandler.getErrorKesalahan("The Supplier Name must not exceed 25 digits");
            }
        } else {
            exceptionHandler.getErrorKesalahan("Supplier Name is invalid !");
        }
        return false;
    }

    private boolean PhoneNumberValidation() {
        if (noHp.matches("\\d+") && noHp.length() <= 13) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Telephone Number is invalid");
        }
        return false;
    }
    
    public void InsertSupplierData(){
        DbSupplier dbSupplier = new DbSupplier(idSupplier, namaSupplier, noHp, kategori);
        dbSupplier.InsertSupplierData();
    }
    
    public void ChangeSupplierData(){
        DbSupplier dbSupplier = new DbSupplier(idSupplier, namaSupplier, noHp, kategori);
        dbSupplier.ChangeSupplierData();
    }
}
