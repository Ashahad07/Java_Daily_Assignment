import java.util.Scanner;

public class Program125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is Prime Number");
        }else{
            System.out.println(num + " Not Prime Number");
        }
        sc.close();

    }
    static boolean isPrime(int n){

        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
