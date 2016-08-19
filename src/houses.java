import java.awt.Color;

import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class houses {
	public static void main(String[] args) {
		houses house = new houses();
		Tortoise.setSpeed(5);
		Tortoise.setX(10);
		Tortoise.setY(435);
		Tortoise.show();
		house.drawHouse("large", Colors.getRandomColor());
		house.drawHouse("small", Colors.getRandomColor());
		house.drawHouse("small", Colors.getRandomColor());
		house.drawHouse("medium", Colors.getRandomColor());
		house.drawHouse("large", Colors.getRandomColor());
		house.drawHouse("large", Colors.getRandomColor());
		house.drawHouse("small", Colors.getRandomColor());
		house.drawHouse("medium", Colors.getRandomColor());
		house.drawHouse("small", Colors.getRandomColor());
		house.drawHouse("large", Colors.getRandomColor());
		house.drawHouse("small", Colors.getRandomColor());
		house.drawHouse("small", Colors.getRandomColor());
		house.drawHouse("medium", Colors.getRandomColor());
		house.drawHouse("large", Colors.getRandomColor());
		house.drawHouse("large", Colors.getRandomColor());
		house.drawHouse("small", Colors.getRandomColor());
		house.drawHouse("medium", Colors.getRandomColor());
		house.drawHouse("small", Colors.getRandomColor());
	}

	int h;

	public void drawHouse(String size, Color c) {
		int height = 120;
		if (size.equals("small")) {
			height = 60;
		}

		if (size.equals("medium")) {
			height = 120;
		}

		if (size.equals("large")) {
			height = 250;
		}

		Tortoise.getBackgroundWindow().setColor(Color.BLACK);
		Tortoise.setPenColor(c);
		Tortoise.move(height);

		if (size.equals("small")) {
			flatRoof();
		}

		if (size.equals("medium")) {
			pointyRoof();
		}

		if (size.equals("large")) {
			pointyRoof();
		}

		Tortoise.move(height);
		Tortoise.turn(270);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(25);
		Tortoise.turn(270);
	}

	private void flatRoof() {
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
	}

	private void pointyRoof() {
		Tortoise.turn(60);
		Tortoise.move(50);
		Tortoise.turn(60);
		Tortoise.move(50);
		Tortoise.turn(60);
	}

}
