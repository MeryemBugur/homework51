import java.util.Scanner;

/*
Klavyeden girilen pozitif tamsayının ''Chen asalı'' olup olmadığını test eden program.
*/

public class ornek6_89 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen asal sayı tespiti için sayı girişi yapınız: ");
        int s = input.nextInt();   
        int sayac = 0;  
        int sayac1 = 0;

        for (int a = 1; a <= s; a++) {
            if (s % a == 0) {  
                sayac++;
            }
        }
        for (int a = 1; a <= s + 2; a++) {
            if ((s + 2) % a == 0) {
                sayac1++; 
            }
        }

        if (sayac == 2 && sayac1 == 2) {
            System.out.println("Girilen sayı chen sayısıdır. "); 
            sayac = 0;

        } 
        else { 
            System.out.println("Girilen sayı chen sayısı değildir. ");
        }

    }
}