import java.util.Scanner; 

public class ornek6_99 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;        
        int y;
        do {
            System.out.println("Lütfen Bağdaşık sayı olduğuna bakmak istediğiniz iki basamaklı iki sayı giriniz: ");
            System.out.println("Lütfen ilk sayıyı giriniz: ");
            x = input.nextInt();          
            System.out.println("Lütfen ikinci sayıyı giriniz: ");
            y = input.nextInt(); 
        } while (x < 10 || x > 99 || y < 10 || y > 99);
        double b1 = x % 10;
        double b2 = y % 10;
        double bt = b1 + b2;
        double o1 = x / 10;
        double o2 = y / 10;
        if (bt == 10 && o1 == o2) {  
            System.out.println("Girdiğiniz sayılar bağdaşık sayılardır. ");

        } 
        else {
            System.out.println("Girdiğiniz sayılar bağdaşık sayılar değildir. ");
        }

    }
}