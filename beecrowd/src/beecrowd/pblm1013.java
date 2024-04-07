package beecrowd;

import java.util.Scanner;
public class pblm1013 {
public static void main(String[] args){
Scanner S=new Scanner(System.in);

double a=S.nextDouble();
double b=S.nextDouble();
double c=S.nextDouble();
double x= Math.abs (a+b)/2;
double y= Math.abs (a-b)/2;
double a1=x+y;
double a2= Math.max(a1 , c);
System.out.println(String.format("%.0f",a2)+" eh o maior");

     
}  
}
