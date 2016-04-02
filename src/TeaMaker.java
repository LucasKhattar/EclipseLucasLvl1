// Copyright Wintriss Technical Schools 2013
public class TeaMaker {
	public static void main(String[] args) {
		Cup cup = new Cup();
		Kettle kettle = new Kettle();
		TeaBag teabag = new TeaBag("Green");
		TeaBag teabag1 = new TeaBag("Mint");
		TeaBag teabag2 = new TeaBag("Chamomile");
		TeaBag teabag3 = new TeaBag("Passion Fruit");
		kettle.boil();
		cup.makeTea(teabag, kettle.getWater());
		cup.makeTea(teabag1, kettle.getWater());
		cup.makeTea(teabag2, kettle.getWater());
		cup.makeTea(teabag3, kettle.getWater());
	}
	/* Figure out how to make a cup of tea using the classes below */

}

class TeaBag {

	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}

}

class Kettle {

	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}

}

class Cup {

	private TeaBag teabag;

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}

}
