import java.util.Scanner; 

/*
''Mükemmel sayı'' Klavyeden girilen bir tamsayının mükemmel sayı olup olmadığını test eden program.
*/

public class ornek6_91 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen test etmek istediğiniz sayıyı giriniz: ");
        int x = input.nextInt(); 
        int toplam = 0;    
        for (int i = 1; i < x ; i++) {
            if (x % i == 0) {
                toplam = toplam + i;
            }

        }
        if (toplam == x) {   
            System.out.println("Girdiğiniz sayı mükemmel sayıdır.");   

        } else {
            System.out.println("Girdiğiniz sayı mükemmel sayı değildir. ");  
        }
    }
}