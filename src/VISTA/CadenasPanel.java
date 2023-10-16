/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROL.Cadena;

/**
 *
 * @author diego
 */
public class CadenasPanel extends javax.swing.JPanel {

    /**
     * Creates new form CadenasPanel
     */
    Cadena mic;
    public CadenasPanel() {
        initComponents();
    }
    
    public void ejecProcCad(){
        String cx = areaTexto1.getText();
        mic= new Cadena(cx);
        String ci= mic.invertir();
        areaTexto2.setText(ci);
    }
    
    public void ejecProcCad2(){
        String cx = areaTexto1.getText();
        mic= new Cadena(cx);
        String ci= String.valueOf(mic.longitud());
        areaTexto2.setText(ci);
    }
    
    public void ejecProcCad3(){
        String cx = areaTexto1.getText();
        mic= new Cadena(cx);
        String ci= mic.convertirMayus();
        areaTexto2.setText(ci);
    }
    
    public void ejecProcCad4(){
        String cx = areaTexto1.getText();
        mic= new Cadena(cx);
        String ci= mic.convertirMinus();
        areaTexto2.setText(ci);
    }
    
    public void mostrarMensaje(String m){
        javax.swing.JOptionPane.showMessageDialog(this, m);
    }
    
    public void ejecProcCad5(){
        String cx=areaTexto1.getText();
        mic= new Cadena(cx);
        if(mic.esMayuscula(cx)==true){
            mostrarMensaje("Está escrito en mayusculas");
        }
        else {
            mostrarMensaje("Está escrito en minusculas");
        }
    }
    
    public void ejecProcCad6(){
        String cx=areaTexto1.getText();
        mic= new Cadena(cx);
        if(mic.esMinuscula(cx)==true){
            mostrarMensaje("Está escrito en minusculas");
        }
        else {
            mostrarMensaje("No esta escrito en minusculas");
        }
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
        cajonA1 = new MODELO.CajonA();
        jLabel1 = new javax.swing.JLabel();
        areaTexto1 = new MODELO.AreaTexto();
        areaTexto2 = new MODELO.AreaTexto();

        bg.setBackground(new java.awt.Color(250, 235, 215));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajonA1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Invertir", "Convertir MAYUS", "Convertir MINUS", "Longitud", "¿Esta en Mayusculas o Minusculas?", " " }));
        cajonA1.setSelectedIndex(-1);
        cajonA1.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        cajonA1.setLabeText("Seleccione una opción");
        cajonA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajonA1ActionPerformed(evt);
            }
        });
        bg.add(cajonA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 230, 50));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manejo de Cadenas");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 30));

        areaTexto1.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        areaTexto1.setLabelText("Ingrese su Cadena");
        bg.add(areaTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 64, 380, 50));

        areaTexto2.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        areaTexto2.setLabelText("Cadena manejada:");
        bg.add(areaTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 380, 50));

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

    private void cajonA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajonA1ActionPerformed
        // TODO add your handling code here:
        String sel=(String)cajonA1.getSelectedItem();
        if(sel.compareTo("Invertir")==0){
            ejecProcCad();
        }
        else if (sel.compareTo("Longitud")==0){
            ejecProcCad2();
        }
        else if (sel.compareTo("Convertir MAYUS")==0){
            ejecProcCad3();
        }
        else if (sel.compareTo("Convertir MINUS")==0){
            ejecProcCad4();
        }
        else if (sel.compareTo("¿Esta en Mayusculas o Minusculas?")==0){
            ejecProcCad5();
        }
        else if (sel.compareTo("¿Esta en minusculas?")==0){
            ejecProcCad6();
        }
    }//GEN-LAST:event_cajonA1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private MODELO.AreaTexto areaTexto1;
    private MODELO.AreaTexto areaTexto2;
    private javax.swing.JPanel bg;
    private MODELO.CajonA cajonA1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
