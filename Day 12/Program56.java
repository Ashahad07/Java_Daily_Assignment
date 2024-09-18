import java.util.*;

class Program56{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number 1 and number 2");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int mul = num1 * num2;
		System.out.println("Multiplication is " + mul);
		
		if(num1 < num2){
			System.out.println("Division is " + (num2 / num1));
		}
		else{
			System.out.println("Division is " + (num1 / num2));
		}
	}

}