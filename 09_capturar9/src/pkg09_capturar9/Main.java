package pkg09_capturar9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*OR: de dos o mas condiciones, con una que se cumpla se ejecuta el codigo condicionado.
        en Lenguajes basados C++ se usa ||
        | es el caracter 124*/
        /*Hacer un programa que solicite digitar el año y el numero de mes como enteros.
        Luego se va a imprimir un mensaje indicando la cantidad de dias que tiene
        el mes/año proporcionado.
        IMPORTANTE: Recuerde que mes solo debe aceptar numeros entre 1 y 12*/
        Scanner z = new Scanner(System.in);
        int a, m;
        System.out.print("Escribir el año: ");
        a = z.nextInt();
        System.out.print("Escribir el mes: ");
        m = z.nextInt();
        //validar que el mes sea correcto
        if( m >= 1 && m <= 12 ){
            if( m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 ) System.out.println("31 dias");
            if( m == 4 || m == 6 || m == 9 || m == 11 ) System.out.println("30 dias");
            if( m == 2 ){
                if( a%4 == 0 )
                    System.out.println("29 dias");
                else
                    System.out.println("28 dias");
            }
        }
        else
            System.out.println("Mes debe ser entre 1 y 12");
    }
    
}
