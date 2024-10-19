import java.util.*;

public class Program132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal number : ");
        int decNum = sc.nextInt();
        int octNum = 0;
        int i = 1;
        while (decNum != 0) {
            int rem = decNum % 8;
            octNum = octNum + rem * i;
            i *= 10;
            decNum /= 8;
        }
        System.out.println("Octal number : " + octNum);
        sc.close();
    }
}
