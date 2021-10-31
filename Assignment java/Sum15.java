import java.util.Scanner;
class Sum15{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for swapping");
		int a,b,s;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Numbers before swapping "+a+","+b);
		s=a;
		a=b;
		b=s;
		System.out.println("Numbers after swapping "+a+","+b);
		sc.close();
	}
}


			
			