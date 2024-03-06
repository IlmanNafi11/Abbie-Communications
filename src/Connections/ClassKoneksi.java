package Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClassKoneksi {

    public static Connection pengkoneksi;

    public static Connection GetConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            pengkoneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/abbie_communication", "root", "");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal !!");
        }
        return pengkoneksi;
    }
}
