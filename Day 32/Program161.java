import java.util.*;

public class Program161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = sc.nextInt();
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            boolean prime = isPrime(digit);
            if (prime) {
                System.out.print(digit + " ");
            }
            temp /= 10;
        }
        sc.close();
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
