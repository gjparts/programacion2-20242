package pkg16_for04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*10) Hacer un programa que pida 10 numeros enteros, al finalizar
        mostrar el promedio de los numeros, asi como el conteo
        de cuantos numeros pares fueron leidos y cuantos numeros
        impares fueron leidos ademas de imprimir cual fue
        el numero mayor y el numero menor leido.*/
        
        //Solucion propuesta: forma que usare: mayor y menor se definen
        //en la primera iteracion
        Scanner s = new Scanner(System.in);
        int numero;
        int suma = 0; //acumulador
        int mayor = 77777, menor = 77777; //banderas no importa el valor de inicio
                                          //en la primera iteracion los inicializare
        int pares = 0, impares = 0; //contadores
        //leer los valores
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digite numero entero: ");
            numero = s.nextInt();
            
            suma += numero; //suma = suma + numero;
            
            if( numero%2 == 0 )
                pares++;
            else
                impares++;
            
            //en la primera iteracion defino el mayor y menor
            if( i == 1 ){
                mayor = numero;
                menor = numero;
            }
            else{
                if( numero > mayor ) mayor = numero;
                if( numero < menor ) menor = numero;
            }
        }
        //resultados
        System.out.println("Promedio: "+(suma/10));
        System.out.println("Impares: "+impares);
        System.out.println("Pares: "+pares);
        System.out.println("Mayor: "+mayor);
        System.out.println("Menor: "+menor);
    }    
}
