
public class race {
	String name;
	int speed;
	static String raceCity;
	static int count = 0;
	race(String name, int speed){
		this.name = name;
		this.speed = speed;
		count++;
	}
	public static void main(String[] args) {
		race a = new race("Boby",10 );
		race b = new race("Jeff",10 );
		System.out.println(b.count);
		b.raceCity = "San Diego";
		System.out.println(a.raceCity);
		
	}
}
