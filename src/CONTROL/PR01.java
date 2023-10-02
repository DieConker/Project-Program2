/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

/**
 *
 * @author diego
 */
public class PR01 {
    
    public void imprimirMensaje(String m){
        System.out.println(m);   
} 
    public int generarAleatorio(){
        int r=  (int) (Math.random()*7) +1;
    return r;
}
    public  String convertirDiaenL(int dia){
    String diaL="";
   switch(dia){
     case 1: diaL="DOM"; 
             break;
     case 2: diaL="LUN"; 
             break;
      case 3: diaL="MAR"; 
             break;
     case 4: diaL="MIE"; 
             break;   
     case 5: diaL="JUE"; 
             break;
     case 6: diaL="VIE"; 
             break; 
     case 7: diaL="SAB"; 
             break;         
     default:  diaL="ERROR!";
 }
   return diaL;
}

// PROGRMAPRINCIPAL )MAIN)
public static void main(String[] args) {
 
    PR01 pr= new PR01();
    int i=1;
    do{
     int dia=pr.generarAleatorio();
     String R=pr.convertirDiaenL(dia);
     pr.imprimirMensaje(R);
     i++;
 }while(i<=20);
 
// String R=pr.convertirDiaenL(dia);
// pr.imprimirMensaje(R);
}  
}
