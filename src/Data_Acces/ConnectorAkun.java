package Data_Acces;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Connections.ClassKoneksi;
public class ConnectorAkun {
    public boolean authLogin(String username, String password){
        try {
            Connection koneksi = ClassKoneksi.GetConnection();
            String sql = "SELECT * FROM akun WHERE username = ? AND password = ?";
            PreparedStatement userStatement = koneksi.prepareStatement(sql);
            userStatement.setString(1, username);
            userStatement.setString(2, password);
            ResultSet rs = userStatement.executeQuery();
            if(rs.next()){
                return true;
            }
//            String sqlRole = "SELECT posisi  FROM data_pengguna WHERE username = ? ";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
