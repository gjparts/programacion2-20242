/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00_primer_dia;

/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //println imprime y luego salta al siguiente renglon
        System.out.println("Hola UNAH");
        System.out.println("Carrera de Sistemas 2024");
        /*este es un comentario de
        varios renglones
        que se puede usar para tomar notas*/
        System.out.print("Hola soy Gerardo");
        System.out.print("Soy de SPS y aqui hace calor");
        //solo hacer salto de renglon
        System.out.println("");
        System.out.println();
        //tambien puede poner caracteres de escape
        System.out.println("Esta es la\nclase de\nProgramacion 2");
        System.out.print("\n\n\n\n\n\n\nHasta aqui\n");
        System.out.println("Rojo\tAmarillo\tAzul\tVerde");
        //si necesita imprimir slash inverso debe hacerlo asi:
        System.out.println("Esto es un slash inverso \\");
        
        //variables
        int a;  //numero enteros
        float b; //real de presicion simple
        double c; //real de precision doble
        char d; //almacena un caracter o sea 1 byte
        boolean e; //almacena true o false o sea 1 bit
        /*reglas para nombrar variables:
        1) no usar palabras reservadas (if, for, int, etc.)
        2) dos variable no se pueden llamar por el mismo nombre dentro del mismo ambito.
        3) no puede nombrarse solo usando numeros
        4) su nombre no puede iniciar en numero
        5) su nombre no debe llevar espacios en blanco ni caracteres no validos
        6) en JAVA no es lo mismo la variable UNAH que Unah ya que en los lenguajes basados
           en C la capitalizacion (casing) si determina la diferencia entre una mayuscula y
           una minuscula.*/
        int UNAH;
        int Unah;
        //manejo de variables
        int x = 6, y = 9, z;    //se puede declarar multiples variables en una sola instruccion mientras todas
                                //sean del mismo tipo, incluso puede inicializarlas
        double abc = 2.56565, xyz = 3.567899;
        double gjp = 7.896;
        //sobre el uso de float (debe colocar una f al final si va a usar decimales)
        float qwerty = 4.9f;
        float tyuiop = 2; //si no usa decimales no esta obligado a poner la f
        //sobre el uso de char (van entre comillas simples, caracter 39)
        char c1 = 'x'; //no se permite inicializar un char vacio
        //un char guarda un valor entero que representa un caracter dentro de una tabla de codificacion
        char c2 = 64;
        char c3;
        System.out.println("valor de c1: "+c1);
        System.out.println("valor de c2: "+c2);
        //System.out.println("valor de c2: "+c3); //JAVA no permite imprimir variables no inicializadas
        //System.out.println("valor de UNAH: "+UNAH);
    }
    
}
