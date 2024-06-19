package pkg13_for01;
public class Main {
    public static void main(String[] args) {
        //1) imprimir los numeros del 1 al 10 de uno en uno
        //10 iteraciones
        for(int i = 1; i <= 10; i++)
            System.out.println(i);
        
        //otra forma: 10 iteraciones (mas confuso)
        for(int i = 0; i < 10; i++)
            System.out.println(i+1);
        
        //2) imprimir los numeros del 0 al 50 de dos en dos
        //iteraciones: 26
        for(int i = 0; i < 51; i=i+2){
            System.out.println(i);
        }
        //iteraciones: 26
        for( int i = 0; i <= 50; i+=2 )
            System.out.println(i);
        //iteraciones: 51 (menos eficiente)
        for( int i = 0; i <= 50; i++ ){
            if( i%2 == 0 )
                System.out.println(i);
        }
        
        //3) imprimir los numeros del 0 al 50 de cinco en cinco 
        //iteraciones: 11
        for( int i = 0; i <= 50; i+=5 )
            System.out.println(i);
        //iteraciones: 51 (menos eficiente)
        for( int i = 0; i <= 50; i++ ){
            if( i%5 == 0 )
                System.out.println(i);
        }
        
        //4) recorrer los numeros del 1 al 50
        //pero solo imprimir los numeros impares.
        System.out.println("*****************");
        for( int i = 1; i <= 50; i++ )
            if( i%2 == 1 )
                System.out.println(i);
        
        /*5) imprimir los numeros del 1 al 100; colocar un asterisco
        a la derecha de aquellos numeros que son multiplo de 10*/
        //forma 1:
        System.out.println("*******************");
        for(int i = 1; i <= 100; i++)
            if( i%10 == 0 )
                System.out.println(i+"*");
            else
                System.out.println(i);
        
        //forma 2:
        System.out.println("*******************");
        //ojo aqui ya se vuelve necesario el uso de llaves
        for(int i = 1; i <= 100; i++){
            System.out.print(i);
            if( i%10 == 0 ) System.out.print("*");
            System.out.println();
        }
        /*6) imprimir los numeros del 10 al 1,
        de forma descendente de uno en uno*/
        System.out.println("*******************");
        for(int i = 10; i >= 1; i--)
            System.out.println(i);
        System.out.println("*******************");
        for(int i = 10; i >= 1; i-=1)
            System.out.println(i);
        System.out.println("*******************");
        for(int i = 10; i >= 1; i=i-1)
            System.out.println(i);
        /*7) imprimir los numeros del 10 al 0,
        de forma descendente de dos en dos*/
        System.out.println("*******************");
        for( int i = 10; i >= 0; i-=2 )
            System.out.println(i);
        /*8) imprimir los numeros del 100 al 0,
        de forma descendente de diez en diez*/
        System.out.println("*******************");
        for( int i = 100; i >= 0; i-=10 )
            System.out.println(i);
        //for tambien puede funcionar con tipos numericos diferentes
        //a enteros, por ejemplo:
        //imprimir los numeros de 0 a 5, de 0.25 en 0.25
        System.out.println("*******************");
        for( float i = 0; i <= 5; i+=0.25f )
            System.out.println(i);
        System.out.println("*******************");
        for( double i = 0; i <= 5; i+=0.25 )
            System.out.println(i);
    }    
}
