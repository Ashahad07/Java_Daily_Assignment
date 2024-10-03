public class Program88 {
    public static void main(String[] args) {
        int start = 7; // Starting number
        
        
        System.out.println(start);
        
       
        int count = 7; 
        for (int i = 1; i < 4; i++) {
            
            for (int j = 0; j <= i; j++) {
				if(j > 0)
                    count--;
                System.out.print(count + " "); 
            }
            System.out.println(); 
        }
    }
}
