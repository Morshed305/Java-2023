package Class;

//import java.util.Scanner;
import java.util.Scanner;

public class class_1 {

    public static void main(String[] args) {
//        Scanner S = new Scanner(System.in);
//        int[][] Array = new int[3][2];
////        int[] [] Array = {{2,3},{4,5},{6,7}};
//
//int row=3;
//int column=2;
//int t=0;
//        for (int i = 0; i <row; i++) {
//            for (int j = 0; j < column; j++) {
//                Array[i][j] = S.nextInt();
//            }
//        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//              t +=Array[i][j];
//                
//            }
//        }
//System.out.println(t);
//    }

//        Scanner S = new Scanner(System.in);
//        int X = S.nextInt();
//        double P = S.nextDouble();
//        int Y = S.nextInt();
//        double mult = Y * P;
//   
//        System.out.println("Total: R$ " + String.format("%.2f",mult));


Scanner S = new Scanner(System.in);
    	while (S.hasNext()) {
    		int u = S.nextInt();
    		int m= S.nextInt();
    		System.out.println(u ^ m);
        }

    }

}
