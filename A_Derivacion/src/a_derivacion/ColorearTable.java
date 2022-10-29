package a_derivacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableCellRenderer;

/* * @author Luis Fernando Paxel
 */
public class ColorearTable extends DefaultTableCellRenderer {

    private final int ColumnaSelect;

    public ColorearTable(int columnas) {
        this.ColumnaSelect = columnas;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int rowIndex, int columnIndex) {
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, rowIndex, columnIndex);
//
//        int valor = Integer.parseInt(table.getValueAt(rowIndex, ColumnaSelect).toString());
        int valor = 2;
        //   font2  new =   UIManager.put("Label.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 22)));
        if (valor == 2) {
            setBackground(new Color(231, 210, 210));
            setForeground(new Color(255, 0, 0));
            this.setFont(new Font("Arial", 1, 16));
        }
//        } else if (valor == 0) {
//            setBackground(Color.red);
//            setForeground(Color.black);
//        } else { //si no ponemos el else se pinta toda la columna
//            setBackground(Color.white);
//            setForeground(Color.black);
//        }

        return this;
    }

}
