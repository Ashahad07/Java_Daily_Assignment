import java.util.*;
public class Program111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Distance in feet");
        int distance = sc.nextInt();
        int toCM = distance*30;
        System.out.println("Equivalent distance for " + distance+"ft in cm is " + toCM + "cm");
        sc.close();
    }
}
