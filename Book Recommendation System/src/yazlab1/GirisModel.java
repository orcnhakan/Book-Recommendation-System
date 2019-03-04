package yazlab1;

import javax.swing.table.AbstractTableModel;

public class GirisModel extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;
    
    public GirisModel(){
        
    }
    
    public GirisModel(String[] columns, Object[][] data){
        this.columns = columns;
        this.rows = data;
    }
    
    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int col){
        return this.columns[col];
    }
    
    @Override
    public Class getColumnClass(int column) {
        return this.getValueAt(0, column).getClass();
        
    }
}
