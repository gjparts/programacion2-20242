package pkg36_string11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Método substring
        Devuelve un String que esta dentro de otro String.
        en JAVA se usa de dos formas:
        a) .substring(posicion inicial, posicion final)
            devuelve un String desde la posicion inicial hasta la final
        b) .substring(posicion inicial)
            devuelve un String desde la posicion final hasta el resto del String*/
        String str = "Ingenieria en Sistemas UNAH 2024";
        System.out.println(str);
        System.out.println("substring desde 0 hasta 5: "+str.substring(0, 5));
        System.out.println("todos los char desde la posicion 10: "+str.substring(10));
        //No olvide que si pone una posicion que no existe va a dar excepcion:
        //StringIndexOutOfBoundsException)
        //System.out.println("substring desde 5 hasta 1000: "+str.substring(5, 1000));
        //Tambien podemos devolve el substring hacia otra variable
        String str2 = str.substring(7,13);
        System.out.println("str2: "+str2);
        /*Leer un numero de cedula de Honduras, el programa
        unicamente debe validar que este numero tenga 13 caracteres.
        * el programa deberá eliminar los espacios de relleno, güiones,
          güiones bajos, espacios en blanco de la cadena.
        
        *Luego de leer la cedula mostrar la informacion siguiente:
        1) numero de departamento
        2) numero de municipio
        3) año de asentamiento
        4) correlativo en que fue asentado
        
        ejemplo:
        Digitar cedula: 1401-1982-01055
        Resultado:
        Departamento: 14
        Municipio: 01
        Año de asentamiento: 1982
        Correlativo: 01055*/
        Scanner qwe = new Scanner(System.in);
        String dni;
        System.out.print("Digite el DNI: ");
        dni = qwe.nextLine();
        dni = dni.trim().replace(" ", "").replace("_", "").replace("-", "");
        if( dni.length() == 13 ){
            System.out.println("Departamento: "+dni.substring(0, 2));
            System.out.println("Municipio: "+dni.substring(2, 4));
            System.out.println("Año de asentamiento: "+dni.substring(4, 8));
            System.out.println("Correlativo: "+dni.substring(8, 13));
        }
        else
            System.out.println("DNI debe ser de 13 caracteres.");
    }    
}
