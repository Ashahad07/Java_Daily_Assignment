import java.util.*;

public class Program110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        int decimal = binaryToDecimal(binaryString);

        System.out.println("Decimal Number: " + decimal);

        scanner.close();
    }

    static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal = decimal + base;
            }
            base *= 2;
        }
        return decimal;
    }

}