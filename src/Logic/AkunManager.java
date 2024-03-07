package Logic;
import Data_Acces.ConnectorAkun;
import javax.swing.JOptionPane;
public class AkunManager {
    public Boolean login(String username, String password){
        if (username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Username/Password tidak boleh kosong");
            return false;
        }
        boolean statusLogin = new ConnectorAkun().authLogin(username, password);
        if(statusLogin){
            return true;
        }
        return false;
    }
}
