import java.util.Scanner;

public class Program143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
