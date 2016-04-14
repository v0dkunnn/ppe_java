package gestionContratsCession;

/**
 *
 * @author gaellecastel
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import nezdames.serialisation.NezDamesSerialisation;
import javax.swing.JCheckBox;

public class ButtonEditorModifier extends DefaultCellEditor {

    protected JButton button;
    private String label;
    private boolean isPushed;
    private int laLigneSelectionnee;

    public ButtonEditorModifier(JCheckBox checkBox) {
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
        }
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        isPushed = true;
        return button;
    }

    public Object getCellEditorValue() {
        if (isPushed) {
            if ( NezDamesSerialisation.lesContratsCession.get(laLigneSelectionnee).isEdition() ) {
                JOptionPane.showMessageDialog(null, "Ce contrat a été édité et n'est plus modifiable", " Erreur ", JOptionPane.ERROR_MESSAGE);
            }
            else new ContratCessionModifier(laLigneSelectionnee).setVisible(true);
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
