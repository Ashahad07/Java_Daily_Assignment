import java.util.Scanner;

class Program70{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Min value");
        int min = sc.nextInt();	

	System.out.println("Enter Max value");
	int max = sc.nextInt();
	System.out.print("Series Of Even Numbers Ranging between" + min + " & " + max +" is :");
        for (int i = min; i <= max; i++) {
          	if(i % 2 == 0){
			System.out.print(i + ", "); 
		}
        }
    }
}
