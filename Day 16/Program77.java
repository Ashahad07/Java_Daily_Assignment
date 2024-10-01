import java.util.Scanner;

class Program77{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current (in amps): ");
        int I = sc.nextInt();

	System.out.print("Enter resistance (in ohms): ");
        int R = sc.nextInt();

	int voltage = I * R;
	System.out.println("Voltage V = " + voltage + " V");
		
    }
}
