import java.util.Scanner;  

public class ornek6_100 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Eksik sayı olup olmadığını test etmek istediğiniz sayıyı girinz: ");
        int x = input.nextInt();  
        int toplam = 0;
        int sonuc = 0;
        for (int i = 1; i <= x ; i++) {
            if (x % i == 0) {
                toplam = toplam + i;
            }

        }
        if (toplam < 2*x) {         
            System.out.println("Girdiğiniz sayı eksik sayıdır.");  
            sonuc = (2*x)-toplam;
            System.out.println(sonuc);

        } else {
            System.out.println("Girdiğiniz sayı eksik sayı değildir.");  
        }
    }
}