
public class runners {
	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy");
		Smurf PapaSmurf = new Smurf("Papa");
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Handy.getName());
		Handy.eat();
		System.out.println(Handy.getName());
		System.out.println(PapaSmurf.getName());
		System.out.println(PapaSmurf.getHatColor());
		System.out.println(PapaSmurf.isGirlOrBoy());
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
	}
}
