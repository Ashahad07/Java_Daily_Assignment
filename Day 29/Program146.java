
import java.util.Scanner;

public class Program146 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int count = 0;
        int number = 1;
        System.out.println("First " + num + " deficient numbers:");
        while (count < num) {
            if (isDeficient(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }

        sc.close();
    }

    static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }
}
