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

import java.util.Scanner;
 


public class Ordenador {
    public int A;
    public  int B;
  public int C;
  public void ordenar1(int x, int y, int z){
       A=x;
       B=y;
       C= z;
        int[] numeros = new int[3];
       numeros[0]=A;
        numeros[1]=B;
        numeros[2]=C;
       java.util.Arrays.sort(numeros);
        
        A=numeros[0];
       B=numeros[1] ;
       C=numeros[2];
       System.out.println(A+ " "+ B + "  "+ C);

    }
 
    
    public  void ordenar2(int X, int Y, int Z){
       
      
        int temp = 0;
        
        A = X;
        B = Y;
        C = Z;
        
        if (A>B){
            
            temp = A;
            A = B;
            B = temp;
            
        }
        
        if (B>C){
            
            temp = B;
            B = C;
            C = temp;
            
        }
        
        if(A>B){
             temp = A;
             A = B;
             B = temp;
        }
            
        
    }
    
    public   void imprimir(){
        
        System.out.println( A +" "+B+" "+C);
    }
    
    public   int LeerNumEntero(String m){
        Scanner teclado = new Scanner(System.in);
        System.out.println(m);
        int r = teclado.nextInt();
        return r;
    }
  public void  ordenar3(int x, int y, int z){
          A = x; B = y; C = z;
        
        int me=0, med=0, may=0;
        
        if (A <= B && B <= C) {
            me = A;
            med = B;
            may = C;
        }  
if(A <= C && C <= B) {
            me = A;
            med = C;
            may = B;
        } 
 if (B <= A && A <= C) {
            me = B;
            med = A;
            may = C;
        } 
 if (B <= C && C <= A) {
            me = B;
            med = C;
            may = A;
        } 
 if (C <= A && A <= B) {
            me = C;
            med = A;
            may = B;
        } 
 if  (C <= B && B <= A){
            me = C;
            med = B;
            may = A;
        }
        
  A=me;
  B=med;
  C=may;
  }  
  public void  ordenar4(int x, int y, int z){
         A = x;
        B = y;
         C = z;

        int temp;
 
        if (A > B) {
            temp = A;
            A = B;
            B = temp;
        }

        if (B > C) {
            temp = B;
            B = C;
            C = temp;
        }

        if (A > B) {
            temp = A;
            A = B;
            B = temp;
        }

 
    } 
 public void  ordenar5(int x, int y, int z){
       A = x; B = y;  C = z;
        
        if (B > C) {
            int temp = B;
            B =C;
            C = temp;
        }
        
        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }
        
        if (B > C) {
            int temp = B;
            B = C;
            C = temp;
        }
        
       
    }
 public void  ordenar6(int x, int y, int z){
         A = x;
         B =y;
         C = z;

        //puBliC void  ordenAr los números en orden AsCendente usAndo if AnidAdos
        if (A > B) {
            if (B > C) {
                int temp = A;
                A = C;
                C = temp;
            } else {
                int temp = A;
                A = B;
                B = temp;

                if (B > C) {
                    int temp2 = B;
                    B = C;
                    C = temp2;
                }
            }
        } else if (B > C) {
            if (A > C) {
                int temp = A;
                A = C;
                C = B;
                B = temp;
            } else {
                int temp = B;
                B = C;
                C = temp;
            }
        }
 }
 public int menor(int  x, int y) {
        return  x < y ?  x : y;
  }

    public   int mayor(int  x, int y) {
        return  x > y ?  x : y;
    }

 public  void  ordenar7(int x, int y, int z){
        A = x;
        B = y;
        C = z;

        int menorAB = menor(A, B);
        int menor = menor(menorAB, C);

        int mayorAB = mayor(A, B);
        int mayor = mayor(mayorAB, C);

        int medio = A + B + C - menor - mayor;
A=menor;
B=medio;
C=mayor;
 }
public void ordenar8(int x,int y , int z){ 
     A = x;
        B = y;
        C = z;
    int menor = Math.min(Math.min(A, B), C);
    int mayor = Math.max(Math.max(A, B), C);
    int medio = A+ B + C - menor - mayor;
    A =menor;
    B=medio;
    C=mayor;
 }
public void ordenar9(int x,int y , int z){ 
     A = x;
        B = y;
        C = z;
int menor = (A < B) ? (A < C ? A : C) : (B < C ? B : C);
int mayor = (A > B) ? (A > C ? A : C) : (B > C ? B : C);
int medio = A + B + C - menor - mayor;
    A =menor;
    B=medio;
    C=mayor;
 }
 public static void main(String[] args) {
        Ordenador ox= new Ordenador();
        int X = ox.LeerNumEntero(" Digite el primer numero");
        int Y = ox.LeerNumEntero(" Digite el segundo numero");
        int Z = ox.LeerNumEntero(" Digite el tercer numero");
       
        ox.ordenar2(X, Y, Z);
        
        ox.imprimir();
        
}
}

