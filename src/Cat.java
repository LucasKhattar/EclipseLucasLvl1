
public class Cat {
	String color;
	String type;
	int weight; 
	
	public static void main(String[] args) {
		Cat d = new Cat();
		d.purr();
		d.goBathroom();
		d.lick();
	}
	
	void lick() {
		System.out.println("Lick!");
	}
	void purr() {
		System.out.println("Purr!");
	}
	void goBathroom() {
		System.out.println("WEEEEEEE!");
	}


}
