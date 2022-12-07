import java.util.Scanner;

/**
Ln(2)= 1/2 + 1/12 + 1/30 + 1/56 + ... şeklinde seriye açılarak yaklaşık olaark hesaplanabilmektedir.
Girilen terim sayısına göre seri açılımıyla Ln(2) değerini hesaplayıp yazdıran program.
(Paylar sürekli 1 ve paydalar ardışık sayıların çarpımı (2=1x2, 12=3x4, 30=5x6, ...) şeklinde ilerlemektedir.
 */

public class ornek6_71 {
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        double N,t=0;
        System.out.println("Lütfen terim sayısını giriniz: ");
        N = input.nextDouble();
        for (int i = 0; i <= N-1; i++) {
            t += (double) 1/((2*i+1)*(2*i+2));
        }
        System.out.println(t);
        
    
    }
    
}
