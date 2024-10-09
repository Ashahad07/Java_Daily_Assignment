

public class Program112 {
    public static void main(String[] args) {
        int mul = 7;
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(mul*count+" ");
                count++;
            }
            System.out.println();
        }
    }    
}
