package beecrowd;
import java.util.Scanner;

public class pblm1021 {
    public static void main(String []args){
    
//    Scanner S=new Scanner(System.in);
//    double N1=S.nextDouble();
//    double N=Math.abs(N1);
//    int  Hundred=((int )N/100);
//    double B=N%100;
//    int Fifty=(int) (B/50);
//    double  B1=B%50;
//    int  Twenty=(int) (B1/20);
//    double  B2=B1%20;
//    int Ten=(int) (B2/10);
//    double  B3=B2%10;
//    int Five=(int) (B3/5);
//    double  B4 =B3%5;
//    int  Two=(int) (B4/2);
//    double B5=B4%2;
//    int One= (int) (B5/1);
//    double  B6=B5%1;
//    int Poisa50 =(int) (B6/0.50);
//    double B7=B6%0.50;
//    int Poisa25=(int) (B7/0.25);
//    double B8=B7%0.25;
//    int Poisa10=(int) (B8/0.10);
//    double B9=B8%0.10;
//    int Poisa5=(int) (B9/0.05);
//    double B10=B9%0.05;
//    int Poisa1=(int) (B10/0.01);
//    
//    
//        System.out.println("NOTAS:");
//        System.out.println(Hundred +" nota(s) de R$ 100,00");
//        System.out.println(Fifty +" nota(s) de R$ 50,00");
//        System.out.println(Twenty +" nota(s) de R$ 20,00");
//        System. out.println(Ten +" nota(s) de R$ 10,00");
//        System.out.println(Five+" nota(s) de R$ 5,00");
//        System.out.println(Two +" nota(s) de R$ 2,00");
//        System.out.println("MOEDAS:");
//        System.out.println(One+" moeda(s) de R$ 1.00");
//        System.out.println(Poisa50+" moeda(s) de R$ 0.50");
//        System.out.println(Poisa25+" moeda(s) de R$ 0.25");
//        System.out.println(Poisa10+" moeda(s) de R$ 0.10");
//        System.out.println(Poisa5+" moeda(s) de R$ 0.05");
//        System.out.println(Poisa1+" moeda(s) de R$ 0.01");


//Scanner S=new Scanner(System.in);
//    double N1=S.nextDouble();
//    int N=(int) (N1*100);
//    int Hundred=((int )N/(100*100));
//    int B=N%(100*10);
//    int Fifty=(B/(50*100));
//    int B1=B%(50*100);
//    int Twenty=(B1/(20*100));
//    int B2=B1%(20*100);
//    int Ten=(B2/(10*100));
//    int B3=B2%(10*100);
//    int Five=(B3/(5*100));
//    int B4 =B3%(5*100);
//    int Two=(B4/(2*100));
//    int B5=B4%(2*100);
//     int One= (B5/(1*100));
//    int 
//            
//            B6=B5%(1*100);
//    double Poisa50 =(B6/(0.50*100));
//    double B7=(B6%(0.50*100));
//    double Poisa25=(B7/(0.25*100));
//    double B8=(B7%(0.25*100));
//    double Poisa10=(B8/(0.10*100));
//    double B9=(B8%(0.10*100));
//    double Poisa5=(B9/(0.05*100));
//    double B10=(B9%(0.05*100));
//    double Poisa1=(B10/(0.01*100));
//    
//    
//        System.out.println("NOTAS:");
//        System.out.println(Hundred +" nota(s) de R$ 100,00");
//        System.out.println(Fifty +" nota(s) de R$ 50,00");
//        System.out.println(Twenty +" nota(s) de R$ 20,00");
//        System. out.println(Ten +" nota(s) de R$ 10,00");
//        System.out.println(Five+" nota(s) de R$ 5,00");
//        System.out.println(Two +" nota(s) de R$ 2,00");
//        System.out.println("MOEDAS:");
//        System.out.println(One+" moeda(s) de R$ 1.00");
//        System.out.println(Poisa50+" moeda(s) de R$ 0.50");
//        System.out.println(Poisa25+" moeda(s) de R$ 0.25");
//        System.out.println(Poisa10+" moeda(s) de R$ 0.10");
//        System.out.println(Poisa5+" moeda(s) de R$ 0.05");
//        System.out.println(Poisa1+" moeda(s) de R$ 0.01");  


//    Scanner S=new Scanner(System.in);
//    double N1=S.nextDouble();
//    double N=Math.abs(N1);
//    int  Hundred=((int )N/100);
//    int B=(int) (N%100);
//    int Fifty=(int) (B/50);
//    int  B1=B%50;
//    int  Twenty=(int) (B1/20);
//    int  B2=B1%20;
//    int Ten=(int) (B2/10);
//    int  B3=B2%10;
//    int Five=(int) (B3/5);
//    int  B4 =B3%5;
//    int  Two=(int) (B4/2);
//    int B5=B4%2;
//    int One= (int) (B5/1);
//    double  B6=B5%1;
//    int Poisa50 =(int) (B6/0.50);
//    double B7=B6%0.50;
//    int Poisa25=(int) (B7/0.25);
//    double B8=B7%0.25;
//    int Poisa10=(int) (B8/0.10);
//    double B9=B8%0.10;
//    int Poisa5=(int) (B9/0.05);
//    double B10=B9%0.05;
//    int Poisa1=(int) (B10/0.01);
//    
//    
//        System.out.println("NOTAS:");
//        System.out.println(Hundred +" nota(s) de R$ 100.00");
//        System.out.println(Fifty +" nota(s) de R$ 50.00");
//        System.out.println(Twenty +" nota(s) de R$ 20.00");
//        System. out.println(Ten +" nota(s) de R$ 10.00");
//        System.out.println(Five+" nota(s) de R$ 5.00");
//        System.out.println(Two +" nota(s) de R$ 2.00");
//        System.out.println("MOEDAS:");
//        System.out.println(One+" moeda(s) de R$ 1.00");
//        System.out.println(Poisa50+" moeda(s) de R$ 0.50");
//        System.out.println(Poisa25+" moeda(s) de R$ 0.25");
//        System.out.println(Poisa10+" moeda(s) de R$ 0.10");
//        System.out.println(Poisa5+" moeda(s) de R$ 0.05");
//        System.out.println(Poisa1+" moeda(s) de R$ 0.01");



    Scanner S=new Scanner(System.in);
    double N=S.nextDouble();
    
    
    
    int N2 =(int) (N*100);
    int  Hundred=((int )(N2/(100*100)));
    double B=N2%(100*100);
    int Fifty=(int) (B/(50*100));
    double  B1=B%(50*100);
    int  Twenty=(int) (B1/(20*100));
    double  B2=B1%(20*100);
    int Ten=(int) (B2/(10*100));
    double  B3=B2%(10*100);
    int Five=(int) (B3/(5*100));
    double  B4 =B3%(5*100);
    int  Two=(int) (B4/(2*100));
    double B5=B4%(2*100);
    int One= (int) (B5/(1*100));
    double  B6=B5%(1*100);
    int Poisa50 =(int) (B6/(0.50*100));
    double B7=B6%(0.50*100);
    int Poisa25=(int) (B7/(0.25*100));
    double B8=B7%(0.25*100);
    int Poisa10=(int) (B8/(0.10*100));
    double B9=B8%(0.10*100);
    int Poisa5=(int) (B9/(0.05*100));
    double B10=B9%(0.05*100);
    int Poisa1=(int) (B10/(0.01*100));
    
    
        System.out.println("NOTAS:");
        System.out.println(Hundred +" nota(s) de R$ 100,00");
        System.out.println(Fifty +" nota(s) de R$ 50,00");
        System.out.println(Twenty +" nota(s) de R$ 20,00");
        System. out.println(Ten +" nota(s) de R$ 10,00");
        System.out.println(Five+" nota(s) de R$ 5,00");
        System.out.println(Two +" nota(s) de R$ 2,00");
        System.out.println("MOEDAS:");
        System.out.println(One+" moeda(s) de R$ 1.00");
        System.out.println(Poisa50+" moeda(s) de R$ 0.50");
        System.out.println(Poisa25+" moeda(s) de R$ 0.25");
        System.out.println(Poisa10+" moeda(s) de R$ 0.10");
        System.out.println(Poisa5+" moeda(s) de R$ 0.05");
        System.out.println(Poisa1+" moeda(s) de R$ 0.01");

      
               
    }
}
