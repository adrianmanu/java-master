/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.gui.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Java Master
 */
public class FrmPrincipalMenuAdmin extends javax.swing.JFrame {

    Background screen = new Background();

    public FrmPrincipalMenuAdmin() {
        this.setContentPane(screen);
        initComponents();
        setLocationRelativeTo(null);

        ImageIcon icon2 = new ImageIcon(getClass().getResource("/ec/edu/espe/"
                + "virtualgamestore/pictures/Game.png"));
        icon2 = new ImageIcon(icon2.getImage()
                .getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        mnuGame.setIcon(icon2);

        ImageIcon icon4 = new ImageIcon(getClass().getResource("/ec/edu/espe/"
                + "virtualgamestore/pictures/Headphones.png"));
        icon4 = new ImageIcon(icon4.getImage()
                .getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        mnuAccesory.setIcon(icon4);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MnuVirtualGameStore = new javax.swing.JMenu();
        MnuExit = new javax.swing.JMenuItem();
        mnuGame = new javax.swing.JMenu();
        mnuAccesory = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));

        MnuVirtualGameStore.setText("Virtual Game Store");

        MnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        MnuExit.setText("Salir");
        MnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuExitActionPerformed(evt);
            }
        });
        MnuVirtualGameStore.add(MnuExit);

        jMenuBar1.add(MnuVirtualGameStore);

        mnuGame.setText("Juegos");
        mnuGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuGameMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuGame);

        mnuAccesory.setText("Accesorios");
        mnuAccesory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuAccesoryMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuAccesory);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_MnuExitActionPerformed

    private void mnuGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuGameMouseClicked
        new FrmGameAdmin().setVisible(true);
        dispose();

    }//GEN-LAST:event_mnuGameMouseClicked

    private void mnuAccesoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuAccesoryMouseClicked
        new FrmAccessoryAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuAccesoryMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPrincipalMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrmPrincipalMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnuExit;
    private javax.swing.JMenu MnuVirtualGameStore;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuAccesory;
    private javax.swing.JMenu mnuGame;
    // End of variables declaration//GEN-END:variables
class Background extends JPanel {

        private Image image;

        public void paint(Graphics g) {
            image = new ImageIcon(getClass().getResource("/ec/edu/espe/virtualgamestore/pictures/GAMECONSOLE1.gif")).getImage();

            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}
