public class RobotArmy {
	public static void main(String[] asd){
		Human human1 = new Human ("Bob");
		Human human2 = new Human("Chris");
		Robot robot1 = new Robot("Greg", false);
		Robot robot2 = new Robot("Jim", false);
		Robot robot3 = new Robot("Jeff", false);
		Robot robot4 = new Robot("DarthVader", true);
		robot4.destroy(human1);
		robot3.destroy(human2);
		
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}