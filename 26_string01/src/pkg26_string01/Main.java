package pkg26_string01;
public class Main {
    public static void main(String[] args) {
        /*String (cadena de texto)
        Es una coleccion de char
        -> En JAVA es una clase para poder crear objetos
        -> no es necesario importar ninguna libreria, String
           forma parte de java.lang*/
        //ejemplos de declaracion de String
        String str1;
        String str2 = "Hola UNAH";
        String str4 = "abc", str5 = "xyz", str6;
        //si una variable String no la inicializa no la puede consultar
        //System.out.println(str1);
        //pero si se puede escribir:
        str1 = "Gerardo";
        System.out.println(str1); //ahora ya se puede imprimir
        
        //Concatenar String
        String a = "Ingenieria";
        String b = "Sistemas";
        String c = a+b;
        System.out.println(c);
        String d = a+" en "+b;
        System.out.println(d);
        int x = 5,y = 8;
        //String e = (x+y); //no se puede colocar valores no compatibles directamente al String
        //pero si se coloca un String antes, si es posible:
        String e = ""+(x+y);
        System.out.println(e);
        
        //tamaño de un String
        String fruta1 = "Manzana";
        System.out.println("cantidad de caracteres en fruta1: "+fruta1.length());
        int cantidad1 = fruta1.length();
        System.out.println("cantidad1: "+cantidad1);
        
        //recorrer el String y extraer cada char del mismo
        //observe que los caracteres dentro del String se numeran
        //de 0 a lenght-1 (zero indexing)
        for( int i = 0; i < fruta1.length(); i++ ){
            System.out.println( fruta1.charAt(i) );
        }
        System.out.println("*************************");
        //otros ejemplos
        String fruta2 = "Sandia";
        //primer y ultimo caracter de fruta2:
        System.out.println("Primer char de fruta2: "+fruta2.charAt(0));
        System.out.println("Ultimo char de fruta2: "+fruta2.charAt( fruta2.length()-1 ));
        
        
    }
    
}
