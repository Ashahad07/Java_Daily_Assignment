import java.util.Scanner;

class Program74{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number 1");
        int num1 = sc.nextInt();

	System.out.println("Enter your number 2");
        int num2 = sc.nextInt();

	System.out.println("Enter your number 3");
        int num3 = sc.nextInt();

		if(num1 < num2 && num2 > num3){
			System.out.println("The Maximum number amongst " + num1 +  " " + num2 + " & " + num3 + " is " + num2); 
		}
		else if(num1 > num2 && num1 > num3 ){
			System.out.println("The Maximum number amongst " + num1 +  " " + num2 + " & " + num3 + " is " + num1); 
		}
		else{
			System.out.println("The Maximum number amongst " + num1 + " " + num2 + " & " + num3 +" is " + num3); 
		}
    }
}
