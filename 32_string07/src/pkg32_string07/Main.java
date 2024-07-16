package pkg32_string07;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer arreglo de String que tenga almacenados los nombres de
        siete frutas.
        Luego pregutar al usuario por una fruta, el programa va a buscar
        si dicha fruta existe dentro del arreglo, si se encuentra
        mostrara un mensaje indicando la posicion donde fue encontrada,
        de lo contrario el programa mostrar un mensaje indicando que
        la fruta no se encontro.
        -> la busqueda debe ignorar mayusc./minusc.*/
        String frutas[] = {"Limon", "Sandia", "Manzana", "Uva", "Melon", "Pera", "Mango"};
        System.out.print("Digite una fruta para buscar: ");
        Scanner s = new Scanner(System.in);
        String buscar = s.nextLine();
        
        int contador = 0;
        for( int i = 0; i < frutas.length; i++ ){
            if( frutas[i].equalsIgnoreCase(buscar) == true ){
                System.out.println("Fruta encontrada en la posicion "+i);
                contador++;
                break; //fruta encontrada no seguimos buscando.
            }
        }
        if( contador == 0 ) System.out.println("No se encontró.");
        //imprimir cada fruta del arreglo llamado frutas; pero colocando un asterisco
        //entre cada caracter de cada fruta. Imprima un fruta por renglon.
        //sin afectar al arreglo.
        
    }    
}
