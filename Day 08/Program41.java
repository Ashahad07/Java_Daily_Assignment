class Program41{
	public static void main(String[] args) {
		int count = 01;
 		for(int i = 1;i <= 4;i++){
			for(int j = 1;j <= i;j++){
				if(j % 2 == 1){
					System.out.print("+ ");
				}
			else{

				System.out.print("= ");
			}
				
			}
			System.out.println();
		}


	}
}