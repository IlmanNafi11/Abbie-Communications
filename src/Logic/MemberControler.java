package Logic;

import Data_Acces.DbMember;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JTable;

public class MemberControler {

    private String idMember;
    private String noHp;
    private String namaMember;
    private String alamatMember;
    private String noHpLama;
    private ExceptionHandler exceptionHandler;
    private DbMember dbMember;

    public MemberControler(String idMember, String noHp, String namaMember, String alamatMember) {
        this.idMember = idMember;
        this.noHp = noHp;
        this.namaMember = namaMember;
        this.alamatMember = alamatMember;
        exceptionHandler = new ExceptionHandler();
        dbMember = new DbMember();
    }

    public void SetNoHpLama(String noHp) {
        this.noHpLama = noHp;
    }

    private String GenerateRandom(int angka) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < angka; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }

    private String GenerateIdMember() {
        return idMember = "MBR" + GenerateRandom(4);
    }

    public boolean ValidateRow(JTable table) {
        int row = table.getSelectedRow();
        if (row != -1) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Select the data you want to change!");
        }
        return false;
    }

    private boolean ValidateName() {
        if (namaMember.matches("[a-zA-Z .]+")) {
            if (namaMember.length() <= 25) {
                return true;
            } else {
                exceptionHandler.getErrorKesalahan("Member names must not exceed 25 characters !");
            }
        } else {
            exceptionHandler.getErrorKesalahan("Invalid member name !");
        }
        return false;
    }

    private boolean ValidateNoHp() {
        if (noHp.matches("\\d+") && noHp.length() > 11 && noHp.length() < 14) {
            boolean cekNoHp = dbMember.cekMember(noHp);
            if (!cekNoHp) {
                return true;
            } else {
                exceptionHandler.getErrorKesalahan("Telephone number has been used !");
            }
        } else {
            exceptionHandler.getErrorKesalahan("Invalid cellphone number !");
        }
        return false;
    }

    private boolean ValidateNoHpBaru() {
        boolean cekNoHp = dbMember.cekMember(noHp);
        if (noHp.equalsIgnoreCase(noHpLama)) {
            return true;
        } else if (!cekNoHp) {
            return true;
        } else {
            return false;
        }
    }

    private boolean ValidateAddress() {
        if (alamatMember.length() <= 50) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("The address must not exceed 50 characters !");
        }
        return false;
    }

    private boolean ValidateField() {
        if (!namaMember.equalsIgnoreCase("Member Name") && !namaMember.equals("") && !noHp.equalsIgnoreCase("Telephone Number") && !noHp.equals("")
                && !alamatMember.equalsIgnoreCase("Address") && !namaMember.equals("")) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("The field cannot be empty !");
        }
        return false;
    }

    public ConfigTable GetAllData() {
        return dbMember.GetAllDataMember();
    }

    public ArrayList<String> IsiField(JTable table) {
        int row = table.getSelectedRow();
        ArrayList<String> data = new ArrayList<>();
        String memberId = table.getValueAt(row, 0).toString();
        String nama = table.getValueAt(row, 1).toString();
        String noHpMember = table.getValueAt(row, 2).toString();
        String alamat = table.getValueAt(row, 3).toString();
        data.add(memberId);
        data.add(nama);
        data.add(noHpMember);
        data.add(alamat);
        return data;
    }

    public boolean InsertMember() {
        GenerateIdMember();
        if (ValidateField() && ValidateName() && ValidateNoHp() && ValidateAddress()) {
            boolean confirm = exceptionHandler.confirmSaveDataPerson("Save Member Data?");
            if (confirm) {
                dbMember.InsertMember(idMember, namaMember, noHp, alamatMember);
                return true;
            }
        }
        return false;
    }

    public boolean ChangeMember() {
        if (ValidateName() && ValidateNoHpBaru() && ValidateAddress()) {
            boolean confirm = exceptionHandler.confirmChangePerson("Change Member Data?");
            if (confirm) {
                dbMember.ChangeMember(namaMember, noHp, alamatMember, idMember);
                return true;
            }
        }
        return false;
    }

    public boolean DeleteMember(JTable table) {
        int row = table.getSelectedRow();
        if (row != -1) {
            this.idMember = table.getValueAt(row, 0).toString();
            boolean confirm = exceptionHandler.confirmDeleteData("Are you sure you deleted member data?");
            if (confirm) {
                dbMember.DeleteMember(idMember);
                return true;
            }
        } else {
            exceptionHandler.getErrorKesalahan("Select the data you want to delete!");
        }
        return false;
    }
}
