import java.util.Scanner; 

/*
Klavyeden girilen doğru parçasını, ''gümüş oran''a uygun bölerek yazdıran program.
*/

public class ornek6_85 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen doğru parçası giriniz: ");
        double d = input.nextInt();
        double b = d / (2 + Math.pow(2, 5));
        double a = d - b;
        System.out.println("Girilen doğru parçası ve sonuç = " + a);
        System.out.println(" == " + b);
    }

}