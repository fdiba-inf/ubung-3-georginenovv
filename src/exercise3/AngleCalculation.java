package exercise3;
import java.util.Scanner;
public class AngleCalculation{
 public static void main (String[]args) {
  Scanner input = new Scanner (System.in);
   double d = input.nextDouble();
   double r= input.nextDouble();
   do {  r = d * Math.PI  / 180.0 ;
    System.out.println ("RadiantCalculation is" + r); 
   } while (r>0) ;
    {
      d= input.nextDouble();
      r= input.nextDouble();
   }
  }
}