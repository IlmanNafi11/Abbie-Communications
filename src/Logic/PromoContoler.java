package Logic;

import Data_Acces.DbPromo;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.util.Random;

public class PromoContoler {

    private String kodeDiskon;
    private int minimum;
    private int nilai;
    private String status;
    private ExceptionHandler exceptionHandler;
    private DbPromo dbPromo;

    public PromoContoler(String kodeDiskon, int minimum, int nilai, String status) {
        this.kodeDiskon = kodeDiskon;
        this.minimum = minimum;
        this.nilai = nilai;
        this.status = status;
        exceptionHandler = new ExceptionHandler();
        dbPromo = new DbPromo();
    }
    
    // get kode diskon untuk transaksi
    public ArrayList<String> getKodeDiskon(int total) {
        ArrayList<String> kode = dbPromo.GetKodeDiskon(total);
        return kode;
    }
    
    // get jumlah diskon untuk transaksi
    public int GetDiscountAmount(){
        return dbPromo.GetDiskon(kodeDiskon);
    }
    
    // Men generate angka random
    private String GenerateRandom(int angka) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < angka; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }

    // generate kode diskon
    private String GenerateKodeDiskon() {
        kodeDiskon = "DSC" + GenerateRandom(4);
        return kodeDiskon;
    }

    // validasi baris table sebelum aksi update
    public boolean ValidateRow(JTable table) {
        int row = table.getSelectedRow();
        if (row != -1) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Select one of the discount data you want to change");
        }
        return false;
    }

    public int ValidateMinPurchase(JTextField txtMinPurchase) {
        try {
            this.minimum = Integer.parseInt(txtMinPurchase.getText());
            if (minimum != 0) {
                return minimum;
            } else {
                exceptionHandler.getErrorKesalahan("Minimum purchase is invalid!");
            }
        } catch (NumberFormatException e) {
            exceptionHandler.getErrorKesalahan("Minimum purchase is invalid!");

        }
        return 0;
    }

    public int ValidateValue(JTextField txtValue) {
        try {
            this.nilai = Integer.parseInt(txtValue.getText());
            if (nilai != 0) {
                return nilai;
            } else {
                exceptionHandler.getErrorKesalahan("Invalid discount amount!");
            }
        } catch (NumberFormatException e) {
            exceptionHandler.getErrorKesalahan("Invalid discount amount!");
        }
        return 0;
    }

    private boolean ValidateStatus() {
        if (!status.equalsIgnoreCase("Status")) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Select discount status!");
        }
        return false;
    }

    public ConfigTable GetAllData() {
        return dbPromo.GetAllDataPromo();
    }

    public ArrayList<String> IsiStringField(JTable table) {
        int row = table.getSelectedRow();
        ArrayList<String> data = new ArrayList<>();
        String kodePromo = table.getValueAt(row, 0).toString();
        String status = table.getValueAt(row, 3).toString();
        data.add(kodePromo);
        data.add(status);
        return data;
    }

    public ArrayList<Integer> IsiIntField(JTable table) {
        int row = table.getSelectedRow();
        ArrayList<Integer> data = new ArrayList<>();
        int minimumPurchase = (Integer) table.getValueAt(row, 1);
        int amount = (Integer) table.getValueAt(row, 2);
        data.add(minimumPurchase);
        data.add(amount);
        return data;
    }

    public boolean InsertDiskon() {
        if (ValidateStatus() && minimum != 0 && nilai != 0) {
            GenerateKodeDiskon();
            boolean confirm = exceptionHandler.confirmSave("Save Discount?");
            if (confirm) {
                dbPromo.InsertDiskon(kodeDiskon, minimum, nilai, status);
                return true;
            }
        }
        return false;
    }

    public boolean ChangeDiskon() {
        if (ValidateStatus() && minimum != 0 && nilai != 0) {
            boolean confirm = exceptionHandler.confirmSave("Save changes?");
            if (confirm) {
                dbPromo.ChangeDiskon(kodeDiskon, minimum, nilai, status);
                return true;
            }
        }
        return false;
    }

    public boolean DeleteDiskon(JTable table) {
        int row = table.getSelectedRow();
        boolean confirm = exceptionHandler.confirmDeleteData("Delete Discount?");
        if (row != -1) {
            this.kodeDiskon = table.getValueAt(row, 0).toString();
            if (confirm) {
                dbPromo.DeleteDiskon(kodeDiskon);
                return true;
            }
        } else {
            exceptionHandler.getErrorKesalahan("Select the discount data you want to delete!");
        }
        return false;
    }

}
