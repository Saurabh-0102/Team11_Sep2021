import java.util.Scanner;
class ContainString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		if(a.contains("Cdac")){
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		
	}
}