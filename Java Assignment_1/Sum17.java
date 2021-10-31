import java.util.Scanner;
class Sum17{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1= sc.nextInt();
		
		int num2= sc.nextInt();
		int sum = num1+num2;
		System.out.println("Binary "+Integer.toBinaryString(sum));
	}
}
