package beecrowd;
import java.util.Scanner;
public class pblm1011 {
public static void main(String[] args) {
     Scanner S=new Scanner(System.in);
     double R=S.nextDouble();
     double Z=4/3.0*3.14159*R*R*R;
     System.out.println("VOLUME = "+String.format("%.3f",Z));
    
    }
}
