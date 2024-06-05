/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_capturar1;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner; //importar clase para poder capturar datos
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar un objeto de clase Scanner
        //System.in representa al input de la consola del sistema
        Scanner s = new Scanner(System.in);
        //declarar variables
        int a,b;
        //leer valores desde la consola del sistema y depositarlos en cada variable
        System.out.print("Digitar el valor de a: ");
        a = s.nextInt();
        System.out.print("Digitar el valor de b: ");
        b = s.nextInt();
        System.out.println("La suma de ambos numeros es "+(a+b));
    }
    
}
