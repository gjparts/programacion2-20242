package pkg15_for03;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*9) Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de esos 10 numeros,
        asi como cual es el mayor de los 10 numeros.*/
        //forma 2: en la primera iteracion establezco quien
        //es hasta ese momento el mayor
        Scanner s = new Scanner(System.in);
        double suma = 0; //acumulador
        double mayor = 7777; //bandera
        double numero; //variable temporal para lectura
        
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digite un numero: ");
            numero = s.nextDouble();
            suma += numero; //sumar numero leido
            //ver si el numero leido es mayor al que ya era el mayor
            //pero si es la primera iteracion el numero leido sera el numero mayor
            if( i == 1 )
                mayor = numero;
            else
                if( numero > mayor )
                    mayor = numero;
        }
        System.out.println("Suma de los numeros: "+suma);
        System.out.println("Numero mayor: "+mayor);
    }
}