import java.util.Scanner;

public class Program160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp != 0) {
            int digit = temp % 10;
            if (digit == 1) {
                count++;
            }
            temp /= 10;
        }
        System.out.println("The number " + num + " Contains " + count + " Ones.");
        sc.close();
    }
}
