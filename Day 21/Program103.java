import java.util.*;

public class Program103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is Prime Number");
        }else{
            System.out.println(num + " is not prime number");
        }
        sc.close();
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    
}
