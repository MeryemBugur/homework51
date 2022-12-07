public class ornek6_112 {

    public static void main(String[] args) {
        
        for (int i = 10; i <= 99; i++) { 
            int a = i % 10;
            int b = i / 10;     
            int t = a + b;
            if (t == 1 || t == 2 || t == 3 || t == 5 || t == 8 || t == 13) {   
                System.out.println(i);     

            }

        }

    }

}