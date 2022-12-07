import java.util.Scanner;

/**
''Madhava of Sangamagrama'' Klavyeden girilen terim sayısı için π değerini hesaplayıp yazdıran program.
π = √12( 1 - 1/3*3 + 1/5*3^2 - 1/7*3^3 + ...
 */

public class ornek6_77 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen π'yi hesaplamak  için  terim sayısı giriniz: ");
        double x = input.nextInt(); 
        double payda = 1;
        double toplam = 0;
        double deger = 3;
        double a = 0;
        double b = 3;
        for (double i = 0; i < x; i++) { 
            for (double j = 0; j < i; j++) {
                payda = j;
                b = b + 2;
                for (int k = 0; k < i; k++) {
                    payda = payda * 3;
                }
                
            }
            if (i % 2 == 0) { 
                a = a + (1 / payda);
            } else {
                a = a - (1 / payda);
            }
        }
        toplam = Math.pow(12, 1 / 2) * (1 - a);
        System.out.println("Hesapladığınız π'nin değeri =  " + toplam);

    }
}