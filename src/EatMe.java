import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.HashMap;
import java.util.Random;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * This game uses the Makey Makey to see if you can match the pictures of food to the correct utensil. There are
 * utensils (including metal chopsticks!) in one of the blue drawers.
 * 
 * Learn how to hook up the Makey Makey here: http://makeymakey.com/howto.php
 * 
 */

public class EatMe extends KeyAdapter {
	public class race {

	}

	int numberOfTries = 0;
	int score = 0;
	JFrame jFrame;
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int correctUtensilCode;

	private void makeAlbum() {

		images.put(new Integer(KeyEvent.VK_UP), "imgres-3.jpg");
		images.put(new Integer(KeyEvent.VK_LEFT), "imgres.jpg");
		images.put(new Integer(KeyEvent.VK_DOWN), "imgres-1.jpg");
		images.put(new Integer(KeyEvent.VK_RIGHT), "imgres-2.jpg");
		// 3. Call the method to show an image
		showImage();
	}

	private void showImage() {
		// JOptionPane.showMessageDialog(null, "You called the method correctly! Now remove this annoying pop-up from
		// your code.");

		jFrame = new JFrame();
		jFrame.setVisible(true);
		jFrame.add(getNextRandomImage());

		jFrame.pack();

		jFrame.addKeyListener(this);
	}

	public void keyPressed(KeyEvent e) {
		// JOptionPane.showMessageDialog(null, "A key was pressed! Remove the code for this annoying pop-up.");
		int whichKeyPressed = e.getKeyCode();

		System.out.println(whichKeyPressed);
		System.out.println(correctUtensilCode);
		// 10. If they match, tell the user they were correct
		if (whichKeyPressed == correctUtensilCode) {
			numberOfTries+=1;
			score+=1;
			JOptionPane.showMessageDialog(null, "Mmmmmm, Yummy! Your score is  "+score+".");
		} else {
			JOptionPane.showMessageDialog(null, "You need some manners!");
			numberOfTries+=1;
			System.exit(0);
		}
		if(numberOfTries==10){
			System.exit(0);
		}
		jFrame.dispatchEvent(new WindowEvent(jFrame, WindowEvent.WINDOW_CLOSING)); // closes the window

		showImage();
		// 14. Make a variable for the number of tries and limit it to 10.[requires code in different places]

		// 15. Make a variable to track the score and tell the user at the end. [requires code in different places]

	}

	private Component getNextRandomImage() {
		String[] fileNames = images.values().toArray(new String[0]);
		int randomness = new Random().nextInt(fileNames.length);
		String randomFile = fileNames[randomness];
		System.out.println("loading image " + randomness + ": " + randomFile);

		this.correctUtensilCode = getHashMapKey(randomFile);
		return loadImage(randomFile);

	}

	private Integer getHashMapKey(String randomFile) {
		for (Integer key : images.keySet()) {
			if (images.get(key).equals(randomFile)) {
				return key;
			}
		}
		return null;
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public static void main(String[] args) throws Exception {
		new EatMe().makeAlbum();
	}
}

/**
 * 17. [Optional] Add a timer. ~~~ Declare the Start at the top~~~Date timeAtStart; ~~~ Set it where the code starts
 * running ~~~ timeAtStart= new Date();
 * 
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000); System.exit(0);
 * 
 **/
