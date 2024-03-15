package Data_Acces;

import Connections.ClassKoneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Logic.*;
public class DbSupplier {
    private String idSupplier;
    private String namaSupplier;
    private String noHp;
    private String kategori;
    private ExceptionHandler exceptionHandler;

    public DbSupplier(String idSupplier, String namaSupplier, String noHp, String kategori) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.noHp = noHp;
        this.kategori = kategori;
        exceptionHandler = new ExceptionHandler();
        
    }
    
    public void InsertSupplierData(){
        String sqlInsert = "INSERT INTO supplier (id_supplier, nama_supplier, tlp_supplier, kategori) VALUES (?, ?, ?, ?)";
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(sqlInsert);
            stInsert.setString(1, idSupplier);
            stInsert.setString(2, namaSupplier);
            stInsert.setString(3, noHp);
            stInsert.setString(4, kategori);
            stInsert.executeUpdate();
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to save supplier data" + e);
        }
    }
    
    public void ChangeSupplierData(){
        String sqlInsert = "UPDATE supplier SET nama_supplier = ?, tlp_supplier = ?, kategori = ? WHERE id_supplier = ?";
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
            PreparedStatement stInsert = koneksi.prepareStatement(sqlInsert);
            stInsert.setString(1, namaSupplier);
            stInsert.setString(2, noHp);
            stInsert.setString(3, kategori);
            stInsert.setString(4, idSupplier);
            stInsert.executeUpdate();
        } catch (Exception e) {
            exceptionHandler.getErrorKesalahan("Failed to change supplier data" + e);
        }
    }
    
}
