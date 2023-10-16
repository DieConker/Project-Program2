
package MODELO;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Arrastrarse implements  Runnable {
    PanelSnake panel;
    boolean estado=true;
    
    public Arrastrarse (PanelSnake panel){
        this.panel=panel;
    }

    @Override
    public void run() {
        while(estado){
            panel.avanzar();
            panel.repaint();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Arrastrarse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void parar(){
        this.estado=false;
    }
    
}
