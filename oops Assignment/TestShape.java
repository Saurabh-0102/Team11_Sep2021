class Shape{
	
	public void print(){
		System.out.println("this is "+ getClass());
	}
}
class Rectangle extends Shape{
	
	@Override
	public void print(){
		super.print();
		System.out.println("this is "+ getClass());
	}
}

class Circle extends Shape{
	@Override
	public void print(){
		System.out.println("this is "+ getClass());
	}
}
class Square extends Rectangle{
	@Override
	public void print(){
		super.print();
		System.out.println(getClass()+" is a Rectangle");
	}
}

class TestShape{
	public static void main(String []args){
		Shape s1 = new Shape();
		s1.print();
		s1 = new Rectangle();
		s1.print();
		s1=  new Square();
		s1.print();
		
		
		
	}
}