package gestionContratsCession;

/**
 *
 * @author gaellecastel
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JCheckBox;

public class ButtonEditorEditer extends DefaultCellEditor {

    protected JButton button;
    private String label;
    private boolean isPushed;
    private int laLigneSelectionnee;
    private String leContratCessionSelectionne;

    public ButtonEditorEditer(JCheckBox checkBox) {
        super(checkBox);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });
    }

    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        if (isSelected) {
            button.setForeground(table.getSelectionForeground());
            button.setBackground(table.getSelectionBackground());
        } else {
            button.setForeground(table.getForeground());
            button.setBackground(table.getBackground());
            laLigneSelectionnee = row;
            leContratCessionSelectionne = (String) table.getValueAt(row, 0);
        }
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        isPushed = true;
        return button;
    }

    public Object getCellEditorValue() {
        if (isPushed) {
            new ContratCessionConfirmerEdition(leContratCessionSelectionne).setVisible(true);
        }
        isPushed = false;
        return new String(label);
    }

    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }

    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }
}
