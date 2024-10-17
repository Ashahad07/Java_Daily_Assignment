public class Program128 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            char ch = 'A';
            for (int j = 0; j < 4; j++) {
                if (j < 3 - i) {
                    System.out.print("  ");
                } else {
                    System.out.print(ch + " ");
                }
                ch++;
            }
            System.out.println();
        }
    }
}
