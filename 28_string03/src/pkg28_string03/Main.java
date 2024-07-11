package pkg28_string03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Bug que sucede en la consola de Windows
        cuando se viene de leer un numero primitivo
        y luego se quiere leer un String.*/
        Scanner s = new Scanner(System.in);
        int a;
        String cadena1;
        System.out.print("Digite un numero entero: ");
        a = s.nextInt();
        /*cuando venimos de leer un numero primitivo y queremos
        leer un String el inputbuffer de la consola por alguna
        razon no se vacia por lo que se ignora a s.nextLine()
        para impedirlo debemos ejecutar lo siguiente luego de leer
        un numero y antes de leer un String en la consola*/
        
        s.nextLine(); //lanzar un nextLine sin apuntar a ninguna variable
                      //esto vacia el buffer
        
        System.out.print("Digite un String: ");
        cadena1 = s.nextLine();
        System.out.println("Numero Leido: "+a);
        System.out.println("String Leido: "+cadena1);
        System.out.println("FIN DEL PROGRAMA ***********************");
    }
    
}
