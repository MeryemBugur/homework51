import java.util.Scanner;

/**
''Macluarin serisi'' Cos(x)= 1 - x^2/2! + x^4/4! - x^6/6! + ...
sonsuz toplam k = 0: (-1)^k*x^2k/(2k)!
 */

public class ornek6_69 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cos(x) için  x  giriniz: ");
        int x = input.nextInt();
        System.out.println("Lütfen cos(x) için  k giriniz: ");
        int k = input.nextInt(); 
        int faktoriyel = 1;
        double toplam = 0;

        for (int i = 0; i < k; i++) {
            for (int j = i * 2; j > 0; j--) {
                faktoriyel = faktoriyel * j;
            }
            toplam = toplam + (Math.pow(-1, i) * Math.pow(x, 2 * i)) / faktoriyel;
            faktoriyel = 1;
        }
        
        System.out.println(toplam); 

    }
}