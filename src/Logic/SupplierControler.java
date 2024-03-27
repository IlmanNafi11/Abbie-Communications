package Logic;

import Data_Acces.DbSupplier;
import java.util.Random;
import javax.swing.JTable;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class SupplierControler {

    private String idSupplier;
    private String namaSupplier;
    private String noHp;
    private String kategori;
    private ExceptionHandler exceptionHandler;
    private DbSupplier dbSupplier;

    public SupplierControler(String idSupplier, String namaSupplier, String noHp, String kategori) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.noHp = noHp;
        this.kategori = kategori;
        exceptionHandler = new ExceptionHandler();
        dbSupplier = new DbSupplier();
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

    // get id supplier berdasakan kategori untuk combo box
    public ArrayList<String> GetIdSupplier() {
        ArrayList<String> idSupplier = new ArrayList<>();
        if (kategori != null) {
            try {
                idSupplier = dbSupplier.GetIdSupplier(kategori);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return idSupplier;
    }

    // get nama supplier berdasarkan id supplier di ComboBox
    public String GetSupplierName() {
        if (idSupplier != null) {
            namaSupplier = dbSupplier.GetSupplierName(idSupplier);
            if (namaSupplier != null) {
                return namaSupplier;
            }
        }
        return namaSupplier = "Supplier Name";
    }

    public boolean ValidationRow(JTable table) {
        int row = table.getSelectedRow();
        if (row != -1) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Select one of the data you want to change !");
        }
        return false;
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

    public ConfigTable GetAllData() {
        return dbSupplier.GetAllDataSupplier();
    }

    public ArrayList<String> IsiField(JTable table) {
        int row = table.getSelectedRow();
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

    public boolean InsertSupplierData() {
        if (ValueValidation()) {
            boolean confirm = exceptionHandler.confirmSaveDataPerson("Save Supplier Data?");
            if (confirm) {
                dbSupplier.InsertSupplierData(idSupplier, namaSupplier, noHp, kategori);
                return true;
            }
        }
        return false;
    }

    public boolean ChangeSupplierData() {
        if (ValueValidation()) {
            boolean confirm = exceptionHandler.confirmChangePerson("Change Supplier data?");
            if (confirm) {
                dbSupplier.ChangeSupplierData(idSupplier, namaSupplier, noHp, kategori);
                return true;
            }
        }
        return false;
    }

    public boolean DeleteDataSupplier(JTable tabel) {
        int getRow = tabel.getSelectedRow();
        if (getRow != -1) {
            idSupplier = tabel.getValueAt(getRow, 0).toString();
            boolean confirm = exceptionHandler.confirmDeleteData("Delete Supplier Data?");
            if (confirm) {
                dbSupplier.DeleteDataSupplier(idSupplier);
                return true;
            }
        } else {
            exceptionHandler.getErrorKesalahan("Select one of the data you want to delete !");
        }
        return false;
    }
}
