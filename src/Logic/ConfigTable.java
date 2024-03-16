package Logic;

import javax.swing.table.DefaultTableModel;

public class ConfigTable extends DefaultTableModel{
    @Override
    public boolean isCellEditable(int row, int column) {
    return false;
    }
}
