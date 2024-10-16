import java.util.Scanner;

class Program121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        int i = 0;

        while (n != 0) {
            int bit = n & 1;

            ans = (bit * Math.pow(10, i)) + ans;

            n = n >> 1;
            i++;
        }
        System.out.println("Binary Number:" + ans);
        sc.close();
    }
}
