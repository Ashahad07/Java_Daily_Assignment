import java.util.*;

class Program102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int len = sc.nextInt();
        int arr[] = new int[len];
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
        sc.close();
    }    
}
