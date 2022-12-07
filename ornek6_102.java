import java.util.Scanner; 

public class ornek6_102 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen heterometrik sayı adeti giriniz: ");
        int x = input.nextInt();   
        int toplam = 0;     
        int a = 1;
        int b = 2;
        System.out.println();
        for (int i = 1; i <= x; i++) {    
            toplam = a * b;  
            System.out.println(i + ". sayı == " + toplam);   
            a = b;
            b = b + 1;

        }

    }
}