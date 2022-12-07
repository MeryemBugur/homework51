import java.util.Scanner; 

public class ornek6_107 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen basamak sayısındaki palindrom miktarını bulmak istediğiniz basamağı giriniz: ");
        int x = input.nextInt(); 
        double toplam = 9 * (Math.pow(10, ((x - 1) / 2))); 

        System.out.println("Polindrom sayısı = " + toplam);
    }

}
