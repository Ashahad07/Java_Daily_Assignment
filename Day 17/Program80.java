import java.util.Scanner;

class Program80{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 10; i > 0; i--) {
            System.out.println( num +" X " + i +" = " + (num*i) );
        }
    }
}