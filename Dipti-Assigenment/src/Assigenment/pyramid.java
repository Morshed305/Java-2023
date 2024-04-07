package Assigenment;

import java.util.Scanner;

public class pyramid {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        int UserValue = S.nextInt();

        System.out.println();
        for (int i = UserValue; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = UserValue; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= UserValue; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }



    }
}
