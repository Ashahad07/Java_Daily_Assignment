import java.util.Scanner;

public class Program83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 3; i >= 0; i--) {
            for (int j = i; j < 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
