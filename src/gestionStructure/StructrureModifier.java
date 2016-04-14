/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionStructure;

import gestionLieux.*;
import nezdames.serialisation.NezDamesSerialisation;
import classesMetier.Lieu;
import classesMetier.Structure;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gaellecastel
 */
public class StructrureModifier extends javax.swing.JFrame {

    private int lIndexDeStructure;

    public StructrureModifier(int laLigneSelectionnee) {
        initComponents();

        //pour que toute l'application ne se ferme pas quand on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //chargement des éléments de la fiche de ce lieu
        txtNewNom.setText(String.valueOf((((Structure) NezDamesSerialisation.lesStructures.get(laLigneSelectionnee)).getRaisonSociale())));
        txtNewRue.setText(String.valueOf((((Structure) NezDamesSerialisation.lesStructures.get(laLigneSelectionnee)).getAdresseRue())));
        txtNewCodePostal.setText(String.valueOf((((Structure) NezDamesSerialisation.lesStructures.get(laLigneSelectionnee)).getCodePostal())));
        txtNewCodeNaf.setText(String.valueOf((((Structure) NezDamesSerialisation.lesStructures.get(laLigneSelectionnee)).getCodeNafOuApe())));
        txtNewNumero.setText(String.valueOf((((Structure) NezDamesSerialisation.lesStructures.get(laLigneSelectionnee)).getNumeroSiret())));
        txtNewMail.setText(String.valueOf((((Structure) NezDamesSerialisation.lesStructures.get(laLigneSelectionnee)).getMail())));
        txtNewVille.setText(String.valueOf((((Structure) NezDamesSerialisation.lesStructures.get(laLigneSelectionnee)).getAdresseVille())));
        
        
        lIndexDeStructure = laLigneSelectionnee;
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
        lblTitre2 = new javax.swing.JLabel();
        txtNewCodeNaf = new javax.swing.JTextField();
        btnEnvoyer = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        lblNom = new javax.swing.JLabel();
        lblVille = new javax.swing.JLabel();
        txtNewRue = new javax.swing.JTextField();
        lblRue = new javax.swing.JLabel();
        lblCodePostal = new javax.swing.JLabel();
        txtNewCodePostal = new javax.swing.JTextField();
        txtNewNom = new javax.swing.JTextField();
        lblTitre1 = new javax.swing.JLabel();
        lblImageOlivier = new javax.swing.JLabel();
        lblImageManu = new javax.swing.JLabel();
        lblVille1 = new javax.swing.JLabel();
        lblVille2 = new javax.swing.JLabel();
        lblVille5 = new javax.swing.JLabel();
        txtNewNumero = new javax.swing.JTextField();
        txtNewMail = new javax.swing.JTextField();
        txtNewVille = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        lblTitre2.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre2.setForeground(new java.awt.Color(255, 153, 51));
        lblTitre2.setText("STRUCTURE");

        txtNewCodeNaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewCodeNafActionPerformed(evt);
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
        lblNom.setText("Nom");

        lblVille.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblVille.setForeground(new java.awt.Color(255, 153, 51));
        lblVille.setText("Code NAF");

        txtNewRue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewRueActionPerformed(evt);
            }
        });

        lblRue.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblRue.setForeground(new java.awt.Color(255, 153, 51));
        lblRue.setText("Adresse (Numéro et rue)");

        lblCodePostal.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblCodePostal.setForeground(new java.awt.Color(255, 153, 51));
        lblCodePostal.setText("Adresse (Code postal)");

        txtNewCodePostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewCodePostalActionPerformed(evt);
            }
        });

        txtNewNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewNomActionPerformed(evt);
            }
        });

        lblTitre1.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre1.setForeground(new java.awt.Color(255, 153, 51));
        lblTitre1.setText("MODIFICATION D'UNE ");

        lblImageOlivier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitOlivier.png"))); // NOI18N

        lblImageManu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitManu.png"))); // NOI18N

        lblVille1.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblVille1.setForeground(new java.awt.Color(255, 153, 51));
        lblVille1.setText("Numero de Siret ");

        lblVille2.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblVille2.setForeground(new java.awt.Color(255, 153, 51));
        lblVille2.setText("Mail");

        lblVille5.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblVille5.setForeground(new java.awt.Color(255, 153, 51));
        lblVille5.setText("Adresse (Ville)");

        txtNewNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewNumeroActionPerformed(evt);
            }
        });

        txtNewMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImageManu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTitre2)
                                .addGap(119, 119, 119)
                                .addComponent(lblImageOlivier))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRue)
                                    .addComponent(lblCodePostal)
                                    .addComponent(lblVille)
                                    .addComponent(lblVille1)
                                    .addComponent(lblVille2)
                                    .addComponent(lblVille5)
                                    .addComponent(btnEnvoyer)
                                    .addComponent(lblNom))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAnnuler)
                                        .addGap(225, 225, 225))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNewNom, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNewRue, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNewCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNewCodeNaf, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNewNumero, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNewMail, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNewVille, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))))))))
                .addContainerGap(668, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(223, 223, 223)
                    .addComponent(lblTitre1)
                    .addContainerGap(845, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblImageManu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImageOlivier)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(lblTitre2)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNewNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNom))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRue)
                    .addComponent(txtNewRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodePostal)
                    .addComponent(txtNewCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVille5)
                    .addComponent(txtNewVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVille)
                    .addComponent(txtNewCodeNaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVille1)
                    .addComponent(txtNewNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVille2)
                    .addComponent(txtNewMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnvoyer)
                    .addComponent(btnAnnuler))
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(lblTitre1)
                    .addContainerGap(384, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(638, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewCodePostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewCodePostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewCodePostalActionPerformed

    private void txtNewRueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewRueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewRueActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        // fermeture de la fenêtre SaisieMenu
        this.dispose();
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void btnEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvoyerActionPerformed
        // test qui vérifie que les champs sont remplis

        if (txtNewNom.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Il faut saisir le nouveau nom de la structure");
        } else {

            if (txtNewRue.getText().compareTo("") == 0) {
                JOptionPane.showMessageDialog(null, "Il faut saisir la rue de la Structure");
            } else {
                if (txtNewCodePostal.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Il faut saisir le code postal de la Structure");
                } else {
                    if (txtNewCodeNaf.getText().compareTo("") == 0) {
                        JOptionPane.showMessageDialog(null, "Il faut saisir le Code Naf de la Structure");
                    } else {
                        if (txtNewNumero.getText().compareTo("") == 0) {
                        JOptionPane.showMessageDialog(null, "Il faut saisir le numero de siret de la Structure");
                    } else {
                            if (txtNewMail.getText().compareTo("") == 0) {
                        JOptionPane.showMessageDialog(null, "Il faut saisir l'adresse mail de la Structure");
                    } else {
                            if (txtNewVille.getText().compareTo("") == 0) {
                        JOptionPane.showMessageDialog(null, "Il faut saisir la ville de la Structure");
                    } else{


                        // modification de l'intermittent dans la collection lesIntermittents
                        NezDamesSerialisation.lesStructures.get(lIndexDeStructure).modifier(Integer.parseInt(txtNewCodeNaf.getText()), Integer.parseInt(txtNewNumero.getText()), txtNewNom.getText(), txtNewRue.getText(), txtNewVille.getText(), Integer.parseInt(txtNewCodePostal.getText()), txtNewMail.getText());
                        JOptionPane.showMessageDialog(null, "Structure modifié");

                        this.dispose();
                            }
                                                
                }
            }
        }
    }//GEN-LAST:event_btnEnvoyerActionPerformed
}
}
    }
    
    private void txtNewCodeNafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewCodeNafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewCodeNafActionPerformed

    private void txtNewNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewNomActionPerformed

    private void txtNewNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewNumeroActionPerformed

    private void txtNewMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewMailActionPerformed

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
            java.util.logging.Logger.getLogger(StructrureModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StructrureModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StructrureModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StructrureModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuModifier().setVisible(true);
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

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new LieuModifier().setVisible(true);
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

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new StructrureModifier().setVisible(true);
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

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new StructrureModifier().setVisible(true);
         }
         });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnEnvoyer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodePostal;
    private javax.swing.JLabel lblImageManu;
    private javax.swing.JLabel lblImageOlivier;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblRue;
    private javax.swing.JLabel lblTitre1;
    private javax.swing.JLabel lblTitre2;
    private javax.swing.JLabel lblVille;
    private javax.swing.JLabel lblVille1;
    private javax.swing.JLabel lblVille2;
    private javax.swing.JLabel lblVille5;
    private javax.swing.JTextField txtNewCodeNaf;
    private javax.swing.JTextField txtNewCodePostal;
    private javax.swing.JTextField txtNewMail;
    private javax.swing.JTextField txtNewNom;
    private javax.swing.JTextField txtNewNumero;
    private javax.swing.JTextField txtNewRue;
    private javax.swing.JTextField txtNewVille;
    // End of variables declaration//GEN-END:variables
}
