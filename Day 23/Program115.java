import java.util.*;

public class Program115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Please Enter the Positive Number");
        }

        int fib = 0;
        int sum = 1;

        if (num >= 1) {
            System.out.print(fib + " ");
        }
        if (num >= 2) {
            System.out.print(sum + " ");
        }

        for (int i = 2; i < num; i++) {
            int next = fib + sum;
            System.out.print(next + " ");
            fib = sum;
            sum = next;

        }
        sc.close();
    }
}
