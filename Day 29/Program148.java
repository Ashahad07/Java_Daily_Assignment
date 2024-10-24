import java.util.*;

public class Program148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();
        for (int i = num; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
