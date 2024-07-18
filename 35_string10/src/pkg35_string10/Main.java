package pkg35_string10;
public class Main {
    public static void main(String[] args) {
        /*método indexOf: devuelve la posicion de la primer coincidencia
        encontrada para un String dentto de otro.
        -> Si se encuentra el String entonces devuelve un valor >= 0
           el cual indica la posicion en que fue encontrado.
        -> Si no se encuentra el String entonces devuelve -1
        -> indexOf no ignora masyuc./minusc.*/
        String str = "El carro es rojo con negro. El carro esta matriculado.";
        System.out.println("str: "+str);
        //el metodo indexOf devuelve un numero entero (int)
        System.out.println("Posiciones donde se encontro lo siguiente:");
        System.out.println("rojo: "+str.indexOf("rojo"));
        System.out.println("Rojo: "+str.indexOf("Rojo"));
        System.out.println("negro: "+str.indexOf("negro"));
        //primer coincidencia de carro (note que hay un segundo parametro)
        //ese segundo parametro es la posicion de inicio, en este caso desde el primer
        //caracter de str que es la posicion 0
        System.out.println("carro: "+str.indexOf("carro",0));
        //carro fue encontrado en la posicion 3, buscamos
        //la siguiente coincidencia a partir de la posicion 3
        //usamos otra version de indexOf que es sobrecargada
        //la cual admite dos parametros: el String a buscar y
        //la posicion desde la cual vamos a buscar.
        System.out.println("siguiente coincidencia de carro: "+str.indexOf("carro", 4));
        //note que puse 4 porque la ultima posicion para carro era 3
        //por lo tanto eomenzamos a buscar desde la ultima posicion +1
        //busquemos la siguiente coincidencia de carro:
        System.out.println("siguiente coincidencia de carro: "+str.indexOf("carro", 32));
        
        String colores = "rojo amarillo rojo verde azul ROJO Verde Azul azul rosa AMARIllo";
        /*hacer un programa en el que le preguntemos al usuario que color desea
        buscar en colores. El programa imprimirá cuántas veces fue encontrado
        dicho color ignorando mayusc./minusc. Ejemplo:
        color a buscar: rojo
        veces que se encontró: 3*/
    }
    
}
