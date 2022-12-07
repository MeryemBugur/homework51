import java.util.Scanner; 

/**
Uzun kenarları eşit ve bu kenarlardan birinin kısa kenara oranı; altın orana eşit olan ikizkenar üçgenlere ''altın üçgen'' denir.
Klavyeden kısa kenarı girilen altın üçgenin tüm kenarlarını yazdıran program.
 */

public class ornek6_84 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen altın üçgen için kısa kenar giriniz: ");
        double a = input.nextInt();
        double b = ((a * (1 + Math.pow(5, 0.5)))) / 2;

        System.out.println("Girdiğiniz değere göre kenarlar ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(b);
    }
}