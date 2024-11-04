
public class Program154 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 4; i++) {
            int count = 3;
            char ch = 'D';
            for (int j = 0; j < 4; j++) {
                if (j < 3 - i) {
                    System.out.print("   ");
                } else {
                    System.out.print(ch +"" +count + " ");
                    count++;
                }
                ch--;
            }
            System.out.println();
        }
    }
}
