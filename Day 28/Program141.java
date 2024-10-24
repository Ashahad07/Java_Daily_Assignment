import java.util.Scanner;

public class Program141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;

            }
        }
        if (sum < num) {
            System.out.println( num + " Number is Deficient number, since "+ sum +" is less than "+ num);
        }else{
            System.out.println( num + " Number is Not Deficient number, since "+ sum +" is greater than "+ num);
        }
        sc.close();
    }
}
