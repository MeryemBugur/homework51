import java.util.Scanner;

/**
pi sayısı pi/2= 4/3 x 16/15 x 36/35 x ... şeklindeki '' John Wallis'' ardışık çarpımıyla hesaplanabilmektedir.
Buna göre klavyeden girilen terim sayısı kadar çarpım yaparak pi sayısını hesaplayan ve ekranda gösteren program.
 */
public class ornek6_78 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        double n,c=1,c1;
        System.out.print("Lütfen terim sayısını giriniz: ");
        n = input.nextDouble();
        for (int i = 1; i <= n; i++) {
            c1 = 4*i*i;
            c = c*c1/(c1-1);
        }
        System.out.println(2*c);
    }
    
}
