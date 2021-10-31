import java.util.Scanner;
class Cricket{
	
	String name;
	String country;
	int noOfMatches;

	Cricket(){		
	}
	
	Cricket(String name,String country, int noOfMatches){
		this.name=name;
		this.country=country;
		this.noOfMatches=noOfMatches;
	}
	
	void showDetails(){                //overridden
		System.out.println(name+","+country+","+noOfMatches);
	}
	
}
class Batsman extends Cricket{
	
	int totalRuns;
	
		Batsman(){
		}
	
		Batsman(String name,String country,int noOfMatches,int totalRuns){
		super(name,country,noOfMatches);
		this.totalRuns= totalRuns;
		}
		
		void showDetails(){         // method overriding
			super.showDetails();
			System.out.println("total Runs ="+totalRuns);
		}
	}

class Bowler extends Cricket{
	int totalWickets;
	
	Bowler(){
		super();
		
	}
	Bowler(String name,String country,int noOfMatches,int totalWickets){
	
		super(name,country,noOfMatches);
		this.totalWickets=totalWickets;
	}
	void showDetails(){          // method overriding
			super.showDetails();
			System.out.println("total Wickets ="+totalWickets);
	}
}

class TestCricket{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter Batsman name,country,total matches and totalRuns");
		String name = sc.next();
		String country = sc.next();
		int noOfMatches = sc.nextInt();
		int totalRuns = sc.nextInt();
		Batsman bat1 = new Batsman(name,country,noOfMatches,totalRuns);
		bat1.showDetails();
		Bowler bow1 = new Bowler("bumrah","india",100,250);
		bow1.showDetails();*/
		System.out.println("Enter the number of players");
		int no = sc.nextInt();
		Cricket cri[] = new Cricket[no];    // array of object ref..
		int count =0;
		boolean exit=false;
		while(!exit){
		System.out.println("Enter 1 for batsmane,2 for blower, 3 for details of players and 4 for exit");
		System.out.println("Enter your choice");
		switch(sc.nextInt()){
			case 1:
			if(count<cri.length){
			System.out.println("Enter Batsman name, country, total matches and total runs");
			cri[count]=new Batsman(sc.next(),sc.next(),sc.nextInt(),sc.nextInt());			
			count++;
			}
			else 
				System.out.println("Team Full");
				break;
			case 2:
				if (count<cri.length){
			System.out.println("Enter Bowler name, country, total matches and total wickets");
			cri[count]=new Bowler(sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
			count++;}
			else
				System.out.println("Team Full");
				break;
			case 3:
			for(int i=0;i<count;i++){
				cri[i].showDetails();
			}
				break;
			case 4 :
			exit=true;
				break;
			}
		}
		System.out.println("Thank You");	
	}
}