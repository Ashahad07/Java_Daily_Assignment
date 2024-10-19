import java.util.Scanner;

public class Program130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input :");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % 2 == 0) {
                sum += i;
            }
        }
        if (sum > n) {
            System.out.println("Sum of perfect divisors is " + sum + " which is greater than " + n + " is abundant number");
        } else {
            System.out.println("Sum of perfect divisors is " + sum + " which is smaller than " + n + " is not abundant number");
        }
        sc.close();
    }
}
