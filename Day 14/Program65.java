import java.util.Scanner;

class Program65{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Min value");
        int min = sc.nextInt();	

	System.out.println("Enter Max value");
	int max = sc.nextInt();

        for (int i = min; i <= max; i++) {
          	if(i % 2 == 1){
			System.out.print(i + ", "); 
		}
        }
    }
}
