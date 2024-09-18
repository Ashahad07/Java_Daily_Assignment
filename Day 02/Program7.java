class Program7{
	public static void main(String[] args){
		
		int i = 1;

		System.out.println("Even Number are: ");
		while(i<=20){			
			if(i%2==0){
				System.out.println(i);	
			}			
			i++;
		}
		i=1;
		System.out.println("Odd Number are: ");
		while(i<=20){			
			if(i%2!=0){
				System.out.println(i);	
			}
			i++;
		}
	}
}