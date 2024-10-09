import java.util.*;

public class Program114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len = sc.nextInt();
        System.out.println("Enter the elements");
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search in array");
        int search = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (isPresent(arr, search)) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        }
        sc.close();
    }

    static boolean isPresent(int arr[], int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return true;
               
            } 
        }
        return false;
    }
}
