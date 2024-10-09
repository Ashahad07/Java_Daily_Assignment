import java.util.Scanner;

public class Program109 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Prime numbers between 1 and 100: ");
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i+ " ");
            }
        }
        sc.close();
    }
    static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
