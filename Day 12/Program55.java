import java.util.*;

class Program55{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number 1 and number 2");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.println("Addition is " + sum);
		
		if(num1 < num2){
			System.out.println("Subtraction is " + (num2 - num1));
		}
		else{
			System.out.println("Subtraction is " + (num1 - num2));
		}
	}

}