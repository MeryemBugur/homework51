import java.util.Scanner;

/**
e üzeri x değeri e^x = Lim(1 + x/n)^n ''Binom açılımı'' kullanılarak hesaplanabilmektedir.
Buna göre; klavyeden girilen x ve n değerlerine göre e^x'i hesaplayan program.
 */

public class ornek6_75 {

    public static void main(String[] args) {
        
        /*
        double x,n,sonuc;
        Scanner input = new Scanner (System.in);
        System.out.printf("exp(x) = lim(1+x/n)^n\n\n");
        System.out.print("x: ");
        x = input.nextInt();
        System.out.print("n: ");
        n = input.nextInt();
        sonuc = Math.pow(1+x/n, n);
        System.out.printf("\nexp(%f)=%f\n", x, sonuc);
        */
        
        Scanner input = new Scanner (System.in);
        double x, n, sonuc;
        System.out.print("Hesaplanacak x değerini giriniz: ");
        x = input.nextDouble();
        System.out.print("Hesaplanacak n değerini giriniz: ");
        n = input.nextDouble();
        sonuc = Math.pow( 1+x/n , n);
        System.out.println("e üzeri x = " + sonuc);
        
    }
    
}
