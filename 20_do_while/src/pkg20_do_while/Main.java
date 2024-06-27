package pkg20_do_while;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*3) Hacer un programa que lea N cantidad de numeros positivos.
        La lectura de numeros terminara cuando se lea un numero negativo.
        Una vez concluida la lectura de numeros mostraremos la suma de los
        numeros positivos capturados. (resolver usando while o do-while)*/
        //lo resolvere usando do-while
        Scanner qwe = new Scanner(System.in);
        float numero; //variable temporal y de control
        float suma = 0; //acumulador
        
        do{
            System.out.print("Digitar numero positivo: ");
            numero = qwe.nextFloat();
            if( numero >= 0 ) suma += numero; //suma solo positivos
        }while(numero >= 0);
        System.out.println("Suma: "+suma);
    }    
}
