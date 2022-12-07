import java.util.Scanner; 

/*
2^2^n+1 ''fermat sayıları''
*/

public class ornek6_94 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Fermat sayısı için terim sayısı giriniz: ");
        int x = input.nextInt(); 
        double deger ;
        System.out.println();
        for (int i = 1; i <=x; i++) {
        deger=(Math.pow(2,Math.pow(2,i)))+1;
        System.out.println(i+". terim == "+deger); 
  
        }
    }
}