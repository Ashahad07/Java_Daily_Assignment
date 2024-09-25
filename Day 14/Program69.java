import java.util.Scanner;

class Program69{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number 1");
        int num1 = sc.nextInt();

	System.out.println("Enter your number 2");
        int num2 = sc.nextInt();

		if(num1 < num2){
			System.out.println("The Maximum number amongst " + num1 + " & " + num2 + " is " + num2); 
		}
		else{
			System.out.println("The Maximum number amongst " + num1 +" & " + num2 + " is " + num1); 
		}
    }
}
