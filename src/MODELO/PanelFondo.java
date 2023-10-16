
package MODELO;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class PanelFondo extends JPanel {
    
    Color colorfondo=new Color(255, 250, 205);
    int tammax, tam, canx, res;
    
    public PanelFondo(int tammax, int canx){
        this.tammax=tammax;
        this.canx=canx;
        this.tam=tammax/canx;
        this.res=tammax%canx;
    }
    
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
        pintor.setColor(colorfondo);
        for (int i=0; i < canx; i++){
            for (int j = 0; j < canx; j++){
                pintor.fillRect(res/2+i*tam, res/2+j*tam, tam-1, tam-1);
            }
        }
    }


}