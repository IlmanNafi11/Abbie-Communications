
package Logic;

import Data_Acces.DbDashboard;
import com.toedter.calendar.JDateChooser;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JTable;

public class DashboardControler {

    private ExceptionHandler exceptionHandler;
    private DbDashboard dbDashboard;
    
    public DashboardControler() {
        dbDashboard = new DbDashboard();
    }

    LocalDate tanggalSekarang = LocalDate.now();
    
    public void GetTanggalBanner(JLabel lblTanggal){
        lblTanggal.setText(tanggalSekarang.toString());
    }
    
    public void GetTotalMember(JLabel lblTotalMember){
        lblTotalMember.setText(String.valueOf(dbDashboard.GetTotalMember()) + " People");
    }
    
    public void GetTotalProductSold(JLabel lblProductSold){
        lblProductSold.setText(String.valueOf(dbDashboard.GetTotalProductSold(tanggalSekarang)) + " /Pcs");
    }
    
    public void GetTotalPemasukan(JLabel lblTotalPemasukan){
        double totalPemasukan = dbDashboard.GetTotalPemasukan(tanggalSekarang);
        NumberFormat formatIndo = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String pemasukan = formatIndo.format(totalPemasukan);
        lblTotalPemasukan.setText(String.valueOf(pemasukan));
    }
    
    public void GetTotalPengeluaran(JLabel lblTotalPengeluaran){
        double totalPengeluaran = dbDashboard.GetTotalPengeluaran(tanggalSekarang);
        NumberFormat formatIndo = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String pengeluaran = formatIndo.format(totalPengeluaran);
        lblTotalPengeluaran.setText(String.valueOf(pengeluaran));
    }
    
    public ConfigTable ModelTable() {
        ConfigTable model = new ConfigTable();
        model.addColumn("Transaction ID");
        model.addColumn("Product Name");
        model.addColumn("Sub-Total");
        model.addColumn("Date");
        return model;
    }
    
    public void SetFirstCalender(JDateChooser kalender){
        Calendar tglSkrng = Calendar.getInstance();
        kalender.setDate(tglSkrng.getTime());
    }

    public void GetDataHistory(JTable table, JDateChooser tgl) {
        ConfigTable model = (ConfigTable) table.getModel();
        Date tanggal = tgl.getDate();
        ArrayList<Object[]> transaksiDetail = dbDashboard.GetTransaksiDetailData(tanggal);
        for (Object[] dataTransaksi : transaksiDetail) {
            model.addRow(dataTransaksi);
        }
        
        ArrayList<Object[]> transaksiServis = dbDashboard.GetTransaksiServisData(tanggal);
        for (Object[] dataTransaksi : transaksiServis) {
            model.addRow(dataTransaksi);
        }
    } 
}
