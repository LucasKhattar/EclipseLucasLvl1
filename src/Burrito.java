public class Burrito {
	private String name;
	private String person;
	void eat(){
		System.out.println("The burrito " + name + " has been eaten.");
	}
	Burrito(String name, String person){
		this.name = name;
		this.person = person;
	}	
	void who(){
		System.out.println("He was eaten by " + person);
	}
}
	
