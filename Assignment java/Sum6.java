import java.util.Scanner;
class Sum6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add, 2.Multi, 3.subs, 4. divide, 5.rem");
		int choice = sc.nextInt();
		System.out.println("Enter number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2");
		int num2 = sc.nextInt();
		int sum;
	
		switch (choice){
			case 1 :
			sum = num1+num2;
			System.out.println(+num1+"+"+num2+" ="+sum);
			break;
			case 2 :
			sum = num1*num2;
			System.out.println(+num1+"*"+num2+" ="+sum);
			break;
			case 3 :
			sum = num1-num2;
			System.out.println(+num1+"-"+num2+" ="+sum);
			break;
			case 4 :
			sum = num1/num2;
			System.out.println(+num1+"/"+num2+" ="+sum);
			break;
			case 5 :
			sum = num1%num2;
			System.out.println(+num1+"%"+num2+" ="+sum);
			break;
			
			default : 
			System.out.println("Invalid choice");
			
		}
		
	}
}

