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
        char dv; //almacena un caracter o sea 1 byte
        boolean ev; //almacena true o false o sea 1 bit
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
        int f = 1, e= 42;
        double d = 8;
        //concatenacion: el operador suma (+) en JAVA esta sobrecargado
        //si ambos lados de la suma son numeros entonces se suman aritmeticamente
        //si un lado de la suma es una cadena de texto entonces se unen o concatenan
        //recuerde que en programacion toda expresion se evalua en pares de izquierda a derecha
        //obedeciendo a la ley de precedencia de operadores
        System.out.println("abc"+d+"xyz"+e+f);
        System.out.println("abc"+d+"xyz"+(e+f));
        
        int entero1 = 7, entero2 = 9;
        //lo siguiente devolvera un resultado incorrecto
        System.out.println("La suma de "+entero1+" mas "+entero2+" es "+entero1+entero2);
        //en estos casos lo anterior se arregla gracias a la ley de precedencia
        //de operadores, aqui seria poner un parentesis para aislar la operacion aritmetica
        System.out.println("La suma de "+entero1+" mas "+entero2+" es "+(entero1+entero2) );
        
        //uso de las funciones de la clase Math
        System.out.println("El valor de PI es "+Math.PI);
        //pow (elevar un valor base a determinada potencia)
        //se recomienda usar double cuando trabaje con pow
        double base = 3, exponente = 5;
        System.out.println(base+" elevado a "+exponente+" es "+Math.pow(base,exponente));
        double w = 2, t = 5, u;
        u = Math.pow(2, 5);
        System.out.println("el valor de u es "+u);
        System.out.println(u+" algo");
        System.out.println("algo "+u);
        //en la siguiente expresion decimos que u es positivo
        System.out.println(+u+" algo");
        //en la siguiente expresion decimos que u es negativo
        System.out.println(-u+" algo");
        //lo siguiente da error ya que un String no tiene signo
        //System.out.println(+"algo"+u);
        //calculo de raiz cuadrada, se recomienda usar double
        double cifra1 = 25;
        System.out.println("La raiz cuadrada de "+cifra1+" es "+Math.sqrt(cifra1));
        double cifra2 = 6, raiz2;
        raiz2 = Math.sqrt(cifra2);
        System.out.println("El valor de raiz2 es "+raiz2);
        //con pow Usted puede obtener una raiz cubica:
        double cifra8 = 27, cubica;
        cubica = Math.pow(cifra8,1.0/3.0);
        System.out.println("La raiz cubica de "+cifra8+" es "+cubica);
        //importante, en JAVA no es lo mismo 1/3 que 1.0/3.0
        //el resultado de 1/3 es 0 porque es una division de enteros
        //el resultado de 1.0/3.0 es 0.333333 porque es una division de doubles
        System.out.println(1/3); //cociente de division de enteros
        System.out.println(1%3); //residuo de division de enteros
        System.out.println(1.0/3.0);
        System.out.println(5/2); //cociente de division de enteros
        System.out.println(5%2); //residuo de division de enteros
        System.out.println(5.0/2.0);
        double num1 = 3.45, num2 = 9.5, num3 = 5, num4 = 5.0001, num5 = 3.9, num6 = 3.2;
        System.out.println("round de num1 es "+Math.round(num1));
        System.out.println("round de num2 es "+Math.round(num2));
        //floor (entero inferior) y ceil (entero superior)
        System.out.println("ceil de num1 es "+Math.ceil(num1));
        System.out.println("ceil de num2 es "+Math.ceil(num2));
        System.out.println("ceil de num3 es "+Math.ceil(num3));
        System.out.println("ceil de num4 es "+Math.ceil(num4));
        System.out.println("ceil de num5 es "+Math.ceil(num5));
        System.out.println("ceil de num6 es "+Math.ceil(num6));
        
        System.out.println("floor de num1 es "+Math.floor(num1));
        System.out.println("floor de num2 es "+Math.floor(num2));
        System.out.println("floor de num3 es "+Math.floor(num3));
        System.out.println("floor de num4 es "+Math.floor(num4));
        System.out.println("floor de num5 es "+Math.floor(num5));
        System.out.println("floor de num6 es "+Math.floor(num6));
    }
    
}
