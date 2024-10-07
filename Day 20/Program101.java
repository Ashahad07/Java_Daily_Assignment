import java.util.*;

class Program101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the len of element");
        int len = sc.nextInt();
        int arr[] = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        sc.close();
    }    
}
