import java.util.Scanner;
class Sum13{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter width and height");
	float width = sc.nextFloat();
	float height = sc.nextFloat();
	float area = (width*height);
	float peri = (2*(width+height));
	System.out.println("Area is "+width+"*"+height+" :"+area);
	System.out.println("perimeter is "+"2 *"+width+"+"+height+":"+ peri);
	}
}