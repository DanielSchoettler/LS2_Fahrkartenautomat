public class Tabelle {
    public static void main(String[] args){

        String F = "Fahrenheit";
        String C = "Celsius";
        
        double a = -28.8889;
        double b = -23.3333;
        double c = -17.7778;
        double d = -6.6667;
        double e = -1.1111;

        int eins = -20;
        int zwei = -10;
        int drei = 0;
        int vier = 20;
        int fünf = 30; 
        
        //char T = '-';
        
        
        System.out.printf("%-11s| %7s \n", F , C );
        System.out.print("--------------------- \n");
        System.out.printf("%+-11d| ", eins) ;
        System.out.printf(" %.2f \n", a);
        System.out.printf("%+-11d| ", zwei);
        System.out.printf(" %.2f \n", b);
        System.out.printf("%+-11d| ", drei);
        System.out.printf(" %.2f \n", c);
        System.out.printf("%+-11d|", vier);
        System.out.printf("   %.2f \n", d);
        System.out.printf("%+-11d|",fünf);
        System.out.printf("   %.2f \n", e);




    }
    
}
