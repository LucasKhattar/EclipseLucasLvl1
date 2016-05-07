import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TurtlePond implements KeyEventDispatcher {

	int cookieX = 300;
	int cookieY = 400;
	int speed = 7;

	void setup() {
		JOptionPane.showMessageDialog(null, "Move the turtle with the arrow keys to find the hidden cookie.\nYou'll get warmer the closer you get.\nHurry or he'll die of hunger!");

		showCookie();
	}

	private void goUp() {
		Tortoise.move(speed);
	}

	private void goDown() {
		Tortoise.move(-speed);
	}

	private void goLeft() {
		Tortoise.turn(270);
		Tortoise.move(speed);
		Tortoise.turn(90);
	}

	private void goRight() {
		Tortoise.turn(90);
		Tortoise.move(speed);
		Tortoise.turn(270);
	}

	private void checkForFood() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
		if (tortoiseLocationX >= 295 && tortoiseLocationY <= 405 && tortoiseLocationX >= 195 && tortoiseLocationY >= 295 && tortoiseLocationX <= 305 && tortoiseLocationY <= 505
				&& tortoiseLocationX <= 305 && tortoiseLocationY <= 405) {
			JOptionPane.showMessageDialog(null, "You Got The Cookie!");
		} else if (tortoiseLocationX >= 280 && tortoiseLocationY <= 420 && tortoiseLocationX >= 280 && tortoiseLocationY >= 380 && tortoiseLocationX <= 320
				&& tortoiseLocationY <= 420 && tortoiseLocationX <= 320 && tortoiseLocationY <= 420) {
			setBackgroundColor(Color.red);
		} else if (tortoiseLocationX >= 250 && tortoiseLocationY <= 450 && tortoiseLocationX >= 250 && tortoiseLocationY >= 350 && tortoiseLocationX <= 350
				&& tortoiseLocationY <= 450 && tortoiseLocationX <= 350 && tortoiseLocationY <= 450) {
			setBackgroundColor(Color.orange);
		} else if (tortoiseLocationX >= 200 && tortoiseLocationY <= 500 && tortoiseLocationX >= 200 && tortoiseLocationY >= 300 && tortoiseLocationX <= 400
				&& tortoiseLocationY <= 500 && tortoiseLocationX <= 400 && tortoiseLocationY <= 500) {
			setBackgroundColor(Color.yellow);
		} else {
			setBackgroundColor(Color.gray);
		}
		System.out.println(tortoiseLocationX + "X, " + tortoiseLocationY + "Y");
		// 11. If more than 20 seconds have elapsed, tell them the turtle died of hunger!
		if (getTimeElapsed() >= 20) {
			JOptionPane.showMessageDialog(null, "You Died Of Hunger!");
		}
		// 12. If the Tortoise crosses it's own path, tell them they failed and move them back to the beginning

	}

	private long getTimeElapsed() {
		Date currentTime = new Date();
		return (currentTime.getTime() - startTime.getTime()) / 1000;
	}

	private void setBackgroundColor(Color color) {
		Tortoise.getBackgroundWindow().setBackground(color);
	}

	private void showCookie() {
		Tortoise.getBackgroundWindow().addPaintable(new Paintable() {
			public void paint(Graphics2D g, JPanel caller) {
				g.drawOval(cookieX, cookieY, 10, 10);
			}
		});
	}

	private boolean wasHereBefore(int xPosition, int yPosition) {
		if (previousLocations.contains(new Point(xPosition, yPosition)))
			return true;
		else
			return false;
	}

	private Point getFirstLocation() {
		return previousLocations.get(0);
	}

	/*********************** don't worry about the stuff under here ******************/

	Date startTime = new Date();

	public static void main(String[] args) {
		TurtlePond feeder = new TurtlePond();
		feeder.controlTheTortoise();
		feeder.setup();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setPenColor(PenColors.Purples.DarkMagenta);
		Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.SlateGray);
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {

			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();

			try {
				checkForFood();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			savePosition(Tortoise.getX(), Tortoise.getY());
		}
		return false;
	}

	ArrayList<Point> previousLocations = new ArrayList<Point>();

	private void savePosition(int xPosition, int yPosition) {
		previousLocations.add(new Point(xPosition, yPosition));
	}
}