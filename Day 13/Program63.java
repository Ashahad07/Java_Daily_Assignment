import java.util.Scanner;

class Program63{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int n = sc.nextInt();
	int fact=1;
        for (int i = 1; i <= n; i++) {
        	fact = fact * i;
        }
	System.out.print("The Factorial is: " + fact); 
    }
}