package pkg22_control_de_flujo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Instrucciones de control de flujo
        -> continue: termina la iteracion actual y pasa a la siguiente
        -> break: termina con la estructura de repeticion (no sigue iterando)
        normalmente estas instrucciones se condicionan.*/
        //ejemplo de uso de continue
        /*Hacer un programa que imprima los numeros del 1 al 100;
        pero no imprima los numeros que sean multiplos de 9.
        RETO: resuelvalo usando la instruccion continue.*/
        for( int i = 1; i <= 100; i++ ){
            if( i%9 == 0 ) continue; //saltar la iteracion actual
            System.out.println(i);
        }
        /*Leer N cantidad de numeros enteros, sume solo aquellos
        numeros que sean positivos. Si digita un numero negativo debera
        ignorarlo y seguir leyendo numeros.
        -> El programa termina cuando se digite el numero CERO
           y muestre la suma de los numeros leidos
        RETO: resuelvalo usando la instruccion continue.*/
        Scanner x = new Scanner(System.in);
        int n, suma = 0;
        do{
            System.out.print("Digite numero entero (cero termina el programa): ");
            n = x.nextInt();
            
            if( n < 0 ) continue; //terminar la iteracion actual
            
            suma += n;
        }while( n != 0 );
        System.out.println("Suma: "+suma);
    }    
}
