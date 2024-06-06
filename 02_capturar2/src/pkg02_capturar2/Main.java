/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_capturar2;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar variables
        Scanner s = new Scanner(System.in);
        double a,b,c,d;
        System.out.print("Digitar a: ");
        a = s.nextDouble();
        System.out.print("Digitar b: ");
        b = s.nextDouble();
        System.out.print("Digitar c: ");
        c = s.nextDouble();
        System.out.print("Digitar d: ");
        d = s.nextDouble();
        //resolver
        //por partes
        double numerador, denominador;
        numerador = Math.pow(a+b,3);
        denominador = Math.sqrt(c-d);
        System.out.println("Forma 1: El resultado es "+(numerador/denominador));
        
        //un solo calculo
        System.out.println("Forma 2: El resultado es "+( Math.pow(a+b,3)/Math.sqrt(c-d) ));
        
    }
    
}
