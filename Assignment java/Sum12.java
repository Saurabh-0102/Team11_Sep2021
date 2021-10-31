import java.util.Scanner;
class Sum12{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		double ave = (num1+num2+num3)/3;
		System.out.println("Average "+ave);
		sc.close();
	}
}
