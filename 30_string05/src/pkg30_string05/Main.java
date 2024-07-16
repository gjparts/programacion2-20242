package pkg30_string05;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //comparar dos String en JAVA
        //No es correcto comparar dos String usando ==
        //porque el operador de igualdad en JAVA lo que hace
        //es comparar si dos objetos tienen la misma direccion de memoria
        String a = "Manzana";
        String b = "Manzana";
        if( a == b )
            System.out.println("a y b son iguales");
        else
            System.out.println("a y b no son iguales");
        /*lo anterior va a funcionar y contradecir lo primero porque
        cuando JAVA encuentra dos variables que almacenan valores constantes
        lo que hace para optimizar memoria en el proceso de ejecucion es
        guardarlas en la misma direccion de memoria dentro de algo llamado cache*/
        //la siguiente prueba da mas sentido a lo que se dijo al principio:
        Scanner s = new Scanner(System.in);
        String x,y;
        System.out.print("Digitar string para x: ");
        x = s.nextLine();
        System.out.print("Digitar string para y: ");
        y = s.nextLine();
        
        if( x == y )
            System.out.println("x y, son iguales usando ==");
        else
            System.out.println("x y, no son iguales usando ==");
        
        //direcciones de memmorias de las diferentes variables
        System.out.println("a: "+System.identityHashCode(a));
        System.out.println("b: "+System.identityHashCode(b));
        System.out.println("x: "+System.identityHashCode(x));
        System.out.println("y: "+System.identityHashCode(y));
        //observe que para a y b se imprime la misma direccion de memoria como se
        //explico arriba
        //lo correcto para comparar dos String (o dos Objetos) en JAVA
        //a traves del metodo equals
        if( x.equals(y) == true )
            System.out.println("x y, son iguales usando equals");
        else
            System.out.println("x y, no son iguales usando equals");
        //IMPORTANTE: equals comparar SIN IGNORAR mayusculas y minusculas
        
        //como comparo dos String; pero ignorando masyuc./minusc.?
        //Forma 1: comparando ambos String; pero con el mismo casing
        if( x.toUpperCase().equals( y.toUpperCase() ) == true )
            System.out.println("x y, son iguales usando equals, ignorando el casing");
        else
            System.out.println("x y, no son iguales usando equals, ignorando el casing");
        
        //Forma 2: usando el metodo equalsIgnoreCase
        if( x.equalsIgnoreCase(y) == true )
            System.out.println("x y, son iguales usando equalsIgnoreCase");
        else
            System.out.println("x y, no son iguales usando equalsIgnoreCase");
        
        //Comparar los dos String, usando equalsIgnoreCase e ignorando espacios de relleno
        if( x.trim().equalsIgnoreCase(y.trim()) == true )
            System.out.println("x y, son iguales usando equalsIgnoreCase y trim");
        else
            System.out.println("x y, no son iguales usando equalsIgnoreCase y trim");
        
        /*Hacer un programa que pregunte 3 String al usuario,
        luego debera comparar si son iguales.
        y que devuelva un mensaje indicando que son
        iguales. en caso contrario un mensaje indicando
        que no son iguales.

        Ignore mayusc./minusc.
        Ignore relleno de espacios al inicio y al final*/
        String uno, dos, tres;
        System.out.print("Digitar string uno: ");
        uno = s.nextLine();
        System.out.print("Digitar string dos: ");
        dos = s.nextLine();
        System.out.print("Digitar string tres: ");
        tres = s.nextLine();
        //forma 1:
        if( uno.trim().equalsIgnoreCase( dos.trim() ) == true && uno.trim().equalsIgnoreCase( tres.trim() ) )
            System.out.println("Los tres String son iguales");
        else
            System.out.println("Los tres String no son iguales");
        //forma 2:
        if( uno.trim().equalsIgnoreCase( dos.trim() ) == true )
            if (uno.trim().equalsIgnoreCase( tres.trim() ) )
                System.out.println("Los tres String son iguales");
            else
                System.out.println("Los tres String no son iguales");
        else
            System.out.println("Los tres String no son iguales");
    }    
}

