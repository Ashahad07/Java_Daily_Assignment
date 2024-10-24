

public class Program149 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int count = 3;
            for (int j = 0; j < 4; j++) {
                if (j<3-i) {
                    System.out.print("   ");
                } else {
                    System.out.print(count * count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }    
}
