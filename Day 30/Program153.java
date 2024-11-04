import java.util.Scanner;

public class Program153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("The sum digits from numbers " + num + " is " + sum);
        sc.close();
    }
}
