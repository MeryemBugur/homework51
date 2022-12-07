import java.util.Scanner;  

public class ornek6_119 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Floyd üçgeni için satır sayısı giriniz: ");
        int x = input.nextInt();                    
        int a = 1;
        for (int i = 1; i <=x; i++) {         
            for (int j = 1; j <=i; j++) {
                System.out.print(a+"  ");           
                a=a+1;
                
            } 
            System.out.println();       
        }
    }
}