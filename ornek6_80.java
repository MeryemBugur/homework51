import java.util.Scanner;

/**
 Klavyeden girilen bölüm sayısına göre √2 değerini hesaplayan program.
 */

public class ornek6_80 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen  √2 icin bölüm sayısı olarak n giriniz: ");
        double x = input.nextInt(); 
        double a = 1;
        for (double i = 1; i <= x; i++) {
            a = 2 + 1 / a;  
        }
        a = 1 + 1 / a;
        System.out.println("Girdiğiniz değere göre sonuç = " + a);
    }

}