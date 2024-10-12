import java.util.Scanner;

public class Program116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary number:");
        int binary = sc.nextInt();

        int decimal = 0;
        int base = 1;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * base;
            binary /= 10;
            base *= 2;
        }

        int octal = 0;
        base = 1;

        while (decimal > 0) {
            int lastDigit = decimal % 8;
            octal += lastDigit * base;
            decimal /= 8;
            base *= 10;
        }
        sc.close();
        System.out.println("Octal equivalent: " + octal);
    }
}
