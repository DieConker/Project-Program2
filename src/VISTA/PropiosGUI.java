/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import java.awt.Color;
import javax.swing.SwingUtilities;

/**
 *
 * @author estudiante305
 */
public class PropiosGUI extends javax.swing.JPanel {

    /**
     * Creates new form PropiosGUI
     */
    public PropiosGUI() {
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
        jLabel1 = new javax.swing.JLabel();
        btnSmldr = new javax.swing.JPanel();
        controlBtn1 = new javax.swing.JLabel();
        smldrText = new javax.swing.JLabel();
        bgBtn1 = new javax.swing.JPanel();
        iconBtn1 = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Programas Propios");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 30));

        btnSmldr.setBackground(new java.awt.Color(255, 255, 255));
        btnSmldr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        controlBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        controlBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        controlBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                controlBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                controlBtn1MouseExited(evt);
            }
        });
        btnSmldr.add(controlBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 170));

        smldrText.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        smldrText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        smldrText.setText("Simulador Crédito");
        btnSmldr.add(smldrText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 40));

        bgBtn1.setBackground(new java.awt.Color(197, 54, 54));
        bgBtn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/Images/porcentaje 96x96.png"))); // NOI18N
        bgBtn1.add(iconBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 100));

        btnSmldr.add(bgBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 100));

        bg.add(btnSmldr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 150, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void controlBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlBtn1MouseEntered
        // TODO add your handling code here:
        btnSmldr.setBackground(new Color(197,180,180));
    }//GEN-LAST:event_controlBtn1MouseEntered

    private void controlBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlBtn1MouseExited
        // TODO add your handling code here:
        btnSmldr.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_controlBtn1MouseExited

    private void controlBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlBtn1MouseClicked
        // TODO add your handling code here:
        SimuladorCred cred= new SimuladorCred();
        ((MainGUI2) SwingUtilities.getWindowAncestor(this)).showPanel(cred);
    }//GEN-LAST:event_controlBtn1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgBtn1;
    private javax.swing.JPanel btnSmldr;
    private javax.swing.JLabel controlBtn1;
    private javax.swing.JLabel iconBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel smldrText;
    // End of variables declaration//GEN-END:variables
}
