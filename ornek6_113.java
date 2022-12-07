import java.util.Scanner;  

public class ornek6_113 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen  fibonacci asalı için terim sayısı giriniz: ");
        int x = input.nextInt();   
        System.out.println();
        int girdi = 1;
        int a = 1;     
        int b = 1;

        int sayac = 0;
        int sayac2 = 0;
        while (girdi <= x) { 
            a = a + b;
            for (int h = 1; h <= a; h++) {
                if (a % h == 0) {     
                    sayac++;
                }
            }
            if (sayac == 2) {  
                System.out.println(a);
                girdi++;

            }
            sayac = 0;
            if (girdi > x) {   
                break;

            }

            b = a + b;
            for (int e = 1; e <= b; e++) {
                if (b % e == 0) {       
                    sayac2++;
                }

            }
            if (sayac2 == 2) {     
                System.out.println(b);
                girdi++;

            }
            sayac2 = 0;

        }

    }
}