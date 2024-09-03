class Program26{
   	public static void main(String[] args) {
	
        	int a = 10, b = 20, c = 30;
        	int secondLargest;

        	if ((a > b && a < c) || (a > c && a < b)) {
         	   secondLargest = a;
        	} 
		else if ((b > a && b < c) || (b > c && b < a)) {
         	   secondLargest = b;
        	}
		else {
            	secondLargest = c;
        	}

        	System.out.println(secondLargest + " is the second largest");
	}
}
