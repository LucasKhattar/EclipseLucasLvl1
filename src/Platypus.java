public class Platypus {
	private String name;
	Platypus(String name){
		this.name = name;
	}
	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		Platypus plat = new Platypus("Perry");

		plat.sayHi();
		
	}
}