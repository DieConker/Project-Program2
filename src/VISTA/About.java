/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

/**
 *
 * @author estudiante307
 */
public class About extends javax.swing.JPanel {

    /**
     * Creates new form About
     */
    public About() {
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
        Title = new javax.swing.JLabel();
        bgTitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Firma = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(540, 61));
        bg.setPreferredSize(new java.awt.Dimension(540, 61));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Acerca de");
        bg.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 26, 530, 35));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/Images/Yo.jpg"))); // NOI18N

        javax.swing.GroupLayout bgTitleLayout = new javax.swing.GroupLayout(bgTitle);
        bgTitle.setLayout(bgTitleLayout);
        bgTitleLayout.setHorizontalGroup(
            bgTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgTitleLayout.setVerticalGroup(
            bgTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, Short.MAX_VALUE)
        );

        bg.add(bgTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 160, 190));

        Firma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Firma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Firma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/Images/Firma.png"))); // NOI18N
        Firma.setText("Guapacha");
        bg.add(Firma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 160, 82));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Firma;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgTitle;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}