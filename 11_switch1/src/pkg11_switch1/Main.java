/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_switch1;

/**
 *
 * @author Gerardo
 */
import java.util.Random; //importar generador de numeros aleatorios
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Hacer un programa que genere un numero al azar entre 3 y 8
        y dependiendo del numero generado nos imprima un color, estos pueden ser:
        3 = verde, 4 = azul, 5 = rojo, 6 = blanco, 7 = negro, 8 = amarillo*/
        Random generador = new Random(); //instanciar un nuevo objeto de Clase Random
        int numero = generador.nextInt(8-3+1)+3;
        System.out.println("numero generado: "+numero);
        switch( numero ){
            case 3:
                System.out.println("Verde");
            break;
            case 4:
                System.out.println("Azul");
            break;
            case 5: System.out.println("Rojo"); break;
            case 6: System.out.println("Blanco"); break;
            case 7: System.out.println("Negro"); break;
            case 8: System.out.println("Amarillo"); break;
            default:
                System.out.println("Numero desconocido");
        }
        
    }
    
}
