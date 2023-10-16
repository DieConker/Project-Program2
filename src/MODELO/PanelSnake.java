
package MODELO;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PanelSnake extends JPanel {
    
    Color colorsnake=new Color(107, 142, 35);
    Color colorcomida=Color.red;
    int tammax, tam, canx, res;
    List<int[]> snake=new ArrayList<>();
    int[] comida=new int[2];
    String direccion = "Right";
    String direccionProxima="Right";
    private boolean juegoTerminado = false;
    
    Thread hilo;
    Arrastrarse camino;
    
    public PanelSnake(int tammax, int canx){
        this.tammax=tammax;
        this.canx=canx;
        this.tam=tammax/canx;
        this.res=tammax%canx;
        int[] a={canx/2-1,canx/2-1};
        int[] b={canx/2,canx/2-1};
        snake.add(a);
        snake.add(b);
        generarComida();
        
    }
    
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
        pintor.setColor(colorsnake);
        
        //Pintando serpiente
        for (int i=0; i < snake.size(); i++){
                pintor.fillRect(res/2+snake.get(i)[0]*tam, res/2+snake.get(i)[1]*tam, tam-1, tam-1);    
        }
        
        //Pintando comida
        pintor.setColor(colorcomida);
        pintor.fillRect(res/2+comida[0]*tam, res/2+comida[1]*tam, tam-1, tam-1);
        
    }
    
    public void avanzar(){
        if (juegoTerminado) {
        return; // No hagas nada si el juego ha terminado
        }
        
        igualardir();
        int[] ultimo = snake.get(snake.size()-1);
        int agregarx=0;
        int agregary=0;
        switch(direccion){
            case "Right":agregarx=1;break;
            case "Left":agregarx=-1;break;
            case "Up":agregary=-1;break;
            case "Down":agregary=1;break;
        }
        
        int[] nuevo={Math.floorMod(ultimo[0]+agregarx, canx) , 
            Math.floorMod(ultimo[1]+agregary,canx)};
        
        boolean existe=false;
        for (int i = 0; i < snake.size(); i++){
            if(nuevo[0]==snake.get(i)[0] && nuevo[1]==snake.get(i)[1]){
                existe=true;
                break;
            }
        }
        if(existe==true){
            juegoTerminado = true;
            JOptionPane.showMessageDialog(this, "Perdiste, manco.");
        }else{
            if(nuevo[0]==comida[0] && nuevo[1]==comida[1]){
                snake.add(nuevo);
                generarComida();
            }else{
                snake.add(nuevo);
                snake.remove(0);
            }
        }
        
        
        
    }
    
    public void generarComida(){
        boolean existe=false;
        int a =(int)(Math.random()*canx);
        int b =(int)(Math.random()*canx);
        
        for (int[] par:snake){
            if(par[0]==a&&par[1]==b){
                existe=true;
                generarComida();
                break;
            }
        }
        if(!existe){
            this.comida[0]=a;
            this.comida[1]=b;
        }
        
    }
    
    public void cambiarDireccion (String dir){
        if((this.direccion.equals("Right") || this.direccion.equals("Left")) && (dir.equals("Up") || dir.equals("Down"))){
            this.direccionProxima=dir;
        }
        if((this.direccion.equals("Up") || this.direccion.equals("Down")) && (dir.equals("Right") || dir.equals("Left"))){
            this.direccionProxima=dir;
        }
    }

    public void igualardir(){
        this.direccion=this.direccionProxima;
    }
    
    public void iniciarJuego() {
        juegoTerminado = false;
        camino = new Arrastrarse(this);
        hilo = new Thread(camino);
        hilo.start();
    }
    
    public void reiniciarJuego() {
    juegoTerminado = false;
    snake.clear();
    int[] a = {canx / 2 - 1, canx / 2 - 1};
    int[] b = {canx / 2, canx / 2 - 1};
    snake.add(a);
    snake.add(b);
    generarComida();
    direccion = "Right";
    direccionProxima = "Right";
    repaint();
}

}
