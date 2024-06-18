package pkg12_switch2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que solicite digitar el año y el numero de mes como enteros.
        Luego se va a imprimir un mensaje indicando la cantidad de dias que tiene
        el mes/año proporcionado.
        IMPORTANTE: Recuerde que mes solo debe aceptar numeros entre 1 y 12
        RESOLVER UTILIZANDO SWITCH.*/
        Scanner x = new Scanner(System.in);
        int m,a;
        System.out.print("año: ");
        a = x.nextInt();
        System.out.print("mes: ");
        m = x.nextInt();
        switch(m){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 dias");
            break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 dias");
            break;
            case 2:
                if( a%4 == 0 )
                    System.out.println("29 dias");
                else
                    System.out.println("28 dias");
            break;
            default:
                System.out.println("Mes no valido.");
        }
    }
    
}
