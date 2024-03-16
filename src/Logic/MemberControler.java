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
    private ExceptionHandler exceptionHandler;

    public MemberControler(String idMember, String noHp, String namaMember, String alamatMember) {
        this.idMember = idMember;
        this.noHp = noHp;
        this.namaMember = namaMember;
        this.alamatMember = alamatMember;
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

    private String GenerateIdMember() {
        return idMember = "MBR" + GenerateRandom(4);
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
    
    private boolean cekNoHp(){
        DbMember dbMember = new DbMember(noHp);
        boolean cek = dbMember.cekMember();
        if (!cek) {
            return true;
        } else {
            exceptionHandler.getErrorKesalahan("Telephone number has been used !");
        }
        return false;
    }

    private boolean ValidateNoHp() {
        DbMember dbMember = new DbMember(noHp);
        if (noHp.matches("\\d+") && noHp.length() > 11 && noHp.length() < 14) {
            boolean cekNoHp = dbMember.cekMember();
                return true;
        } else {
            exceptionHandler.getErrorKesalahan("Invalid cellphone number !");
        }
        return false;
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
            if (ValidateName() && ValidateNoHp() && ValidateAddress()) {
                return true;
            }
        } else {
            exceptionHandler.getErrorKesalahan("The field cannot be empty !");
        }
        return false;
    }

    public boolean InsertMember() {
        GenerateIdMember();
        if (ValidateField() && cekNoHp()) {
            DbMember dbMember = new DbMember(idMember, noHp, namaMember, alamatMember);
            boolean succes = dbMember.InsertMember();
            if (succes) {
                return true;
            }
        }
        return false;
    }

    public boolean ChangeMember() {
        if (ValidateField()) {
            DbMember dbMember = new DbMember(idMember, noHp, namaMember, alamatMember);
            boolean succes = dbMember.ChangeMember();
            if (succes) {
                return true;
            }
        }
        return false;
    }
    
    public void DeleteMember(int row, JTable table){
        if(row != -1){
        this.idMember = table.getValueAt(row, 0).toString();
        DbMember dbMember = new DbMember(idMember, noHp, namaMember, alamatMember);
        dbMember.DeleteMember();
        } else {
            exceptionHandler.getErrorKesalahan("Select the data you want to delete!");
        }
    }

    public ConfigTable GetAllData() {
        DbMember dbMember = new DbMember(idMember, noHp, namaMember, alamatMember);
        return dbMember.GetAllDataMember();
    }

    public ArrayList<String> IsiField(int row, JTable table) {
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
}
