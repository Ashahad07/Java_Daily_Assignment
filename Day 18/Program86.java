import java.util.*;

class Program86 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the mass (In kg)");
    int Mass = sc.nextInt();
    System.out.println("Enter the velocity ");
    int Velocity = sc.nextInt();

    double Kinetic = 0.5 * Mass * Velocity * Velocity;
    System.out.println("Kinetic Energy of that Object is: "+ Kinetic);
    sc.close();
  }
}
