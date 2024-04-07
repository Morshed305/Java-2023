package Class;

import java.util.Scanner;

public class Array_loop_Show_All_Value {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] Array =new int[8];
        
        for(int i = 0; i < Array.length; i++){
            Array[i]=S.nextInt();
        }

        System.out.print("Output = ");
        
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]);
            System.out.println("");
        }

    }
}
