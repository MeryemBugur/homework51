import java.util.Scanner;

/*
Klavyeden girilen 1'den büyük tamsayının ''asal çarpanları''nı bulan program.
*/

public class ornek6_88 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int d;
        int sayac = 0; 
        do {  
            System.out.println("Lütfen asal çarpanlarını bulmak istediğiniz 1'den büyük bir sayı giriniz: ");
            d = input.nextInt();  
        } while (d <= 1);

        for (int i = 1; i <= d; i++) {  
            sayac = 0;
            for (int a = 1; a <= i; a++) {
                if (i % a == 0) { 
                    sayac++;

                }

            }
            if (sayac == 2 && d % i == 0) { 
                System.out.println(i);
                sayac = 0;
            }
        }
    }
}