import java.util.Scanner;

class Program67{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int even = sc.nextInt();	

	for (int i = 2; i <= even; i++) {
          	if(i % 2 == 0){
			System.out.println("Cube of " + i +": " + (i * i * i) + " and Square of " + i + ": " + (i * i)); 
		}
        }
    }
}
