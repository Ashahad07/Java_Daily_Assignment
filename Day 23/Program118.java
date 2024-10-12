
public class Program118 {
    public static void main(String[] args) {
        char ch = 'a';
        for (int i = 0; i < 4; i++) {
            char currChar = ch;
            for (int j = 0; j < (4 - i); j++) {

                System.out.print(currChar + " ");
                currChar++;
            }
            System.out.println();
            ch += 2;
        }
    }
}
