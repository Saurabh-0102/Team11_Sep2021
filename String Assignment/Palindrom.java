import java.util.*;

class Palindrome
{
	public static void main(String...args)
	{
		Scanner sc= new Scanner (System.in);
		String line=sc.nextLine();
		String s2 = line.replaceAll("\\s","");
		String newline =s2.toLowerCase();
		int len = newline.length();
		char[] arr=new char[len];
		char[] arr2=new char[len];
		arr=newline.toCharArray();
		int i=0;
		int j=arr.length-1;
		
		while(i<arr.length && j>=0 )
		{
			arr2[i]=arr[j];
			i++;
			j--;
		}
		int counter=0;
		i=0;

		while(i<arr.length)
		{
			if(arr[i]==arr2[i])
			{
				counter++;
			}
			else{counter=0;}
			i++;
		}
		if(counter==len)
		{
			System.out.println("is Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}
}