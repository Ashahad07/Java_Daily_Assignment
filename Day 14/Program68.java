import java.util.Scanner;

class Program68{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % 2 == 0){
			System.out.print("A "); 
		}
		else{
			System.out.print("a ");
		}
            }
            System.out.println(); 
        }
    }
}
