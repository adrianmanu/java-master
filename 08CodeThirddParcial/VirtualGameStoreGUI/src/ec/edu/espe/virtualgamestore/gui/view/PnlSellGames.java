/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.gui.view;

import ec.edu.espe.virtualgamestore.controller.ControllerTable;
import ec.edu.espe.virtualgamestore.model.Accessory;
import ec.edu.espe.virtualgamestore.model.Game;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

/**
 *
 * @author Java Master
 */
public class PnlSellGames extends javax.swing.JPanel {

    private ArrayList<Game> games;

    /**
     * Creates new form FrmSellProduct
     */
    public PnlSellGames() {
        initComponents();
        ChargeData();

    }

    public final void ChargeData() {

        games = ControllerTable.getGame();

        GridBagConstraints gbc = new GridBagConstraints();
        this.bodyPanel.setLayout(new GridBagLayout());
        int row = 0;
        int colum = 0;

        for (Game game : games) {
            gbc.gridx = row;
            gbc.gridy = colum;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.anchor = GridBagConstraints.NORTHWEST;
            gbc.weightx = 1;
            gbc.weighty = 1;

            PnlGames p = new PnlGames(game.getId(), game.getName(), game.getPrice(), game.getColor(), game.getQuantity(), game.getPegi());

            bodyPanel.add(p, gbc);
            row++;
            if (row % 3 == 0) {
                colum++;
                row = 0;
            }

        }
        Dimension newsize = new Dimension(816, (186 * colum) + 2);
        this.bodyPanel.setPreferredSize(newsize);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bodyPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(970, 690));
        setMinimumSize(new java.awt.Dimension(970, 690));
        setPreferredSize(new java.awt.Dimension(970, 690));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(816, 690));
        jPanel2.setMinimumSize(new java.awt.Dimension(816, 690));
        jPanel2.setPreferredSize(new java.awt.Dimension(816, 650));
        jPanel2.setLayout(new java.awt.CardLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(890, 804));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(816, 450));

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setMaximumSize(new java.awt.Dimension(272, 165));
        bodyPanel.setMinimumSize(new java.awt.Dimension(272, 165));
        bodyPanel.setPreferredSize(new java.awt.Dimension(272, 165));
        bodyPanel.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(bodyPanel);

        jPanel2.add(jScrollPane1, "card2");

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 590));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}