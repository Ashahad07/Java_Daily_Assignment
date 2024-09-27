import java.util.Scanner;

class Program72{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Distance (in meters): ");
        int distance = sc.nextInt();

	System.out.println("Enter Time (in seconds): ");
        int time = sc.nextInt();

		if(time != 0){
			int velocity = distance / time;
			System.out.println("The Velocity of a Particle roaming In space is " + velocity + "m/s"); 
		}
		else{
			System.out.println("Time cannot be zero, Enter Valid Time"); 
		}
    }
}
