import java.util.Scanner;
class Binary{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int num,i=0;
		int bin[]= new int[100];
		System.out.println("Enter binary number");
		num = sc.nextInt();
		
		while(num!=0){
			bin[i] = num%2;
			num = num/2;
		i++;
		}
		for (int j = i-1;j>=0;j--){
			System.out.print(" "+bin[j]);
		}
		System.out.println();
	}
}