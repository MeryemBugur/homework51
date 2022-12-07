import java.util.Scanner;

/**
 Klavyeden girilen bölüm sayısına göre √3 değerini hesaplayan program.
 */

public class ornek6_81 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen  √3 için bölüm sayısı olarak n giriniz: ");
        double x = input.nextInt();
        double a = 1;
        for (double i = 1; i <= x - 1; i++) {
            a = 1 + (1 / (2 + 1 / a));
        }
        a = 1 + 1 / a;
        System.out.println("Girdiğiniz değere göre sonuç = " + a);
    }
}