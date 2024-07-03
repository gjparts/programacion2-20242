package pkg25_arreglos;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        /*ARREGLO (ARRAY)
        Es una estructura de datos estatica, secuencial y homogenea que 
        agrupa datos.
        @ estatica: no puede cambiar su tamaño (lo contrario a dinamico)
        @ secuencial: ocupa espacios de consecutivos de memoria
                      (lo contrario a aleatorio)
        @ homogenea: todos sus elementos son del mismo tipo
                     (lo contrario a heterogeneo).
        formas de declarar arreglos:
        1) inicializarlo sin datos
        2) prellenado o sea inicializarlo con datos predefinidos*/
        //EJEMPLOS
        //1) inicializarlo sin datos
        //hacer un arreglo de numeros de enteros de tamaño 5 sin datos de inicio
        int arreglo1[] = new int[5];
        //JAVA por lo general inicializar los elementos del arreglo
        //con valores predeterminados, en el caso de enteros coloca como
        //valor de inicio a cada elemento CERO.
        
        //imprimir cada elemento de arreglo1 de forma manual
        //Note que los elementos del arreglo se numeran de 0 a N-1
        //a esto se le conoce como Zero Indexing
        System.out.println("primer elemento de arreglo1: "+arreglo1[0]);
        System.out.println("segundo elemento de arreglo1: "+arreglo1[1]);
        System.out.println("tercer elemento de arreglo1: "+arreglo1[2]);
        System.out.println("cuarto elemento de arreglo1: "+arreglo1[3]);
        System.out.println("quinto elemento de arreglo1: "+arreglo1[4]);
        //si pretende acceder a un elemento inexistente obtendra un error
        //ArrayIndexOutOfBounds que indica que se sale de los limites del arreglo
        //System.out.println( arreglo1[5] );
        //se puede modificar un elemento luego de haber inicializado el arreglo
        arreglo1[1] = 777;
        System.out.println("segundo elemento de arreglo1: "+arreglo1[1]);
        
        //2) prellenado o sea inicializarlo con datos predefinidos
        int arreglo2[] = {6, 9, 100, 2000, 30, 11, 5, 8, -8, 456};
        //para obtener el tamaño de un arreglo usamos su
        //propiedad/atributo length
        System.out.println("El tamaño de arreglo2 es "+arreglo2.length);
        System.out.println("Primer elemento de arreglo2: "+arreglo2[0]);
        System.out.println("Ultimo elemento de arreglo2: "+arreglo2[ arreglo2.length-1 ]);
        
        //imprimir el contenido de un arreglo usando for
        System.out.println("************************");
        for( int i = 0; i < arreglo2.length; i++ ){
            System.out.println( arreglo2[i] );
        }
        //si imprime la variable del arreglo
        //obtendra la direccion de memoria asignada
        //al objeto Arreglo que apunta a la variable
        System.out.println(arreglo2);
        
        /*Hacer un programa que tenga un arreglo unidimensional
        de numeros enteros de tamaño 25 y llenar cada uno de sus
        elementos con un numero al azar entre 5 y 97 no importa
        que se repitan. Por ultimo imprimir el arreglo.*/
        Random r = new Random();
        int arreglo3[] = new int[25];
        System.out.println("***************************");
        //llenar cada item del arreglo
        for( int i = 0; i < arreglo3.length; i++ ){
            arreglo3[i] = r.nextInt(97-5+1)+5; //generar numero y asignar
            System.out.println( arreglo3[i] ); //imprimir
        }
    }
}










