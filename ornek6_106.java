public class ornek6_106 {

    public static void main(String[] args) {

        for (int a = 100; a <= 9999; a++) {  

            int b = a;
            int c = 1; 
            double t = 0;
            while (b >= 10) {
                c++;   
                b = b / 10;
            }
            int e = c - 1;
            b = a;
            while (e >= 0) {
                t = Math.pow(10, e) * (b % 10) + t;
                b = b / 10;
                e--;
            }
            if (t == a) {  
                int g = (int)t;
                System.out.println(g);  

            }

        }

    }

}