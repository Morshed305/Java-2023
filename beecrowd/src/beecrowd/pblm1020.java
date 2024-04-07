
package beecrowd;
import java.util.Scanner;
public class pblm1020 {
    public static void main(String[] args ){
    
     Scanner S=new Scanner(System.in); 
     
       int InputDayes=S.nextInt();
       
       
       int Years=InputDayes/365;
     
       int OutMonth =InputDayes%365;
       
       int Month=OutMonth/30;
       
       int Day=OutMonth%30;
       
 
        System.out.println(Years+" ano(s)");
    
        System.out.println(Month+" mes(es)");
        System.out.println(Day+" dia(s)");
    
    
    
    
    
    }
    
}
//400
//
//1 ano(s)
//1 mes(es)
//5 dia(s)
//
//800
//
//2 ano(s)
//2 mes(es)
//10 dia(s)
//
//30
//
//0 ano(s)
//1 mes(es)
//0 dia(s)