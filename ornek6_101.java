import java.util.Scanner;    

public class ornek6_101 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen tau sayısı olduğu test etmek istediğiniz sayıyı giriniz: ");
        int x = input.nextInt();
        int toplam = 0;   
        for (int i = 1; i <=x ; i++) {
            if (x % i == 0) {
                toplam++;
            }

        }
        if (x%toplam==0) {  
            System.out.println("Girdiğiniz sayı tau sayıdır. "); 

        } 
        else {
            System.out.println("Girdiğiniz sayı tau sayısı değildir. ");  
        }
    }
}
