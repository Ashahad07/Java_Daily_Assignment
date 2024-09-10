class Program48{
	public static void main(String[] args) {
		int count = 4;
		for(int i = 1;i <= 4;i++){
			for(int j = 1;j <= 4 ;j++){
				if(i<=j){
					System.out.print(count + "  ");
				}
				else{
					System.out.print("   ");
				}
			}
			count--;
			System.out.println();
		}


	}
}