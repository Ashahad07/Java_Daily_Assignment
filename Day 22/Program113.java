import java.util.Arrays;

public class Program113 {
    public static void main(String[] args) {
        int orignalArray[] = {1,2,3,4,5};
        int copiedArray[] = Arrays.copyOf(orignalArray, orignalArray.length);

        for (int i = 0; i < copiedArray.length; i++) {
            System.out.println(copiedArray[i]+" ");
        }
    }
}
