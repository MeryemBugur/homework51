import java.util.Scanner;

/**
İki asal sayı arasındaki fark 2 ise bunçlara ''ikiz asallar'' denir---------
 */

public class ornek6_90 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen asal sayı tespiti için üst sınır girişi yapınız: ");
        int s = input.nextInt(); 
        int sayac = 0;  
        int sayac1 = 0;
        int b;
        int c;
        for (int i = 1; i <= s; i++) { 
            b = i; 
            c = i - 2;
            for (int j = 1; j <= b; j++) {     //sayı asal mı
                if (b % j == 0) {
                    sayac++;
                }
            }
            for (int k = 1; k <= c; k++) {       //sayı asal mı değil mi
                if (c % k == 0) {
                    sayac1++;
                }
            }
            if (sayac == 2 && sayac1 == 2) {        //ikiside asalsa yazdır
                System.out.print(c);
                System.out.print(" - ");
                System.out.print(b);
                System.out.println();

            }
            sayac = 0;        //sayaçları sıfırla
            sayac1 = 0;
        }

    }
}
