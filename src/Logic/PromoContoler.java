package Logic;

import Data_Acces.DbPromo;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.util.Random;

public class PromoContoler {

    private String kodeDiskon;
    private String kategori;
    private int minimum;
    private int nilai;
    private String status;
    private ExceptionHandler exceptionHandler;
    private DbPromo dbPromo;

    public PromoContoler(String kodeDiskon, String kategori, int minimum, int nilai, String status) {
        this.kodeDiskon = kodeDiskon;
        this.kategori = kategori;
        this.minimum = minimum;
        this.nilai = nilai;
        this.status = status;
        exceptionHandler = new ExceptionHandler();
        dbPromo = new DbPromo();
    }

    private String GenerateRandom(int angka) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < angka; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }

    private String GenerateKodeDiskon() {
        if (kategori.equalsIgnoreCase("Minimum item purchase")) {
            this.kodeDiskon = "MIP" + GenerateRandom(4);
        } else if (kategori.equalsIgnoreCase("Minimum total expenditure")) {
            this.kodeDiskon = "MTE" + GenerateRandom(4);
        }
        return kodeDiskon;
    }

    public boolean ValidateRow(JTable table) {
        int row = table.getSelectedRow();
        if (row != -1) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Select one of the discount data you want to change");
        }
        return false;
    }

    private boolean ValidateKategori() {
        if (!kategori.equalsIgnoreCase("Category")) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Select a discount category!");
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
        String kategori = table.getValueAt(row, 1).toString();
        String status = table.getValueAt(row, 4).toString();
        data.add(kodePromo);
        data.add(kategori);
        data.add(status);
        return data;
    }

    public ArrayList<Integer> IsiIntField(JTable table) {
        int row = table.getSelectedRow();
        ArrayList<Integer> data = new ArrayList<>();
        int minimumPurchase = (Integer) table.getValueAt(row, 2);
        int amount = (Integer) table.getValueAt(row, 3);
        data.add(minimumPurchase);
        data.add(amount);
        return data;
    }

    public boolean InsertDiskon() {
        if (ValidateKategori() && ValidateStatus() && minimum != 0 && nilai != 0) {
            GenerateKodeDiskon();
            boolean confirm = exceptionHandler.confirmSave("Save Discount?");
            if (confirm) {
                dbPromo.InsertDiskon(kodeDiskon, kategori, minimum, nilai, status);
                return true;
            }
        }
        return false;
    }

    public boolean ChangeDiskon() {
        if (ValidateKategori() && ValidateStatus() && minimum != 0 && nilai != 0) {
            boolean confirm = exceptionHandler.confirmSave("Save changes?");
            if (confirm) {
                dbPromo.ChangeDiskon(kodeDiskon, kategori, minimum, nilai, status);
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
