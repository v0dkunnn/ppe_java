package gestionRepresentations;

/**
 *
 * @author gaellecastel
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JCheckBox;

public class ButtonEditorSupprimer extends DefaultCellEditor {

    protected JButton button;
    private String label;
    private boolean isPushed;
    private int laLigneSelectionnee, lIdDelaRepresentationSelectionnee;
    private String laDateDelaRepresentationSelectionnee, leContratCessionSelectionne, lHeureDelaRepresentationSelectionnee;

    public ButtonEditorSupprimer(JCheckBox checkBox) {
        super(checkBox);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });
    }

    @Override
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
            lIdDelaRepresentationSelectionnee = (int) table.getValueAt(row, 5);
            laDateDelaRepresentationSelectionnee = (String) table.getValueAt(row, 2);
            lHeureDelaRepresentationSelectionnee = (String) table.getValueAt(row, 3);
        }
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        isPushed = true;
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        if (isPushed) {
            new RepresentationConfirmerSuppression(laLigneSelectionnee, lIdDelaRepresentationSelectionnee, leContratCessionSelectionne, laDateDelaRepresentationSelectionnee, lHeureDelaRepresentationSelectionnee).setVisible(true);
            /*int retour = JOptionPane.showConfirmDialog(null, "Etes-vous sûr de vouloir supprimer ce spectacle : " + NezDamesSerialisation.lesSpectacles.get(laLigneSelectionnee).getTitre() + " ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (retour == JOptionPane.YES_OPTION) {
                //NezDamesSerialisation.lesSpectacles.remove(laLigneSelectionnee);
                JOptionPane.showMessageDialog(null, "Spectacle supprimé");
            }*/
        }
        isPushed = false;
        return new String(label);
    }

    @Override
    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }

    @Override
    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }
}
