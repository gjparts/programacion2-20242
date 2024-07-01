package pkg24_control_de_flujo_break;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*hacer una estructura while infinita
        dicha estructura se rompe solo si adivina el numero secreto
        el numero secreto sera un numero entero al azar entre 1 y 6
        dicho numero va a cambiar en cada iteracion.*/
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int leido, azar;
        //estructura while infinita
        while(true){
            //generar un numero al azar
            azar = r.nextInt(6-1+1)+1;
            System.out.print("Adivina el numero secreto entre 1 y 6: ");
            leido = s.nextInt();
            //si lo adivina entonces se rompe el while infinito
            if( leido == azar ) break;
            //si llego aqui es porque la estructura no se ha roto
            System.out.println("Numero incorrecto, sigue participando.");
        }
        System.out.println("Has sido liberado, Adios.");
    }    
}
