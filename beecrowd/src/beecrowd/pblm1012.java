package beecrowd;
import java.util.Scanner;

public class pblm1012 {
public static void main(String[] args) {  
    Scanner S=new Scanner(System.in);
    double A=S.nextDouble();
    double B=S.nextDouble();
    double C=S.nextDouble();
    double Ans1=(0.5*A*C);
    double Ans2=(3.14159*C*C);
    double Ans3=(0.5*(A+B)*C);
    double Ans4=(B*B);
    double Ans5=(A*B);
    System.out.println("TRIANGULO: "+String.format("%.3f",Ans1));
    System.out.println("CIRCULO: "+String.format("%.3f",Ans2));
    System.out.println("TRAPEZIO: "+String.format("%.3f",Ans3));
    System.out.println("QUADRADO: "+String.format("%.3f",Ans4));
    System.out.println("RETANGULO: "+String.format("%.3f",Ans5));
  
}}
