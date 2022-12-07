import java.util.Scanner; 

/*
n.2^n+1 şeklinde yazılabilen sayılara ''cullen sayıları'' denir.
*/

public class ornek6_93 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Cullen sayısı için terim sayısı giriniz: ");
        int x = input.nextInt(); 
        double deger;
        System.out.println();
        for (int i = 1; i <= x; i++) {  
            deger = i * (Math.pow(2, i + 1)); 
            System.out.println(i + ". terim -->   " + deger);

        }
    }
}