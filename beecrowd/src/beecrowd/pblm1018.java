
package beecrowd;
import java.util.Scanner;
public class pblm1018 {
    public static void main(String[] args ){
    Scanner S=new Scanner(System.in);
    int N=S.nextInt();
    int Hundred=N/100;
    int B=N%100;
    int Fifty=B/50;
    int B1=B%50;
    int Twenty=B1/20;
    int B2=B1%20;
    int Ten=B2/10;
    int B3=B2%10;
    int Five=B3/5;
    int B4 =B3%5;
    int Two=B4/2;
    int B5=B4%2;
    int One = B5/1;
        System.out.println(N);
        System.out.println(Hundred +" nota(s) de R$ 100,00");
        System.out.println(Fifty +" nota(s) de R$ 50,00");
        System.out.println(Twenty +" nota(s) de R$ 20,00");
        System.out.println(Ten +" nota(s) de R$ 10,00");
        System.out.println(Five+" nota(s) de R$ 5,00");
        System.out.println(Two +" nota(s) de R$ 2,00");
        System.out.println(One+" nota(s) de R$ 1,00");
   
    }
    
}
