import java.util.Scanner;

public class Program140 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input : ");
    int n = sc.nextInt();
    int temp = n;
    int count = 0;

    while (temp != 0) {
        temp = temp / 10;
        count ++;
    }
    System.out.println("The number "+ n +" has " + count + " digits.");
    sc.close();
    }
}
