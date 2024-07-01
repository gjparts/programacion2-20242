package pkg23_control_de_flujo_break;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //break: termina con la estructura de repeticion.
        /*usando una estructura de repeticion for hacer un programa
        que lea 100 numeros positivos de tipo long.
        -> si durante la lectura se digita un numero negativo terminar con
           la lectura de los 100 numeros.
        -> al finalizar el programa mostrar la suma de los numeros leidos;
           pero no sume el numero negativo leido para terminar con la estructura.*/
        Scanner s = new Scanner(System.in);
        /*Tipo de dato Long
        permite almacenar enteros; pero su capacidad es del doble del tipo int.
        //para usar numeros Long en JAVA se coloca una letra L al final
        //del numero entero
        long cedula = 1401198201055L;
        //int cedula = 1401198201055; //int no soporta este tipo de numeros*/
        long numero, suma = 0L;
        for( int i = 1; i <= 100; i++ ){
            System.out.print("Digitar numero entero positivo: ");
            numero = s.nextLong();
            //si el numero leido es negativo entonces terminamos con el for
            if( numero < 0 )
                break;
            
            suma += numero;
        }
        System.out.println("Suma: "+suma);
    }    
}
