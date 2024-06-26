package pkg17_for05;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*hacer un programa que pida al usuario un ancho
        y un alto como numeros enteros.
        El programa debe imprimir un rectangulo relleno de asteriscos
        en base al alto y ancho digitados.*/
        Scanner s = new Scanner(System.in);
        int alto, ancho;
        System.out.print("Digitar ancho: ");
        ancho = s.nextInt();
        System.out.print("Digitar alto: ");
        alto = s.nextInt();
        //este lo voy a resolver con una estructura anidada (nested) de dos for
        for( int i = 1; i <= alto; i++ ){  //for principal (renglones)
            for( int j = 1; j <= ancho; j++ ){ //for secundario (caracteres por renglon)
                System.out.print("*");
            }
            System.out.println(); //salto de linea
        }
    }
    
}
