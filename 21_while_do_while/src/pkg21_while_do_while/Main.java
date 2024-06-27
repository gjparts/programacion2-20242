package pkg21_while_do_while;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*4) 	Hacer un programa que lea N cantidad de edades de personas.
        -> el programa terminará cuando la edad digitada por el usuario sea
           menor que cero.
        -> al terminar el programa mostrar cuantas edades se leyeron por cada
           grupo de edad segun la tabla siguiente:
           GRUPO DE EDAD	DESCRIPCION
           Menores de edad	De 0 a menos de 18 años
           Mayores de edad	De 18 a menos de 21 años
           Adultos		De 21 a menos de 60 años
           Tercera edad         De 60 en delante
        por votacion de los estudiante los resolvere por while*/
        Scanner qwe = new Scanner(System.in);
        int edad = 0; //variable temporal y de control
        int menores = 0, mayores = 0, adultos = 0, terceraedad = 0; //acumuladores
        
        while( edad >= 0 ){
            System.out.print("Digitar edad: ");
            edad = qwe.nextInt();
            //clasificar la informacion
            if( edad >= 0 && edad < 18 ) menores++;
            if( edad >= 18 && edad < 21 ) mayores++;
            if( edad >= 21 && edad < 60 ) adultos++;
            if( edad >= 60 ) terceraedad++;
        }
        //resultados:
        System.out.println("Menores de edad: "+menores);
        System.out.println("Mayores de edad: "+mayores);
        System.out.println("Adultos: "+adultos);
        System.out.println("Tercera edad: "+terceraedad);
    }
    
}
