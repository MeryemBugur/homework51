import java.util.Scanner;

/**
''Brothers formülü'' Klavyeden girilen terim sayısına göre e sayısını hesaplayan program.
sonsuz toplam k = 0:  2k+2 / (2k+1)!
*/

public class ornek6_76 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen e'yi hesaplamak  için  terim sayısı giriniz: ");
        double x = input.nextInt(); 
        double faktoriyel = 1;
        double toplam = 0; 
        for (double i = 0; i <= x; i++) {
            for (double j = (2 * i) + 1; j > 0; j--) {
                faktoriyel = faktoriyel * j;
            }
            toplam = toplam + ((2 * i) + 2) / faktoriyel;

        }
        System.out.println("Hesapladığınız e nin değeri =  " + toplam);

    }

}