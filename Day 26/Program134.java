
public class Program134 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int counter = 1;
            for (int j = 1; j <= 4; j++) {
                if (j <= 4 - i) {
                    System.out.print("  ");
                } else if (i + j == 5) {
                    System.out.print("= ");
                } else {
                    System.out.print(counter + " ");
                    counter++;
                }
            }
            System.out.println();
        }
    }
}
