/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27_string02;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //capturar String mediante Scanner en la consola
        Scanner xyz = new Scanner(System.in);
        System.out.print("Digitar un String: ");
        String cadena1 = xyz.nextLine();
        
        System.out.println("El String leido: "+cadena1);
    }
    
}
