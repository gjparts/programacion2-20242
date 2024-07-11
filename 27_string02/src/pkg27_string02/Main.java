package pkg27_string02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //capturar String mediante Scanner en la consola
        Scanner xyz = new Scanner(System.in);
        System.out.print("Digitar un String: ");
        String cadena1 = xyz.nextLine();
        
        System.out.println("El String leido: "+cadena1);
        /*Del String leido: imprimir el tamaño, su version en mayusculas,
        su version en minusculas, su version aplicando trim, tamaño
        del String aplicando trim, imprimir una copia del String pero reemplazando
        los caracteres A por numeros 4 ignorando mayusculas/minusculas
        sin usar el metodo replace.*/
        System.out.println("Tamaño: "+cadena1.length());
        System.out.println("Mayusculas: "+cadena1.toUpperCase());
        System.out.println("Minusculas: "+cadena1.toLowerCase());
        System.out.println("Trim: "+cadena1.trim());
        System.out.println("Tamaño luego de Trim: "+cadena1.trim().length());
        String copia = "";
        for( int i = 0; i < cadena1.length(); i++ ){
            //if( cadena1.charAt(i) == 'a' || cadena1.charAt(i) == 'A' )
            //if( cadena1.toLowerCase().charAt(i) == 'a' )
            if( cadena1.toUpperCase().charAt(i) == 'A' )
                copia += '4';
            else
                copia += cadena1.charAt(i);
        }
        System.out.println("Copia reemplazando A por 4: "+copia);
    }
    
}
