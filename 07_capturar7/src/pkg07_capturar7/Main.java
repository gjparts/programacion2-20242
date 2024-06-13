/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_capturar7;

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
        /*ejemplo de uso del operador logico AND
        tambien podemos utilizarlo para evaluar rangos numericos
        
        Leer la edad de una persona y luego imprimir a que grupo de poblacion
        corresponde en base a la siguiente tabla:
        Grupo               rango
        menor de edad       de 0 a menos de 18
        mayor de edad       entre 18 y 20
        adulto              entre 21 y 59
        tercera edad        de 60 en delante*/
        Scanner qwe = new Scanner(System.in);
        int edad;
        System.out.print("ingrese su edad: ");
        edad = qwe.nextInt();
        
        if( edad >= 0 && edad < 18 ) System.out.println("menor de edad");
        if( edad >= 18 && edad <= 20 ) System.out.println("mayor de edad");
        if( edad >= 21 && edad <= 59 ) System.out.println("adulto");
        if( edad >= 60 ) System.out.println("tercera edad");
    }
    
}
