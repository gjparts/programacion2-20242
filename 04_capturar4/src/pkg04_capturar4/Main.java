/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_capturar4;

/**
 *
 * @author Gerardo Portillo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Se da un descuento por venta, se captura el monto de la venta.
        Si la venta es mayor o igual a 2000 se da un 10% de descuento
        Si la venta es mayor o igual a 5000 se da un 20% de descuento
        Si la venta es mayor o igual a 10000 se da un 30% de descuento
        Si la venta es mayor o igual a 20000 se da un 50% de descuento
        Hacer un programa que imprima el valor del descuento y el valor a pagar*/
        Scanner lector = new Scanner(System.in);
        double venta, descuento;
        System.out.print("Digite el monto de la venta: ");
        venta = lector.nextDouble();
        if( venta >= 20000 )
            descuento = venta*0.50;
        else
            if( venta >= 10000 )
                descuento = venta*0.30;
            else
                if( venta >= 5000 )
                    descuento = venta*0.20;
                else
                    if( venta >= 2000 )
                        descuento = venta*0.10;
                    else
                        descuento = 0.00;
        System.out.println("El descuento es: "+descuento);
        System.out.println("El valor a pagar: "+(venta-descuento));   
            
            
            
            
            
       
    }
    
}
