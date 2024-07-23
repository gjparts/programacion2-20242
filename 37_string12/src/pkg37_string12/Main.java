package pkg37_string12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Método split
        crea un arreglo basado en un String, cada elemento
        del arreglo corresponde a partir el String en partes
        las cuales estan delimitadas por otro String al que llamaremos token*/
        String str = "sistemas,civil,industrial,electrica,mecanica industrial";
        //ejemplo:
        //declarar un arreglo de String sin inicializar
        String arreglo[];
        //apuntar dicho arreglo al resultado de split de String a dividir
        //en este caso vamos a partir el String usando como token a la coma
        arreglo = str.split(",");
        //imprimir los elementos del arreglo
        for( int i = 0; i < arreglo.length; i++ )
            System.out.println( arreglo[i] );
        //Usted puede usar cualquier String como token
        //excepto por algunos caracteres reservados como \
        //como recomendacion hay que probar que caracteres pueden usarse
        //como token: a prueba y error.
        str = "13775_Gerardo Portillo_0855_1236_2024/07/22";
        //se puede hacer split directamente al arreglo
        String arreglo2[] = str.split("_");
        //imprimir los elementos del arreglo
        for( int i = 0; i < arreglo2.length; i++ )
            System.out.println( arreglo2[i] );
        
        //No necesariamente el token debe de ser un String
        //de un caracter, puede usar varios caracteres como
        //token.
        str = "HondaSEPARADORCr-vSEPARADOR2016SEPARADORAzulSEPARADORImportadoSEPARADOR4x4";
        arreglo2 = str.split("SEPARADOR"); //puede tambien reutilizar un arreglo anterior
        //imprimir los elementos del arreglo
        for( int i = 0; i < arreglo2.length; i++ )
            System.out.println( arreglo2[i] );
        
        //que psaria si usamos un caracter no aceptado por split
        str = "Coca Cola 3L|Refresco|3|55.00|165.00|Cerveceria Hondureña";
        //como la barra | no es aceptada para hacer split entonces debemos
        //reemplazarla en el String que vamos a partir:
        arreglo2 = str.replace("|", "_").split("_");
        //imprimir los elementos del arreglo
        for( int i = 0; i < arreglo2.length; i++ )
            System.out.println( arreglo2[i] );
        /*Hace un programa que pregunte un String al usuario,
        el programa dira cuantas palabras tiene el String
        tomando en cuenta que cada palabra se separara por solo un espacio
        en blanco.
        Ejemplo:
        Digitar String:Gerardo Josue Portillo
        numero de palabras: 3
        
        otro ejemplo:
        Digitar String:Ingenieria En Sistemas .
        numero de palabras: 4
        */
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar String:");
        String str1 = s.nextLine();
        //forma 1:
        String arreglox[] = str1.split(" ");
        System.out.println("Numero de palabras: "+arreglox.length);
        //forma 2:
        System.out.println("Numero de palabras: "+str1.split(" ").length);
    }    
}
