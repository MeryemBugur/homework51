import java.util.Scanner; 

/*
(m,n) ''dost sayılar''
*/

public class ornek6_97 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen  Dost sayı olduğuna bakmak istediğiniz iki sayıyı giriniz: ");
        System.out.println("Lütfen ilk sayıyı giriniz: ");
        int x = input.nextInt(); 
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int y = input.nextInt(); 
        int toplam1 = 0;  
        int toplam2 = 0;
        for (int i = 1; i < x; i++) { 
            if (x % i == 0) {    
                toplam1 = toplam1 + i;
            }
        }
        for (int b = 1; b < y; b++) {                 
            if (x % b == 0) {                
                toplam2 = toplam2 + b;
            }
        }
        System.out.println();
        if (toplam1 == y && toplam2 == x) {             
            System.out.println("Girdiğiniz sayılar dost sayılardır. ");   

        } else {
            System.out.println("Girdiğiniz sayılar dost sayılar değildir. ");   
        }
    }
}