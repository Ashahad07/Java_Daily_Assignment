import java.util.*;

class Program57{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number 1 and number 2");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int cube = ((num1*num1*num1) + (num2*num2*num2));
		System.out.println("Addition is " + cube);
		
		int square = ((num1*num1) - (num2*num2));
		System.out.println("Subtraction is " + square);
		
	}

}