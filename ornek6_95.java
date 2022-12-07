import java.util.ArrayList;   
import java.util.Scanner;  

/*
x>1 ve y>1 tamsayıları için x^y + y^x şeklinde elde edilebilen sayılara ''Leyland sayıları'' denir.
*/

public class ornek6_95 {

    public static void main(String[] args) {
        
        ArrayList<Double> Leyland = new ArrayList<>();    //Arraylist oluşturduk
        Scanner input = new Scanner(System.in);
        int x;    
        int y;
        do {
            System.out.println("Lütfen Leyland sayıları için 2 tane sayı giriniz: ");
            System.out.println("Lütfen ilk sayıyı giriniz: ");
            x = input.nextInt();    
            System.out.println("Lütfen ikinci sayıyı giriniz: ");
            y = input.nextInt();           
        } while (x < 1 || y < 1);
        for (int t = 2; t <= x; t++) {              
            for (int j = 2; j <= y; j++) {            
                double deger = (Math.pow(t, j)) + (Math.pow(j, t));             
                 if (!Leyland.contains(deger)) {    
               
                Leyland.add(deger);        
            }
                            
            }
             

        }
        System.out.println(Leyland)    ;     

    }
}