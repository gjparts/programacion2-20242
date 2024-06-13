/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_capturar8;

/**
 *
 * @author Gerardo Portillo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Haga un programa que pregunte al usuario por su salario mensual y su antigüedad en años
        El programa le dira cuanto es el bono obtenido, este se calcula de
        la siguiente forma:
        multiplicar el salario mensual por un porcentaje de acuerdo a su antigüedad en años
        el porcentaje sale de esta tabla:

        Antigüedad    	 		% bono
        menos de 5 años	 		10%
        de 5 a menos de 10 años		15%
        de 10 a menos de 20 años	20%
        20 años o mas			25%*/
        Scanner ert = new Scanner(System.in);
        double salario, antiguedad, porcentaje = 0, bono;
        System.out.print("Digite su salario mensual: ");
        salario = ert.nextDouble();
        System.out.print("Digite su antigüedad en años: ");
        antiguedad = ert.nextDouble();
        
        if( antiguedad < 5 ) porcentaje = 0.10;
        if( antiguedad >= 5 && antiguedad < 10 ) porcentaje = 0.15;
        if( antiguedad >= 10 && antiguedad < 20 ) porcentaje = 0.20;
        if( antiguedad >= 20 ) porcentaje = 0.25;
        
        bono = salario*porcentaje;
        System.out.println("El bono es: "+bono);
    }
    
}
