
public class Program164 {
    public static void main(String[] args) {
        int counter = 10;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j <= 4 - i) {
                    System.out.print("\t");
                } else {
                    System.out.print((counter * (counter--)) + "\t");
                }
            }
            System.out.println();
        }
    }
}
