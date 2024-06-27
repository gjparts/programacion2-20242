package pkg19_while;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*3) Hacer un programa que lea N cantidad de numeros positivos.
        La lectura de numeros terminara cuando se lea un numero negativo.
        Una vez concluida la lectura de numeros mostraremos la suma de los
        numeros positivos capturados. (resolver usando while o do-while)*/
        //lo resolvere usando while
        Scanner asd = new Scanner(System.in);
        float numero = 7777; //variable temporal y de control
        float suma = 0; //acumulador
        
        while( numero >= 0 ){
            System.out.print("Digite numero positivo: ");
            numero = asd.nextFloat();
            
            if( numero >= 0 ) suma += numero; //solo sumar numeros positivos
        }
        System.out.println("Suma: "+suma);
    }   
}
