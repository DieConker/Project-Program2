/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import java.awt.Color;

/**
 *
 * @author diego
 */
public class ProgClass extends javax.swing.JPanel {

    /**
     * Creates new form ProgClass
     */
    public ProgClass() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        btnNuArray = new javax.swing.JPanel();
        nuArrayText = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Programas Hechos en Clase");
        bg.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 40));

        btnNuArray.setBackground(new java.awt.Color(122, 0, 0));

        nuArrayText.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        nuArrayText.setForeground(new java.awt.Color(255, 255, 255));
        nuArrayText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuArrayText.setText("Nuestro Array");
        nuArrayText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuArrayText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuArrayTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuArrayTextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuArrayTextMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnNuArrayLayout = new javax.swing.GroupLayout(btnNuArray);
        btnNuArray.setLayout(btnNuArrayLayout);
        btnNuArrayLayout.setHorizontalGroup(
            btnNuArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuArrayText, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        btnNuArrayLayout.setVerticalGroup(
            btnNuArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuArrayText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(btnNuArray, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuArrayTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuArrayTextMouseEntered
        // TODO add your handling code here:
        btnNuArray.setBackground(new Color(160,0,0));
    }//GEN-LAST:event_nuArrayTextMouseEntered

    private void nuArrayTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuArrayTextMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuArrayTextMousePressed

    private void nuArrayTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuArrayTextMouseExited
        // TODO add your handling code here:
        btnNuArray.setBackground(new Color(122,0,0));
    }//GEN-LAST:event_nuArrayTextMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnNuArray;
    private javax.swing.JLabel nuArrayText;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
