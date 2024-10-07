import java.util.*;

class Program98 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            if (i % 2 != 1) {
                System.out.print(i + " ");
            }
        }
        sc.close();
   } 
}
