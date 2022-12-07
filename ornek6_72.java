import java.util.Scanner;

/**
Bilgisayarın ürettiği 1-99 arası bir tamsayının tahmin edilme oyunu (sayı bulma oyunu) programı.
 */

public class ornek6_72 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int bs,tahmin,s=0;
        bs = (int) (Math.random()*98) + 1;
        do {
            System.out.print("Tahminimiz: ");
            tahmin = input.nextInt();
            s++;
            if (tahmin>bs) {
                System.out.print("Daha küçük sayı giriniz. ");
            }
            if (tahmin<bs) {
                System.out.print("Daha büyük sayı giriniz. ");
            }
            System.out.println(" ");
        } while (tahmin != bs);
        System.out.println(s + " tahminde buldunuz. ");
        
    }
    
}
