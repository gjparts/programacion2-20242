package pkg31_string06;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*leer un String y luego imprimirlo dejando tres espacios
        en blanco entre cada caracter sin afectar a la cadena leida.
        -> tambien imprimir cuantas veces esta la letra n dentro
        de la cadena leida, ignorando mayusc./minusc.*/
        Scanner qwe = new Scanner(System.in);
        String str;
        System.out.print("Digitar string: ");
        str = qwe.nextLine();
        
        int n = 0;
        for( int i = 0; i < str.length(); i++ ){
            System.out.print( str.charAt(i)+"   " );
            if( str.toLowerCase().charAt(i) == 'n' ) n++;
        }
            
        System.out.println("");
        System.out.println("se encontro la letra n "+n+" veces.");
        
        
        
    }
    
}
