import java.util.Scanner; 

public class ornek6_109 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen üçgensel sayı için terim sayısı giriniz: ");
        int x = input.nextInt();       
        double toplam = 0; 
        for (int i = 1; i <= x; i++) {        
            toplam = i * ((i + 1) / 2);
            System.out.print(toplam + " , ");   
        }
    }
}