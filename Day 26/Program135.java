import java.util.Scanner;

public class Program135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse printed Array");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}
