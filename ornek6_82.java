import java.util.Scanner;

/**
 Klavyeden girilen bölüm sayısına göre √5 değerini hesaplayan program.
 */

public class ornek6_82 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen √5 icin bölüm sayısı olarak n giriniz: ");
        double x = input.nextInt(); 
        double a = 1;
        for (double i = 1; i <= x; i++) {
            a = 4 + 1 / a;
        }
        a = 2 + 1 / a;
        System.out.println("Girdiğiniz değere göre sonuç = " + a); 
    }
}
