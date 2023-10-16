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
public class CalcIntereses {
    private double montoPrestamo; // Monto del préstamo
    private double tasaInteresAnual; // Tasa de interés efectiva anual (en decimales)
    private int numeroCuotas; // Número de cuotas

    public CalcIntereses(double montoPrestamo, double tasaInteresAnual, int numeroCuotas) {
        this.montoPrestamo = montoPrestamo;
        this.tasaInteresAnual = tasaInteresAnual;
        this.numeroCuotas = numeroCuotas;
    }

    // Método para calcular la cuota mensual
    public double calcularCuotaMensual() {
        double tasaInteresMensual = (tasaInteresAnual / 12) / 100; // Convertir la tasa anual a mensual
        double cuotaMensual = (montoPrestamo * tasaInteresMensual) / (1 - Math.pow(1 + tasaInteresMensual, -numeroCuotas));
        return cuotaMensual;
    }

    // Método para calcular el monto total a pagar
    public double calcularMontoTotal() {
        double cuotaMensual = calcularCuotaMensual();
        double montoTotal = cuotaMensual * numeroCuotas;
        return montoTotal;
    }

    // Método para mostrar la información del préstamo
    public void mostrarInformacion() {
        System.out.println("Monto del Préstamo: $" + montoPrestamo);
        System.out.println("Tasa de Interés Anual: " + tasaInteresAnual + "%");
        System.out.println("Número de Cuotas: " + numeroCuotas);
        System.out.println("Cuota Mensual: $" + calcularCuotaMensual());
        System.out.println("Monto Total a Pagar: $" + calcularMontoTotal());
    }
    
    public static void main (String args[]){
        CalcIntereses calc = new CalcIntereses(374400, 24.9996, 4);
        
        calc.calcularCuotaMensual();
        calc.calcularMontoTotal();
        calc.mostrarInformacion();
        
    }
}

    
    
    

