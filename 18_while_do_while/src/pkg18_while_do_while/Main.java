/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18_while_do_while;

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
        /*estructuras de repeticion do y do-while
        -> while signigica mientras
        -> do significa hacer
        -> son if iterativos
        -> dependen de la evaluacion de condeiciones por lo que pueden llegar a ser infinitas
        -> usamos estas estructuras normalmente cuando no sabemos cuando vamos a dejar de iterar*/
        //1) imprimir los numeros del 1 al 10 de uno en uno (usando while)
        //declarar la variable de control
        int x = 1;
        while( x <= 10 ){
            System.out.println(x);
            //modificar la variable de control
            x++;
        }
        //2) imprimir los numeros del 1 al 10 de uno en uno (usando do-while)
        //do-while siempre hace la primera iteracion
        int y = 1;
        do{
            System.out.println(y);
            y++;
        }while(y <= 10);
        //3) hacer un programa que pregunte numeros al usuario, el programa termina
        //hasta que el usuario digita CERO.
        double numero = 777;
        Scanner s = new Scanner(System.in);
        System.out.println("Ejemplo usando while: ***************************");
        while(numero != 0){
            System.out.print("Digite un numero diferente de CERO: ");
            numero = s.nextDouble();
        }
        
        //lo mismo pero con do-while
        System.out.println("Ejemplo usando do-while: ***************************");
        double n;
        do{
            System.out.print("Digite un numero diferente de CERO: ");
            n = s.nextDouble();
        }while(n != 0);
    }
    
}
