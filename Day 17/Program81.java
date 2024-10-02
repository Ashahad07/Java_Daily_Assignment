import java.util.Scanner;

class Program81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println("Second Predecessor: "+ (num - 2));
        System.out.println("Second Successor: " + (num + 2));
    }
    
}
