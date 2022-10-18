/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.gui.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Java Master
 */
public class PnlAccessory extends javax.swing.JPanel {

    String idAccessory;
    String stockAccessory;

    /**
     * Creates new form Product
     */
    public PnlAccessory() {
        initComponents();
    }

    public PnlAccessory(String ID, String name, String price, String color, String quantity) {
        initComponents();
        this.idAccessory = ID;
        this.stockAccessory = quantity;
        this.id.setText(String.valueOf(ID));
        this.name.setText(name);
        this.price.setText("$" + String.valueOf(price));
        this.color.setText(color);
        this.stock.setText(String.valueOf(quantity));
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
        jPanel3 = new javax.swing.JPanel();
        lblID2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblShoeType = new javax.swing.JLabel();
        lblID3 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        btnBuy = new javax.swing.JButton();
        pegi = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        stock = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        color = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(272, 165));
        setMinimumSize(new java.awt.Dimension(272, 165));
        setPreferredSize(new java.awt.Dimension(272, 165));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(lblID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(272, 165));
        jPanel1.setMinimumSize(new java.awt.Dimension(272, 165));
        jPanel1.setPreferredSize(new java.awt.Dimension(272, 165));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 102, 102));
        lblName.setText("Nombre:");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblShoeType.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblShoeType.setForeground(new java.awt.Color(0, 102, 102));
        lblShoeType.setText("Pegi:");
        jPanel1.add(lblShoeType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblID3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblID3.setForeground(new java.awt.Color(0, 102, 102));
        lblID3.setText("ID:");
        jPanel1.add(lblID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        id.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        id.setText("ID:");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 30, -1));

        name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        name.setText("Name:");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        price.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        price.setForeground(new java.awt.Color(255, 51, 102));
        price.setText("$:");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 80, 20));

        btnBuy.setBackground(new java.awt.Color(255, 255, 51));
        btnBuy.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        btnBuy.setForeground(new java.awt.Color(255, 0, 0));
        btnBuy.setText("Comprar");
        btnBuy.setBorder(new javax.swing.border.MatteBorder(null));
        btnBuy.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, 30));

        pegi.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        pegi.setText("Pegi");
        jPanel1.add(pegi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        lblStock.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblStock.setForeground(new java.awt.Color(0, 102, 102));
        lblStock.setText("Cantidad:");
        jPanel1.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        stock.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        stock.setText("stock");
        jPanel1.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Color:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        color.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        color.setText("COLOR");
        jPanel1.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed

        int newStock;
        int quanty;
        int stack = Integer.valueOf(stockAccessory);
        int number = Integer.valueOf(this.stockAccessory);
        int Quantity = Integer.valueOf(this.idAccessory);
        try {
            quanty = Integer.valueOf(JOptionPane.showInputDialog("Cuantos desea comprar?"));
            if (!(number >= quanty)) {
                JOptionPane.showMessageDialog(null, "No tenemos esa cantidad disponible...", "E R R O R", JOptionPane.ERROR_MESSAGE);
            } else {

                newStock = stack - quanty;
                this.stock.setText(String.valueOf(newStock));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Introduzca solo numeros");
        }

        new FrmConfirmation().setVisible(true);


    }//GEN-LAST:event_btnBuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JLabel color;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblID3;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblShoeType;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel name;
    private javax.swing.JLabel pegi;
    private javax.swing.JLabel price;
    private javax.swing.JLabel stock;
    // End of variables declaration//GEN-END:variables
}