import java.util.Scanner; 

/*
4k+1 ''Hilbert sayıalrı''
*/

public class ornek6_96 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Hilbert sayısı kontrolü için değer giriniz: ");
        int x = input.nextInt();

        if ((x - 1) % 4 == 0) { 
            System.out.println("Hilbert sayısıdır. ");  

        } 
        else { 
            System.out.println("Hilbert sayısı değildir. ");
        }

    }
}