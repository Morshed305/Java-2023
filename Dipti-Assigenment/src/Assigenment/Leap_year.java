package Assigenment;

import java.util.Scanner;

public class Leap_year {

    public static void main(String[] args) {

//           */Wrong*/
//        Scanner S =new Scanner(System.in);
//    int user=S.nextInt();
//   int Div4=user%4;
//   int Div100=user%100;
//   int Div400=user%400;
//   
//    if (Div4==0){
//        if(Div100==0){
//            if( Div400==0){
//                System.out.println("It is a leap year");
//            }
//        }
//    }
//    
//    
//    if(Div4==0 && Div100!=0 ){
//        System.out.println("It is a leap year");
//    }
//    
//    
//    else if(Div100!=0){
//        System.out.println("It is not leap year");
//    }
//     
//  }
//Scanner scan = new Scanner(System.in);
//int checkYear = scan.nextInt();
//if(checkYear % 4 == 0 && checkYear % 100 != 0){
//System.out.println(checkYear + " is a leap year" );
//} else if(checkYear % 100 == 0 && checkYear % 400 == 0) {
//System.out.println(checkYear + " is a leap year");
//} else {
//System.out.println(checkYear + " is not a leap year" );
//}
        Scanner S = new Scanner(System.in);
        int user = S.nextInt();
        if (user % 4 == 0 && user % 100 != 0 || user % 400 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}

