import java.util.*;
public class Program145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp!=0) {
            int digit = temp % 10;
            if (digit % 2 ==0) {
                count++;
            }
            temp = temp / 10; 
        }
        System.out.println("The number "+ num + " has "+ count + " Even digits");
        sc.close();
    }
}
