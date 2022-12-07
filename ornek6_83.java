import java.util.Scanner;

/**
Klavyeden girilen AB doğru parçası uzunluğunu, ''altın oran''a uygun bölerek AC ve CB uzunluklarını yazdıran program.
 */


public class ornek6_83 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen altın oran için ab doğru parçası giriniz: ");
        double ab = input.nextInt();
        double cb = 2 * (ab / (1 + (Math.pow(5, 0.5)))); 
        double ac = ab - cb;

        System.out.println("Girdiğiniz değere göre ac = " + ac); 
        System.out.println("cb = " + cb);
    }
}