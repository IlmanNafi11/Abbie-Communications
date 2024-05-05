
package Logic;

import Data_Acces.DbDashboard;
import java.time.LocalDate;
import java.util.ArrayList;
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
        lblTotalMember.setText(String.valueOf(dbDashboard.GetTotalMember()));
    }
    
    public void GetTotalProductSold(JLabel lblProductSold){
        lblProductSold.setText(String.valueOf(dbDashboard.GetTotalProductSold(tanggalSekarang)));
    }
    
    public void GetTotalPemasukan(JLabel lblTotalPemasukan){
        lblTotalPemasukan.setText(String.valueOf(dbDashboard.GetTotalPemasukan(tanggalSekarang)));
    }
    
    public void GetTotalPengeluaran(JLabel lblTotalPengeluaran){
        lblTotalPengeluaran.setText(String.valueOf(dbDashboard.GetTotalPengeluaran(tanggalSekarang)));
    }
    
    public ConfigTable ModelTable() {
        ConfigTable model = new ConfigTable();
        model.addColumn("Transaction ID");
        model.addColumn("Product Name");
        model.addColumn("Sub-Total");
        model.addColumn("Date");
        return model;
    }

    public void GetDataHistory(JTable table) {
        ConfigTable model = (ConfigTable) table.getModel();
        ArrayList<Object[]> transaksiDetail = dbDashboard.GetTransaksiDetailData();
        for (Object[] dataTransaksi : transaksiDetail) {
            model.addRow(dataTransaksi);
        }
        
        ArrayList<Object[]> transaksiServis = dbDashboard.GetTransaksiServisData();
        for (Object[] dataTransaksi : transaksiServis) {
            model.addRow(dataTransaksi);
        }
    } 
}
