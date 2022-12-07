import java.util.Scanner;     

public class ornek6_115 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Tribonacci sayıları için terim sayısı giriniz: ");
        int x = input.nextInt();  
        System.out.println();
        double k4;
        double k3 = 2;
        double k1 = 1; 
        double k2 = 1;
        System.out.print(k1 + " , ");
        System.out.print(k2 + " , ");
        System.out.print(k3 + " , ");
        for (int i = 1; i <= x - 3; i++) {       
            k4 = k1 + k2 + k3;
            System.out.print(k4 + ", ");  
            k1 = k2;
            k2 = k3;
            k3=k4;
        }
    }
}