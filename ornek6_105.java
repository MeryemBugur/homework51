import java.util.Scanner;  

public class ornek6_105 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen aritmetik sayı olduğu test etmek istediğiniz sayıyı giriniz: ");
        int x = input.nextInt();  
        double sayac = 0;  
        double toplam = 0;
        
        for (int i = 1; i <= x; i++) {      
            if (x % i == 0) {
                toplam = toplam + i;
                sayac++;
            }
            
 }
        double deger=toplam/sayac;
        int degerint = (int)deger;
        if (deger-degerint==0) {
            System.out.println("Girdiğiniz sayı aritmetik sayıdır. ");  

        } else {
            System.out.println("Girdiğiniz sayı aritmetik sayı değildir. ");   
        }

    }
}