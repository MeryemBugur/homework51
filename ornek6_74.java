import java.util.Scanner;

/**
Klavyeden girilen x değeri için, yine klavyeden girilen terim sayısı (n) kadar seriye açarak e üzeri x'i hesaplayan program.
e üssü x = 1 + x/1! + x^2/2! + x^3/3! + ...
n toplam k = 0: x^k/k!
 */

public class ornek6_74 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen x değeri giriniz");
        int x = input.nextInt();
        System.out.println("Lütfen terim sayısı giriniz");
        int n = input.nextInt();
        int ex = 1;
        int p = 1;
        int t = 1;
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) {
                t = x * t;
            }
            for (int d = i; d > 0; d--) {
                p = p * d;
            }

            ex = ex + (t / p);
            t = 1;
            p = 1;

        }
        System.out.println("Sonuç =  " + ex);

    }

}