package pkg34_string09;
public class Main {
    public static void main(String[] args) {
        /*Metodo contains
        Indica si un String ha sido encontrado dentro de otro Stirng
        -> no ignora masyusc./minusc.
        -> devuelve un valor booleano, true (1) o false (0).
        -> contains no altera nada, solo busca.*/
        String str = "Hay una ROCa junto a la vara a la Orilla del Mar";
        System.out.println("String original: "+str);
        System.out.println("str contiene la palabra piedra? "+str.contains("piedra"));
        System.out.println("str contiene la palabra roca? "+str.contains("roca"));
        System.out.println("str contiene la palabra ROCa? "+str.contains("ROCa"));
        System.out.println("str contiene la palabra MAR? "+str.contains("MAR"));
        System.out.println("contiene MAR ignorando mayus/minus? "+str.toUpperCase().contains("MAR"));
        System.out.println("contiene roca ignorando mayus/minus? "+str.toLowerCase().contains("roca"));
        System.out.println("String original: "+str);
        /*preguntar al usuario: ¿que desea buscar dentro de str?
        ignorando mayusculas/misnuculas
        si lo que el usuario desea buscar se encuentra entonces
        responder: "Texto encontrado"
        del lo contrario responder: "Texto no se encontró"*/
    }    
}
