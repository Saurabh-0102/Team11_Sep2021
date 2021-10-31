import java.util.Scanner;
class Sum7{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Intput a number");
	int num = sc.nextInt();
	System.out.println("Output");
	for(int i=1; i<=10;i++){
		int sum = i * num;
		System.out.println(+num+"*"+i +"="+sum);
	}
	}
}
