import java.util.Scanner;

public class ornek6_111 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fibonacci sayıları için terim sayısı giriniz: ");
        int x = input.nextInt();         
        System.out.println();
        if (x == 1) {
            System.out.print("0 ");

        }
        if (x == 2) { 
            System.out.print("0  ");
            System.out.print("  1  ");

        }
        if (x >= 3) {  
            System.out.print("0  ");
            System.out.print("  1  ");
            System.out.print("  1  ");

        }
        int a = 1;
        int b = 1;
        int i = 4;
        while (i <= x) {    
            a = a + b;
            System.out.print("  " + a + "  ");  
            i++;
            if (i > x) {
                break;
            }
            i++;
            b = a + b;
            System.out.print("  " + b + "  ");
        }

    }

}