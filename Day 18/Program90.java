import java.util.Scanner;

public class Program90 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Even Numbers");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] +",");
                
            }
        }
        System.out.println();
        System.out.println("Odd Numbers");
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print(arr[i] +",");
            }

        }
    }
}
