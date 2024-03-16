package Logic;

import Data_Acces.DbSupplier;
import java.util.Random;
import javax.swing.JTable;
import java.util.ArrayList;

public class SupplierControler {

    private String idSupplier;
    private String namaSupplier;
    private String noHp;
    private String kategori;
    private ExceptionHandler exceptionHandler;

    public SupplierControler(String idSupplier, String namaSupplier, String noHp, String kategori) {
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

    public String GenerateIdSupplier() {
        String supplierId = null;
        if (kategori.equalsIgnoreCase("Accessories")) {
            supplierId = "SPA" + GenerateRandom(4);
        } else if (kategori.equalsIgnoreCase("Phone credit/Internet credit")) {
            supplierId = "SPC" + GenerateRandom(4);
        } else if (kategori.equalsIgnoreCase("Electronic")) {
            supplierId = "SPE" + GenerateRandom(4);
        } else if (kategori.equalsIgnoreCase("Part")) {
            supplierId = "SPP" + GenerateRandom(4);
        }
        return supplierId;
    }

    private boolean CategoryValidation() {
        if (!kategori.equalsIgnoreCase("Category")) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Select an available category");
        }
        return false;
    }

    private boolean ValueValidation() {
        if (!namaSupplier.equalsIgnoreCase("Supplier Name") && !namaSupplier.equals("") && !noHp.equalsIgnoreCase("Telephone Number") && !noHp.equals("")) {
            if (CategoryValidation() && NameValidation() && PhoneNumberValidation()) {
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
        if (noHp.matches("\\d+") && noHp.length() < 14 && noHp.length() > 11) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Telephone Number is invalid");
        }
        return false;
    }

    public boolean InsertSupplierData() {
        if (ValueValidation()) {
            DbSupplier dbSupplier = new DbSupplier(idSupplier, namaSupplier, noHp, kategori);
            boolean succes = dbSupplier.InsertSupplierData();
            if (succes) {
                return true;
            }
        }
        return false;
    }

    public boolean ChangeSupplierData() {
            if (ValueValidation()) {
                DbSupplier dbSupplier = new DbSupplier(idSupplier, namaSupplier, noHp, kategori);
                boolean succes = dbSupplier.ChangeSupplierData();
                if (succes) {
                    return true;
                }
            }
        return false;
    }

    public ConfigTable GetAllData() {
        DbSupplier dbSupplier = new DbSupplier(idSupplier, namaSupplier, noHp, kategori);
        return dbSupplier.GetAllDataSupplier();
    }

    public ArrayList<String> IsiField(int row, JTable table) {
        int getRow = table.getSelectedRow();
        ArrayList<String> data = new ArrayList<>();
        String supplierId = table.getValueAt(row, 0).toString();
        String namaSupplier = table.getValueAt(row, 1).toString();
        String noHp = table.getValueAt(row, 2).toString();
        String getKategori = table.getValueAt(row, 3).toString();
        data.add(supplierId);
        data.add(namaSupplier);
        data.add(noHp);
        data.add(getKategori);
        return data;
    }

    public boolean DeleteDataSupplier(JTable tabel) {
        int getRow = tabel.getSelectedRow();
        if (getRow != -1) {
            idSupplier = tabel.getValueAt(getRow, 0).toString();
            DbSupplier dbSupplier = new DbSupplier(idSupplier, null, null, null);
            boolean succes = dbSupplier.DeleteDataSupplier();
            if (succes) {
                return true;
            }
        } else {
            exceptionHandler.getErrorKesalahan("Select one of the data you want to delete !");
        }
        return false;
    }
}
