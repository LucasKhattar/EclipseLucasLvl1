
public class SuperHero {
	String Name;
	String Power;

	public SuperHero(String name, String Power) {
		this.Name = name;
		this.Power = Power;

	}

	String getname() {
		return Name;
	}

	String getPower() {
		return Power;
	}

	void setName(String myName) {
		this.Name = myName;
	}

	void setPower(String myPower) {
		this.Power = myPower;
	}
public String toString(){
	return Name+ " has mad "+Power+" skils!";
}
}