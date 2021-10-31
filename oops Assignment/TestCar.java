import java.util.Scanner;
abstract class Car{
	
	boolean isSedan;
	String seats;
	
	Car(boolean isSedan, String seats){
		this.isSedan = isSedan;
		this.seats = seats;
	}
	
	public boolean getIsSedan(){
		return isSedan;
	}
	public String getSeats(){
		return seats;
	}
	
	abstract public String getMileage();
}

class WagonR extends Car{
	
	int mileage;
	
	
	WagonR(int mileage){
		super(false,"4");
		this.mileage = mileage;
		if(super.isSedan==true){
		System.out.println("A WagonR is a Sedan, is "+super.getSeats()+"-seater, and has a mileage of "+getMileage()+" Kmpl.");
		}else
			System.out.println("A WagonR is not a Sedan, is "+super.getSeats()+"-seater, and has a mileage of "+getMileage()+" Kmpl.");
	}
	
	public String getMileage(){
		return ""+this.mileage;
	}
}

class HondaCity extends Car{
	int mileage;
	
	HondaCity(int mileage){
		super(true,"4");
		this.mileage = mileage;
		if(super.isSedan==true){
		System.out.println("A HondaCity is a Sedan, is "+super.getSeats()+"-seater, and has a mileage of "+getMileage()+" Kmpl.");
		}else
			System.out.println("A HondaCity is not a Sedan, is "+super.getSeats()+"-seater, and has a mileage of "+getMileage()+" Kmpl.");
	}
	
	public String getMileage(){
		return ""+mileage;
	}
}
class InnovaCrysta extends Car{
	int mileage;
	
	InnovaCrysta(int mileage){
		super(true,"4");
		this.mileage = mileage;
		if(super.isSedan==true){
		System.out.println("A InnovaCrysta is a Sedan, is "+super.getSeats()+"-seater, and has a mileage of "+getMileage()+" Kmpl.");
		}else
			System.out.println("A InnovaCrysta is not a Sedan, is "+super.getSeats()+"-seater, and has a mileage of "+getMileage()+" Kmpl.");
	}
	
	public String getMileage(){
		return ""+mileage;
	}
}

class TestCar{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
			while(!exit){
			System.out.println("Enter 0 for WagonR, 1 for HondaCity and 2 for InnovaCrysta and 3 for exit");
			switch(sc.nextInt()){
			case 0 :
			System.out.println("Enter mileage of Car");
			new WagonR(sc.nextInt());
			break;
			case 1 :
			System.out.println("Enter mileage of Car");
			new HondaCity(sc.nextInt());
			break;
			case 2 :
			System.out.println("Enter mileage of Car");
			new InnovaCrysta(sc.nextInt());
			break;
			case 3 :
			exit = true;
			break;
			}			
		}
		System.out.println("Thank YOU!!!!!!!!!");
	}
}