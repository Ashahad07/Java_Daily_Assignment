import java.util.*;;
class Program100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                if (j % 2 == 0) {
                    System.out.print("+ ");
                }
                else{
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
