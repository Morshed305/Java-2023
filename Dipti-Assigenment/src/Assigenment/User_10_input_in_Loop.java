package Assigenment;

import java.util.Scanner;

public class User_10_input_in_Loop {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("");

        int i = 1;
        int j = 0;

        for (i = 1; i <= 10; i++) {
            int user = S.nextInt();
            j = j + user;
        }
        System.out.println("10 member's value = " + j);
    }
}
