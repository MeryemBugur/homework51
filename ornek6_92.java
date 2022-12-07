import java.util.Scanner;

/*

*/

public class ornek6_92 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üst sınır giriniz: ");
        int x = input.nextInt();
        int sayac = 0;
        double sonuc;
        for (int i = 1; i <= x; i++) {
            double a = Math.pow(2, i); 
            double b = (Math.pow(2, (i + 1))) - 1;
            for (int j = 1; j <= b; j++) { 
                if (b % j == 0) {     
                    sayac++;
                }
            }
            if (sayac == 2) {
                sonuc = a * b;
                System.out.println("i = " + i + " iken çıkan sonuç ==  " + sonuc);
            }
            sayac = 0;
        }

    }
}