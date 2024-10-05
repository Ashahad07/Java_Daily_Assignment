import java.util.*;
public class Program95 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int number = sc.nextInt();
        System.out.println("The Series of all perfect number from 1 to " + number );
        for (int i = 1; i < number; i++) {
            if (isPerfect(i)) {
                System.out.println(i + " ");
            }
        }
        
        
        
        sc.close();
    }
    public static boolean isPerfect(int num){
        int sum = 0;
        for (int i = 1 ; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
            
        }
        return sum == num;
    }
}
