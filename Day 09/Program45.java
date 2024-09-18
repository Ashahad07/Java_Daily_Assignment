class Program45{
	public static void main(String[] args) {
		
		for(int i = 1;i <= 4;i++){
			char ch = 'A';
			char ch1 = 'a';
			for(int j = 1;j <= 5 - i;j++){
				if(i % 2 == 1){
					System.out.print(ch + "  ");
					ch++;
				}
				else{
					System.out.print(ch1 + " ");
					ch1++;
				}
				
			}
			System.out.println();
		}


	}
}