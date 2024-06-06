/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_capturar3;

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
        /*En una tienda se da un descuento de acuerdo al monto vendido.
        si el monto es mayor que 10000 entonces damos un descuento del 20%
        sobre el valor de la venta de lo contrario no damos descuento.
        Capturar el monto vendido e imprimir el valor del descuento y el
        valor final a pagar. ejemplo:

        Digitar monto vendido: 15000
        El descuento es: 3000
        El valor a pagar es: 12000

        otro ejemplo:
        Digitar monto vendido: 10000
        El descuento es: 0
        El valor a pagar es: 10000

        otro ejemplo:
        Digitar monto vendido: 5000
        El descuento es: 0
        El valor a pagar es: 5000*/
        Scanner leer = new Scanner(System.in);
        //variables
        float monto, descuento;
        System.out.print("Digitar el monto de la venta: ");
        monto = leer.nextFloat();
        
        if( monto > 10000 )
            descuento = monto*0.20f;
        else
            descuento = 0.00f;
        
        System.out.println("El descuento es: "+descuento);
        System.out.println("El valor a pagar es: "+(monto-descuento));
    }
    
}
