import java.util.*;

public class Program162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
    System.out.print("Enter Hexadecimal Number : ");
    String hexaNum = sc.next();
    int counter = 1;
    int decNum = 0;
    long octalNum = 0;
    for (int i = hexaNum.length()-1; i >= 0; i--) {
      switch (hexaNum.charAt(i)) {
        case 'A':
        case 'a':
          decNum += 10*counter;
          counter*=16;
          break;
      
        case 'B':
        case 'b':
          decNum += 11*counter;
          counter*=16;
          break;
      
        case 'C':
        case 'c':
          decNum += 12*counter;
          counter*=16;
          break;
      
        case 'D':
        case 'd':
          decNum += 13*counter;
          counter*=16;
          break;
      
        case 'E':
        case 'e':
          decNum += 14*counter;
          counter*=16;
          break;
      
        case 'F':
        case 'f':
          decNum += 15*counter;
          counter*=16;
          break;
      
        default:
          int digit = hexaNum.charAt(i) - '0';
          decNum += digit*counter;
          counter*=16; 
          break;
      }
    }
    long i = 1;
    while (decNum!=0) {
      int rem = decNum%8;
      octalNum += rem*i;
      i *= 10;
      decNum /= 8;     
    }

    System.out.println("Octal Number : "+octalNum);
    sc.close();
    }
}
