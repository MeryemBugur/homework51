public class ornek6_104 {

    public static void main(String[] args) {

        double toplam = 0; 
        for (int x = 1; x <= 50; x++) { 
            for (int y = x; y <= 50; y++) {
                for (int z = y; z <= 50; z++) { 
                    if ((x * x) + (y * y) + (z * z) == 3 * x * y * z) {  
                        System.out.print(x + "," + y + "," + z);
                        System.out.println();
                    }

                }

            }

        }

    }

}