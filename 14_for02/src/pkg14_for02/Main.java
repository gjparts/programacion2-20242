/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_for02;

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
        /*9) Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de esos 10 numeros,
        asi como cual es el mayor de los 10 numeros.*/
        //forma 1: estableciendo un valor inicial para mayor tan pequeño que
        //pueda ser superado
        Scanner qwe = new Scanner(System.in);
        double suma = 0; //variable acumulador para sumar
        //double mayor = -999999999; //variable bandera para saber cual es mi numero mayor a medida leo
        double mayor = Double.MAX_VALUE*-1; //variable bandera para saber cual es mi numero mayor a medida leo
        /*si usa variables int: Integer.MAX_VALUE*-1
        si usa variables float: Float.MAX_VALUE*-1*/
        double numero; //variable temporal para leer cada numero
        //estructura de repeticion parea leer los numeros
        for(int i = 1; i <= 10; i++){
            System.out.print("Digite un numero: ");
            numero = qwe.nextDouble();
            //sumar ese numero
            suma += numero; //suma = suma + numero;
            //si el numero recien leido supera al numero mayor almacenado
            //entonces ese numero sera el nuevo mayor
            if( numero > mayor )
                mayor = numero;
        }
        System.out.println("La suma de numeros: "+suma);
        System.out.println("El numero mayor es: "+mayor);
    }
    
}
