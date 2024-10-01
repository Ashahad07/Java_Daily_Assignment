import java.util.Scanner;

class Program76{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();
	int fact = 1;
	for (int i = start; i <= end; i++) {
		fact = fact * i;
        	System.out.println("Factorial of " + i + " = " + fact);
        }
    }
}
