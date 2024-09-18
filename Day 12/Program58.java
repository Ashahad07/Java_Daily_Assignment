import java.util.*;

class Program58 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number 1 and number 2");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char op = sc.next().charAt(0);

		switch (op) {
			case '+':
				System.out.println("Addition of " + (num1 + num2));
				break;
			case '-':
				System.out.println("Subtraction of" + (num1 - num2));
				break;
			case '*':
				System.out.println("Multiplication of" + (num1 * num2));
				break;
			case '/':
				System.out.println("Division of" + (num1 / num2));
				break;

			default:
				System.out.println("Invalid operation sign. Please use +, -, *, or /.");
				break;
		}

	}

}