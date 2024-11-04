import java.util.Scanner;

public class Program155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : ");
        int num = sc.nextInt();
        int temp = num;
        int odd = 0;
        int even = 0;
        while (temp != 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            temp /= 10;
        }
        System.out.println("The number " + num + " Contains " + odd + " Odd Digits & " + even + " Even Digits.");
        sc.close();
    }
}
