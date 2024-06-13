/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_capturar6;

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
        /*Utilizar el operador AND
        Operador Logico AND && (DOBLE AMPERSAND)
        Hace obligatorio el cumplimiento de dos o mas condiciones.
        ejemplo en C++:

        int a = 7, b = 9, c = 6;
        //solo se permite el acceso si a > 5 Y b > 8 Y c > 1
        if( a > 5 && b > 8 && c > 1 )
            cout << "Bienvenido" << endl;
        else
            cout << "No permitido" << endl;
        
        Hacer un programar que imprima el mayor de 4 numeros los cuales seran digitados
        por el usuario. Si los 4 numeros son iguales imprima un mensaje indicandolo.
        NOTA: resolverlo usando el operador logico AND
        IMPORTANTE: esta no es la mejor forma de resolver este problema de numeros mayores.
        */
        Scanner xyz = new Scanner(System.in);
        double a,b,c,d;
        System.out.print("Digitar a: "); a = xyz.nextDouble();
        System.out.print("Digitar b: "); b = xyz.nextDouble();
        System.out.print("Digitar c: "); c = xyz.nextDouble();
        System.out.print("Digitar d: "); d = xyz.nextDouble();
        //obtener el numero mayor
        double mayor = 0;
        if( a >= b && a >= c && a >= d ) mayor = a;
        if( b >= a && b >= c && b >= d ) mayor = b;
        if( c >= a && c >= b && c >= d ) mayor = c;
        if( d >= a && d >= b && d >= c ) mayor = d;
        //si todos son iguales:
        if( a == b && a == c && a == d )
            System.out.println("Los 4 numeros son iguales");
        else
            System.out.println("El mayor es "+mayor);
    }
    
}
