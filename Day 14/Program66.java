import java.util.Scanner;

class Program66{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value");
        int a = sc.nextInt();	

	System.out.println("Enter second value");
	int b = sc.nextInt();

       	System.out.println( "Before Swap "+ a + " " + b); 
	int temp = 0;
	temp = b;
	b = a;
	a = temp;
        System.out.println( "After Swap "+ a + "  "+ b); 
    }
}
