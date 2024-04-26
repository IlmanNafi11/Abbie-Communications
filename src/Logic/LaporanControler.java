package Logic;
import Connections.ClassKoneksi;
import java.sql.Connection;
import Data_Acces.DbLaporan;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class LaporanControler {
    
    private String idUser;
    private DbLaporan dbLaporan;

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    
    public void InsertLaporan(){
        dbLaporan = new DbLaporan();
        dbLaporan.InsertLaporan(idUser);
    }
    
    public ConfigTable GetLaporan(){
        dbLaporan = new DbLaporan();
        return dbLaporan.GetDataLaporan();
    }

    public void PrintLaporan(JMonthChooser bulan, JYearChooser tahun){
        try {
        Connection koneksi = ClassKoneksi.GetConnection();
        int getBulan = bulan.getMonth() + 1;
        int getTahun = tahun.getYear();
        InputStream path = getClass().getResourceAsStream("/report/LaporanBulanan.jasper");
        Map<String, Object> parameter = new HashMap<>();
        parameter.put("bulan", getBulan);
        parameter.put("tahun", getTahun);
        JasperPrint jasperPrint = JasperFillManager.fillReport(path, parameter, koneksi);
        JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            e.getMessage();
        }
    }

}

