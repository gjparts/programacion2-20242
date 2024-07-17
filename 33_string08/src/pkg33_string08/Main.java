package pkg33_string08;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Metodo replace
        devuelve un String al cual se ha aplicado el reemplazo de un
        String por otro.
        -> replace no ignora mayusc./minusc.*/
        String str = "Roja es la Manzana, la manzana es roja";
        System.out.println("String original: "+str);
        //reemplazar roja por verde, sin alterar el String original
        //luego imprimimos el String con el reemplazo
        System.out.println( str.replace("roja", "verde") );
        System.out.println("String original: "+str);
        //reemplazar roja por verde; pero alterando al String original
        str = str.replace("roja", "verde");
        System.out.println("String original: "+str);
        
        String str2 = "La fresa es una fruta deliciosa, el jugo de fresa es mejor que el de noni.";
        //es posible desencadenar varios reemplazos
        //por ejemplo, quiero reemplazar fresa por melon, y noni por anona; pero
        //alterando al String original
        System.out.println("str2: "+str2);
        str2 = str2.replace("fresa", "melon").replace("noni", "anona").replace("La melon", "El melon");
        System.out.println("str2 alterado: "+str2);
        
        /*leer una cadena de texto, y reemplazar dentro de ella todos
        los espacios en blanco por guiones bajos
        alterando la cadena original, ejemplo:
        Digitar String: Gerardo Josue Portillo
        resultado: Gerardo_Josue_Portillo*/
        Scanner xyz = new Scanner(System.in);
        System.out.print("Digitar String:");
        
        //String nombre = xyz.nextLine().replace(" ", "_"); //esta es una forma corta de hacerlo
        
        //esta es una forma mas larga; pero mas entendible:
        String nombre = xyz.nextLine();
        nombre = nombre.replace(" ", "_");
        
        System.out.println("resultado: "+nombre);
        
        /*Leer un String y luego reemplazar todas las letras a por 4,
        todas las letras e por 3 y todas las letras i por 1 alterando
        el String original ignorando mayusc/minusc., sin modificar la capitalizacion de la cadena
        original luego imprimirla.
        Importante: resolverlo utilizando el metodo replace.
        ejemplo:
        Digitar String: ArlequiN
        Resultado: 4rl3qu1N*/
        System.out.print("Digitar String: ");
        String str3 = xyz.nextLine();
        str3 = str3.replace("a", "4").replace("A", "4").replace("e", "3").replace("E", "3").replace("i", "1").replace("I", "1");
        System.out.println("Resultado: "+str3);
    }    
}
