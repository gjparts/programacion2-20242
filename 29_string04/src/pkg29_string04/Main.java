package pkg29_string04;
public class Main {
    public static void main(String[] args) {
        // Conversiones
        //convertir de String a int
        String str1 = "100";
        int entero1 = Integer.parseInt(str1);
        System.out.println("str1: "+str1);
        System.out.println("entero1: "+entero1);
        
        //convertir de String a float
        String str2 = "2.3567829";
        float f1 = Float.parseFloat(str2);
        System.out.println("str2: "+str2);
        System.out.println("f1: "+f1);
        
        //convertir de String a double
        String str3 = "3.53453654564569";
        double d1 = Double.parseDouble(str3);
        System.out.println("str3: "+str3);
        System.out.println("d1: "+d1);
        
        //desde cualquier numero primitivo a String
        int entero2 = 345;
        float f2 = 8.89898989f;
        long l1 = 987987897987897L;
        double d2 = 4.654645756757;
        String str4 = String.valueOf(entero2);
        String str5 = String.valueOf(f2);
        String str6 = String.valueOf(l1);
        String str7 = String.valueOf(d2);
        System.out.println("str4: "+str4);
        System.out.println("str5: "+str5);
        System.out.println("str6: "+str6);
        System.out.println("str7: "+str7);
    }    
}
