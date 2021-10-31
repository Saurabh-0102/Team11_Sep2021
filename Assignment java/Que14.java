class Que14{
	public static void main(String []args){
		for (int i=1;i<=9;i++){
			for (int j=1;j<=11;j++){
				if ((i==1&&(j==1||j==3||j==5||j==7||j==9||j==11)))
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			for (int j=1;j<=11;j++){
				if ((i==2&&(j==2||j==4||j==6||j==8||j==10)))
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
			
	}
}

