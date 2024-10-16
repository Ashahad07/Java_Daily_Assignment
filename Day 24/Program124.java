import java.util.Scanner;

class Program124{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prev = 0;

        for (int i = 0; i < 5; i++) {
            int curr = sc.nextInt();
            if (i > 0 && curr < prev) {
                System.out.println("Loop is exited with input "+ curr +".");
                break;
            }
            prev = curr;
        }
        sc.close();
    }
}