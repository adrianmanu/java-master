/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.gui.view;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import ec.edu.espe.virtualgamestore.controller.FileManager;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;

/**
 *
 * @author Java Master
 */
public class FrmLogInAdmin extends javax.swing.JFrame {

    FileManager fileManager = new FileManager();

    public FrmLogInAdmin() {

        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblLogoImage = new javax.swing.JLabel();
        pnlRegisteUser = new javax.swing.JPanel();
        userTxt = new javax.swing.JLabel();
        registerLbl = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        sptUser = new javax.swing.JSeparator();
        sptPassword = new javax.swing.JSeparator();
        logInPanel = new javax.swing.JPanel();
        LoginBTN = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        lblLogoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/virtualgamestore/pictures/logoFondo.jpeg"))); // NOI18N

        pnlRegisteUser.setBackground(new java.awt.Color(0, 0, 0));

        userTxt.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        userTxt.setForeground(new java.awt.Color(255, 255, 255));
        userTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/virtualgamestore/pictures/UserIcon.png"))); // NOI18N
        userTxt.setText("Administrador");

        registerLbl.setBackground(new java.awt.Color(115, 0, 113));
        registerLbl.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        registerLbl.setForeground(new java.awt.Color(82, 59, 128));
        registerLbl.setText("Bienvenido Administrador");

        passwordTxt.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/virtualgamestore/pictures/passwordIcon.png"))); // NOI18N
        passwordTxt.setText("Contraseña");

        txtUser.setBackground(new java.awt.Color(0, 0, 0));
        txtUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(0, 0, 0));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(92, 57, 163));
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        sptUser.setBackground(new java.awt.Color(0, 0, 153));

        sptPassword.setForeground(new java.awt.Color(51, 0, 153));

        logInPanel.setBackground(new java.awt.Color(92, 57, 163));
        logInPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logInPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logInPanelMouseExited(evt);
            }
        });

        LoginBTN.setBackground(new java.awt.Color(94, 53, 126));
        LoginBTN.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        LoginBTN.setForeground(new java.awt.Color(255, 255, 255));
        LoginBTN.setText("Entra");
        LoginBTN.setBorderPainted(false);
        LoginBTN.setContentAreaFilled(false);
        LoginBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LoginBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LoginBTNMouseMoved(evt);
            }
        });
        LoginBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginBTNMouseExited(evt);
            }
        });
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logInPanelLayout = new javax.swing.GroupLayout(logInPanel);
        logInPanel.setLayout(logInPanelLayout);
        logInPanelLayout.setHorizontalGroup(
            logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logInPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        logInPanelLayout.setVerticalGroup(
            logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnExit.setBackground(new java.awt.Color(95, 57, 163));
        btnExit.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(95, 57, 163));
        btnExit.setText("X");
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnMinimize.setBackground(new java.awt.Color(95, 57, 163));
        btnMinimize.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnMinimize.setForeground(new java.awt.Color(95, 57, 163));
        btnMinimize.setText("-");
        btnMinimize.setBorderPainted(false);
        btnMinimize.setContentAreaFilled(false);
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });

        btnReturn.setBackground(new java.awt.Color(0, 0, 0));
        btnReturn.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(153, 51, 255));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/virtualgamestore/pictures/regresar.png"))); // NOI18N
        btnReturn.setText("Volver");
        btnReturn.setBorderPainted(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegisteUserLayout = new javax.swing.GroupLayout(pnlRegisteUser);
        pnlRegisteUser.setLayout(pnlRegisteUserLayout);
        pnlRegisteUserLayout.setHorizontalGroup(
            pnlRegisteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisteUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisteUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlRegisteUserLayout.createSequentialGroup()
                .addGroup(pnlRegisteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisteUserLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(pnlRegisteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sptUser, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(txtUser)))
                    .addGroup(pnlRegisteUserLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(pnlRegisteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegisteUserLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordTxt)))
                    .addGroup(pnlRegisteUserLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(userTxt))
                    .addGroup(pnlRegisteUserLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(sptPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlRegisteUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisteUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlRegisteUserLayout.setVerticalGroup(
            pnlRegisteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisteUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegisteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnMinimize))
                .addGap(29, 29, 29)
                .addComponent(registerLbl)
                .addGap(52, 52, 52)
                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlRegisteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisteUserLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(passwordTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sptPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegisteUserLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sptUser, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRegisteUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(lblLogoImage)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegisteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

    }//GEN-LAST:event_txtUserActionPerformed

    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
        JSONObject object = new JSONObject();
        object.put("admin", txtUser.getText());
        object.put("Password", txtPassword.getText());
        if (fileManager.compareData(object, "Manager.json")) {
            JOptionPane.showMessageDialog(null, "Bienvenido");
            FrmPrincipalMenuAdmin frmPrincipalMenuAdmin = new FrmPrincipalMenuAdmin();
            frmPrincipalMenuAdmin.setVisible(true);
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Usuario O Comtraseña incorrectos");
        }


    }//GEN-LAST:event_LoginBTNActionPerformed

    private void LoginBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBTNMouseExited
        logInPanel.setBackground(new java.awt.Color(92, 57, 163));
    }//GEN-LAST:event_LoginBTNMouseExited

    private void LoginBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBTNMouseMoved
        logInPanel.setBackground(new java.awt.Color(34, 24, 56));
    }//GEN-LAST:event_LoginBTNMouseMoved

    private void logInPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInPanelMouseExited

    }//GEN-LAST:event_logInPanelMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        new FrmUserType().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogInAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogInAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogInAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogInAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmLogInAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBTN;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel lblLogoImage;
    private javax.swing.JPanel logInPanel;
    private javax.swing.JLabel passwordTxt;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlRegisteUser;
    private javax.swing.JLabel registerLbl;
    private javax.swing.JSeparator sptPassword;
    private javax.swing.JSeparator sptUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel userTxt;
    // End of variables declaration//GEN-END:variables

}
