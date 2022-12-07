import java.util.Scanner;

/*
''Asal sayı'' Klavyeden girilen üst sınıra kadar olan sayıları listeleyen program.
*/

public class ornek6_86 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen asal sayı tespiti için üst sınır girişi yapınız: ");
        int s = input.nextInt(); 
        int sayac = 0;
        for (int i = 1; i <= s; i++) {
            sayac = 0; 
            for (int a = 1; a <= i; a++) { 
                if (i % a == 0) {
                    sayac++;

                }

            }
            if (sayac == 2) {
                System.out.println(i);
                sayac = 0;
            }

        }

    }
}
