package beecrowd;

import java.util.Scanner;

public class pblm1037 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double user = S.nextDouble();

        if (user <= 0 && user >= 100) {
            System.out.println("Fora de intervalo");
        }
        else if (user <= 25) {
            System.out.println("Intervalo [0,25]");
        }
        else if(user<=50){
            System.out.println("Intervalo (25,50]");
        }
        else if (user<=75){
            System.out.println("Intervalo (50,75]");
        }
        else if(user<=100){
            System.out.println("Intervalo (75,100]");
        }

    }
}
