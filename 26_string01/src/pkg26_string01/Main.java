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
        
        //obtener las veriones en mayusc./minusc. de un String
        String comida1 = "Baleada con Todo";
        //toUpperCase: este metodo devuelve una version en mayusculas
        //de un String sin afectar a la variable original
        System.out.println("comida1 en mayusculas: "+comida1.toUpperCase());
        System.out.println("comida1: "+comida1);
        //toLowerCase: este metodo devuelve una version en minusculas
        //de un String sin afectar a la variable original
        System.out.println("comida1 en mayusculas: "+comida1.toLowerCase());
        System.out.println("comida1: "+comida1);
        //afectar la variable original, o sea sobreescribir la variable
        //por ejemplo: cambiar comida1 a mayusculas
        comida1 = comida1.toUpperCase();
        //de ahora en adelante comida1 queda afectada
        System.out.println("comida1: "+comida1);
        
        //obtener una version del string sin relleno de espacios iniciales y finales
        //trim no afecta a la cadena original
        String nombre123 = "     JOSUE   ";
        System.out.println("nombre123: "+nombre123);
        System.out.println("longitud de nombre123: "+nombre123.length());
        //imprimir la version trim del String
        System.out.println("trim de nombre123: "+nombre123.trim());
        System.out.println("longitud de trim de nombre123: "+nombre123.trim().length()); 
        //sobreescribir la varible original a su version trim
        nombre123 = nombre123.trim();
        System.out.println("nombre123: "+nombre123);
        System.out.println("longitud de nombre123: "+nombre123.length());
        
        String verdura = "    chIlE dULcE             ";
        //imprimir la variable verdura sin espacios de relleno, todo en mayusculas
        //y sin alterar a la variable original; pero todo en una sola instruccion.
        System.out.println( verdura.trim().toUpperCase() );
        System.out.println( verdura.toUpperCase().trim() );
        
        //Concatenar elementos char a un String
        String carrera = "Ingenieria en Sistemas";
        //sin afectar a la var. original
        System.out.println( carrera+'x' );
        //afectar a la var. original
        carrera = carrera + 'q';
        System.out.println(carrera);
        //concatenar varios char a un string
        String nombre = "Gerardo";
        nombre = nombre + 'x' + 'y' + 'z';
        System.out.println(nombre);
        
        //concatenar una variable char a una var. String
        char punto = '.';
        String apellido = "Portillo";
        apellido += punto; //apellido = apellido + punto
        System.out.println(apellido);
        
        String ciudad = "San Pedro Sula en el departamento de Cortés";
        //generar una nueva variable String que sea una copia de la
        //variable ciudad; pero reemplazar cada espacio en blanco
        //por un asterisco, sin utilizar el metodo replace.
        //imprimir la nueva variable String
        String copia = "";
        //recorrer String de origen y evaluar char por char
        for( int i = 0; i < ciudad.length(); i++ ){
            if( ciudad.charAt(i) == ' ' )
                copia += '*';
            else
                copia += ciudad.charAt(i);
        }
        System.out.println("ciudad: "+ciudad);
        System.out.println("copia: "+copia);
        //otra forma de hacerlo (usando un operador ternario)
        String copia2 = "";
        for( int i = 0; i < ciudad.length(); i++ )
            copia2 += ( ciudad.charAt(i) == ' ' ? '*' : ciudad.charAt(i) );
        
        System.out.println("ciudad: "+ciudad);
        System.out.println("copia2: "+copia2);
    }
    
}
