import java.util.Scanner;   

public class ornek6_117 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Pell sayıları için terim sayısı giriniz: ");
        int x = input.nextInt();   
        System.out.println();
        double k3;
        double k1 = 0; 
        double k2 = 1;
        System.out.print(k1 + " , ");
        System.out.print(k2 + " , ");
        
        for (int i = 1; i <= x-2 ; i++) {        
            k3 = (2*k2)+k1;
            System.out.print(k3 + ", ");   
            k1 = k2;
            k2 = k3;
            
        }
    }
}