package Logic;
import Connections.ClassKoneksi;
import java.sql.Connection;
import Data_Acces.DbLaporan;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTable;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class LaporanControler {
    
    private String idUser;
    private DbLaporan dbLaporan;
    private ConfigTable model;
    private int blnSkrng;
    private int thnSkrng;
    
    public void SetMonthAndYear(JMonthChooser bulan, JYearChooser tahun){
        Calendar tglSkrng = Calendar.getInstance();
        blnSkrng = tglSkrng.get(Calendar.MONTH);
        thnSkrng= tglSkrng.get(Calendar.YEAR);
        bulan.setMonth(blnSkrng);
        tahun.setYear(thnSkrng);
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    
    public void InsertLaporan(){
        dbLaporan = new DbLaporan();
        dbLaporan.InsertLaporan(idUser);
    }
    
    public ConfigTable SetModelTable() {
        model = new ConfigTable();
        model.addColumn("REPORT ID");
        model.addColumn("DATE");
        model.addColumn("Sales income");
        model.addColumn("Service revenue");
        model.addColumn("Expenditure");
        return model;
    }
    
    public void GetLaporan(JTable table, JMonthChooser bulan, JYearChooser tahun){
        dbLaporan = new DbLaporan();
        blnSkrng = bulan.getMonth() + 1;
        thnSkrng = tahun.getYear();
        model = (ConfigTable) table.getModel();
        model.setRowCount(0);
        ArrayList<Object[]> dataLaporan = dbLaporan.GetDataLaporan(blnSkrng, thnSkrng);
        for (Object []data : dataLaporan) {
            model.addRow(data);
        }
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

