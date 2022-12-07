import java.util.Scanner; 

public class ornek6_110 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen  kare üçgensel sayı için terim sayısı giriniz: ");
        int x = input.nextInt(); 
        double k2 = 0; 
        double k0 = 0;
        double k1 = 1;
        System.out.print(k1 + " , ");
        for (int i = 1; i <= x - 1; i++) {     
            k2 = (34 * k1) - k0 + 2;
            System.out.print(k2 + ", "); 
            k0 = k1;
            k1 = k2;
        }
    }
}