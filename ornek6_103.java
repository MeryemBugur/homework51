import java.util.Scanner;      

public class ornek6_103 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen ore sayısı olduğunu test etmek istediğiniz sayıyı giriniz: ");
        int x = input.nextInt();  
        double sayac = 0; 
        double payda = 0;
        double toplam;
        int toplam2;
        for (int i = 1; i <= x; i++) {      
            if (x % i == 0) {
                payda = payda + Math.pow(i, -1);   
                sayac++;
            }

        }
        toplam = sayac / payda;
        toplam2 = (int) toplam;
        if (toplam2 == toplam) {
            System.out.println("Girdiğiniz sayı ore sayısıdır. ");     

        } else {
            System.out.println("Girdiğiniz sayı ore sayısı değildir. ");  
        }

    }
}