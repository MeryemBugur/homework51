import java.util.Scanner;

import java.util.Random;

//Bilgisayarın ürettiği rastgele büyük harfin, en fazla 10 denemede tahmin edilme programı.

public class ornek6_73 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random(); 
        int x = random.nextInt(25) + 65; 
        int i = 1;
        int k ;
        char c = (char) x;              //sayıyı harfe dönüştür

        while (i <= 10) {              //deneme sırası
            System.out.println("Lütfen  büyük harf tahmininizi giriniz: ");
            String deneme = input.nextLine();
            char deneme1 = deneme.charAt(0);
            if (deneme1 == c) {              //kazandı mı?
                System.out.println(i + " Denemede doğru tahmin ettiniz !!!");
                break;              // kazandıysa döngüden çık
            } else {
                k=10-i;
                System.out.println("Tahmininiz yanlış  ve  "+ k +" hakkınız kaldı. Lütfen tekrar deneyin. ");
                i++; 
            }
        }
        if (i > 10) {              //kayıp mı etti?
            System.out.println();
            System.out.println("Deneme hakkınız kalmadığı için kaybettiniz.");
            System.out.println("Doğru cevap = "+c);
        }

    }

}