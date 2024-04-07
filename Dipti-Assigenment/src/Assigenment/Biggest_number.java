package Assigenment;

import java.util.Scanner;

public class Biggest_number {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.println("Type For A ");
        int A = S.nextInt();
        System.out.println("Type For B ");
        int B = S.nextInt();
        System.out.println("Type For C ");
        int C = S.nextInt();
        System.out.println("Type For D ");
        int D = S.nextInt();
        System.out.println("Type For E ");
        int E = S.nextInt();

        if (A > B & A > C & A > D & A > E) {
            System.out.println("A = " + A);
        } else if (B > A & B > C & B > D & B > E) {
            System.out.println("B = " + B);
        } else if (C > A & C > B & C > D & C > E) {
            System.out.println("C = " + C);
        }

        if (D > A & D > B & D > C & D > E) {
            System.out.println("D = " + D);
        }

        if (E > A & E > B & E > C & E > D) {
            System.out.println("E = " + E);
        }
        else{
            System.out.println("Equal Values = "+A);
        }
    }
}
