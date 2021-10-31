import java.util.Scanner;
class StringEqual{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if(a.equals(b))
		System.out.println("Equal");
		else
		System.out.println("Not Equal");
	}
}