package gestionStructure;

import nezdames.serialisation.NezDamesSerialisation;
import classesMetier.Lieu;
import classesMetier.PersonneStructure;
import classesMetier.Structure;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static nezdames.serialisation.NezDamesSerialisation.lesPersonnes;

/**
 *
 * @author gaellecastel
 */
public class StructureAjouter extends javax.swing.JFrame {

    public StructureAjouter() {
        initComponents();
        for(PersonneStructure unePersonne : lesPersonnes)
        {
            cdxRepresentant.addItem(unePersonne.getNomPersonne());
            cdxContact.addItem(unePersonne.getNomPersonne());       
        }
        //pour que toute l'application ne se ferme pas quand on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitre4 = new javax.swing.JLabel();
        txtVille = new javax.swing.JTextField();
        btnEnvoyer = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        lblNom = new javax.swing.JLabel();
        lblVille = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        lblCodePostal = new javax.swing.JLabel();
        txtCodePostal = new javax.swing.JTextField();
        txtCodeNaf = new javax.swing.JTextField();
        lblTitre1 = new javax.swing.JLabel();
        lblImageOlivier = new javax.swing.JLabel();
        lblImageManu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelMail = new javax.swing.JLabel();
        jLabelTél = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        lblCodePostal1 = new javax.swing.JLabel();
        txtRue = new javax.swing.JTextField();
        lblRepresentant = new javax.swing.JLabel();
        lblcontatct = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cdxRepresentant = new javax.swing.JComboBox();
        cdxContact = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        lblTitre4.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre4.setForeground(new java.awt.Color(255, 153, 51));

        txtVille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVilleActionPerformed(evt);
            }
        });

        btnEnvoyer.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        btnEnvoyer.setText("Envoyer");
        btnEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvoyerActionPerformed(evt);
            }
        });

        btnAnnuler.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        lblNom.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblNom.setForeground(new java.awt.Color(255, 153, 51));
        lblNom.setText("CodeNaf");

        lblVille.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblVille.setForeground(new java.awt.Color(255, 153, 51));
        lblVille.setText("Adresse (Ville)");

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        lblCodePostal.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblCodePostal.setForeground(new java.awt.Color(255, 153, 51));
        lblCodePostal.setText("Adresse (Code postal)");

        txtCodePostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodePostalActionPerformed(evt);
            }
        });

        txtCodeNaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeNafActionPerformed(evt);
            }
        });

        lblTitre1.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre1.setForeground(new java.awt.Color(255, 153, 51));
        lblTitre1.setText("CRÉATION D'UNE STRUCTURE");

        lblImageOlivier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitOlivier.png"))); // NOI18N

        lblImageManu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitManu.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Numero de siret");

        jLabelNom.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelNom.setForeground(new java.awt.Color(255, 153, 0));
        jLabelNom.setText("Nom");

        jLabelMail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelMail.setForeground(new java.awt.Color(255, 153, 0));
        jLabelMail.setText("Mail");

        jLabelTél.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelTél.setForeground(new java.awt.Color(255, 153, 0));
        jLabelTél.setText("Télephone");

        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        lblCodePostal1.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblCodePostal1.setForeground(new java.awt.Color(255, 153, 51));
        lblCodePostal1.setText("Adresse (rue)");

        txtRue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRueActionPerformed(evt);
            }
        });

        lblRepresentant.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblRepresentant.setForeground(new java.awt.Color(255, 153, 51));
        lblRepresentant.setText("Représentant");

        lblcontatct.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblcontatct.setForeground(new java.awt.Color(255, 153, 51));
        lblcontatct.setText("Contact");

        cdxRepresentant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdxRepresentantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelMail)
                                    .addComponent(lblVille)
                                    .addComponent(jLabelTél)
                                    .addComponent(lblRepresentant)
                                    .addComponent(lblcontatct))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cdxContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cdxRepresentant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCodePostal)
                                    .addComponent(jLabel1)
                                    .addComponent(lblCodePostal1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelNom)
                                        .addGap(8, 8, 8)))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodeNaf, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRue, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(312, 312, 312)
                                .addComponent(lblTitre4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(lblImageOlivier))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImageManu)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(lblNom)))
                        .addGap(15, 15, 15)
                        .addComponent(lblTitre1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btnEnvoyer)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnnuler)))
                .addContainerGap(583, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblTitre4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblImageManu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblTitre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNom)
                            .addComponent(txtCodeNaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodePostal1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodePostal)
                            .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVille)
                            .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblImageOlivier))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTél, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRepresentant)
                    .addComponent(cdxRepresentant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cdxContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcontatct))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnvoyer)
                    .addComponent(btnAnnuler))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(741, 587));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodePostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodePostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodePostalActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        // fermeture de la fenêtre
        this.dispose();
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void btnEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvoyerActionPerformed
        // test qui vérifie que les champs sont remplis

        if (txtCodeNaf.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Il faut saisir le Cod Naf de la Structure");
        } else {

            if (txtNom.getText().compareTo("") == 0) {
                JOptionPane.showMessageDialog(null, "Il faut saisir le nom de la structure");
            } 
        else {
                if (txtCodePostal.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Il faut saisir le code postal de la structure");
                } else {
                    if (txtVille.getText().compareTo("") == 0) {
                        JOptionPane.showMessageDialog(null, "Il faut saisir la ville de la structure");
                         } else {
                    if (txtRue.getText().compareTo("") == 0) {
                        JOptionPane.showMessageDialog(null, "Il faut saisir la Rue de la structure");
                        
                    } else {
                    if (txtNumero.getText().compareTo("") == 0) {
                        JOptionPane.showMessageDialog(null, "Il faut saisir le numero de siret  de la structure");
                        
                    } else {
                    if (txtMail.getText().compareTo("") == 0) {
                        JOptionPane.showMessageDialog(null, "Il faut saisir l'adresse Mail de la structure");
                        
                    }else {
                    if (txtTel.getText().compareTo("") == 0) {
                        JOptionPane.showMessageDialog(null, "Il faut saisir le numero de telephone  de la structure");
                        
                    }  
                    else {
                        //recherche du dernier id de lieu donné
                     
                         PersonneStructure Contact=null;
                      PersonneStructure Responsable=null;
                        for (PersonneStructure unePersonne : NezDamesSerialisation.lesPersonnes) {
                            if(cdxRepresentant.getSelectedItem()==unePersonne.getNomPersonne())
                            {
                                Responsable=unePersonne;
                            }
                            if(cdxContact.getSelectedItem()==unePersonne.getNomPersonne())
                            {
                                Contact=unePersonne;
                            }
                        
                                
                                
                        //recherche du dernier id de lieu donné
                        int idMax = 0;
                        for (Structure UneStructure : NezDamesSerialisation.lesStructures) {
                            if (UneStructure.getIdStructure() > idMax) {
                                idMax = UneStructure.getIdStructure();
                            }
                        }
                            
                        // ajout d'un lieu à la collection lesLieux
                        NezDamesSerialisation.lesStructures.add(new Structure( idMax + 1,Integer.parseInt( txtCodeNaf.getText()), Integer.parseInt(txtNumero.getText()), txtNom.getText(),txtRue.getText(), txtVille.getText(), Integer.parseInt(txtCodePostal.getText()),txtMail.getText(),Integer.parseInt(txtTel.getText()),Responsable,Contact));
                        JOptionPane.showMessageDialog(null, "Structure ajoutée");

                        this.dispose();
                            }}}}}}}}}
    }//GEN-LAST:event_btnEnvoyerActionPerformed

    private void txtVilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVilleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVilleActionPerformed

    private void cdxRepresentantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdxRepresentantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdxRepresentantActionPerformed

    private void txtCodeNafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeNafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeNafActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void txtRueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StructureAjouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StructureAjouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StructureAjouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StructureAjouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StructureAjouter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnEnvoyer;
    private javax.swing.JComboBox cdxContact;
    private javax.swing.JComboBox cdxRepresentant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelTél;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodePostal;
    private javax.swing.JLabel lblCodePostal1;
    private javax.swing.JLabel lblImageManu;
    private javax.swing.JLabel lblImageOlivier;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblRepresentant;
    private javax.swing.JLabel lblTitre1;
    private javax.swing.JLabel lblTitre4;
    private javax.swing.JLabel lblVille;
    private javax.swing.JLabel lblcontatct;
    private javax.swing.JTextField txtCodeNaf;
    private javax.swing.JTextField txtCodePostal;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRue;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
