/*
Her iki basamağıda asal sayı olan iki basamaklı pozitif tamsayıları listeleyen program.
*/


public class ornek6_87 {

    public static void main(String[] args) {
        
        int d = 9;
        while (d <= 99) {
            int a = d % 10;   
            int x = d;
            x = x / 10;
            if ((a == 2 || a == 3 || a == 5 || a == 7) && (x == 2 || x == 3 || x == 5 || x == 7)) { 
                System.out.println(d); 
            }
            d++;
        }

    }
}