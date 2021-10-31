import java.util.Scanner;
class Sum11{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Redius");
	double rad = sc.nextDouble();
	double per = (2*Math.PI*rad);
	double are = (Math.PI*rad*rad);
		System.out.println(String.format("Perimeter is :"+"%.14f",per));
		System.out.println(String.format("Area is :"+"%.14f", are));
	}
}
	