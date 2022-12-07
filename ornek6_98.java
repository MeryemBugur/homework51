public class ornek6_98 { 

    public static void main(String[] args) {
        
        double toplam = 0;
        for (int i = 100; i <=999; i++) {                
            double a = Math.pow(i % 10, 3); 
            double b = Math.pow(((i / 10)% 10), 3);
            double c = Math.pow(i / 100, 3);               
            toplam = a + b + c;

            if (toplam == i) {             
                System.out.println("-->  " + toplam);          

            }

        }

    }

}