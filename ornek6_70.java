import java.util.Scanner;

/**
''Macluarin serisi'' Sin(x)= x - x^3/3! + x^5/5! - x^7/7! + ...
sonsuz toplam k = 1: (-1)^(k-1)*x^(2k-1)/(2k-1)!
 */

public class ornek6_70 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sin(x) için  x  giriniz: ");
        int x = input.nextInt();
        System.out.println("Lütfen sin(x) için  k giriniz: ");
        int k = input.nextInt();
        int faktoriyel = 1;
        double toplam = 0;

        for (int i = 1; i <= k; i++) {
            for (int j = (i * 2) - 1; j > 0; j--) {
                faktoriyel = faktoriyel * j;
            }
            toplam = toplam + (Math.pow(-1, i - 1) * Math.pow(x, (2 * i) - 1)) / faktoriyel;
            faktoriyel = 1;
        }
        System.out.println(toplam); 
    }
}