
package beecrowd;
import java.util.Scanner;

public class pblm1019 {
    public static void main(String[] args ){
      Scanner S=new Scanner(System.in);  
       int InputSecends=S.nextInt();
       int OutMinutes=InputSecends/60;
     
       int Hours=OutMinutes/60;
       
       int Minutes=OutMinutes%60;
       
       int Secends =InputSecends%60;
       
 
        System.out.println(Hours+":"+Minutes+":"+Secends);
        
    }
}
