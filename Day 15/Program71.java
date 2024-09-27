import java.util.Scanner;

class Program71{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number 1");
        int num1 = sc.nextInt();

	System.out.println("Enter your number 2");
        int num2 = sc.nextInt();

		if(num1 < num2){
			System.out.println("The Minimum number amongst " + num1 + " & " + num2 + " is " + num1); 
		}
		else{
			System.out.println("The Minimum number amongst " + num1 +" & " + num2 + " is " + num2); 
		}
    }
}
