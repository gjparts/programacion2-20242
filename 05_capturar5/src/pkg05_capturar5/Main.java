/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_capturar5;

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
        /*Leer las 4 calificaciones bimestrales de un estudiante, estas seran numeros double
        y luego mostrar el promedio final obtenido en la clase.
        La nota final deberá mostrarse redondeada o sea no se permite la nota final con decimales.
        Si el promedio ya redondeado es mayor o igual a 70 mostrar el mensaje: APROBADO de lo contrario
        mostrar el mensaje REPROBADO.
        Tienen 5 minutos y por el chat me envian captura de pantalla de su programa.*/
        //se puede hacer con 4 variables para los parciales o con una sola variable para la nota final
        Scanner abc = new Scanner(System.in);
        double notaFinal = 0, promedio;
        System.out.print("Bimestre I: ");
        notaFinal = notaFinal + abc.nextDouble();
        System.out.print("Bimestre II: ");
        notaFinal = notaFinal + abc.nextDouble();
        System.out.print("Bimestre III: ");
        notaFinal = notaFinal + abc.nextDouble();
        System.out.print("Bimestre IV: ");
        notaFinal = notaFinal + abc.nextDouble();
        
        promedio = Math.round( notaFinal / 4.0 );
        
        System.out.println("El promedio final es: "+promedio);
        if( promedio >= 70 )
            System.out.println("APROBADO");
        else
            System.out.println("REPROBADO");
    }
    
}
