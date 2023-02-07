public class Mittelwert {

    public static void main(String[] args) {
 

       double x = 6.0;
       double y = 9.0;
       //double m;
       
       //m = berechneMittelwert(x, y);
       System.out.printf("Der Mittelwert von %.2f und %.2f ist %.2f\n", x, y,berechneMittelwert(x, y));
    }
       
       public static double berechneMittelwert(double x,double y){
         double z;
         
         z = (x + y) / 2.0;
       


         return z;
      }
       
       
       
   
       
    }
 