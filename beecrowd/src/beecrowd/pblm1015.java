package beecrowd;
import java.util.Scanner;
public class pblm1015 {
   public static void main(String[] args){
   Scanner S=new Scanner(System.in);
   double A1=S.nextDouble();
   double B1=S.nextDouble();
   double A2=S.nextDouble();
   double B2=S.nextDouble();
   double X=((A2-A1)*(A2-A1));
   double Y=((B2-B1)*(B2-B1));
   double R=Math.sqrt(X+Y);
   
   System.out.println(String.format("%.4f",R));
   
//   
//   1.0 7.0
//5.0 9.0
//
//4.4721
//
//-2.5 0.4
//12.1 7.3
//
//16.1484
//
//2.5 -0.4
//-12.2 7.0
//
//16.4575
   
   
   
   
   } 
}