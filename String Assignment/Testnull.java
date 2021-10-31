class Testnull{
	public static void main(String[]args){
		dnull d1 = new dnull();
		anotherfun(d1);
	}

	public void anotherfun(dnull d){
		d.fun();
	}
	
}
class dnull{
		void fun(){
			System.out.println("Fun of null");
		}
}