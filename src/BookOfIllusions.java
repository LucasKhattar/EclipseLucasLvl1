import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be
 * loaded.
 **/

public class BookOfIllusions extends MouseAdapter {

	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want
	 * to get out of the static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
	}

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JLabel image1;
	boolean clicked = true;

	private void createBook() {
		frame.setVisible(true);
		frame.setSize(10000, 10000);
		String illusion1 = "OpticalIllusion1 3.jpg";
		String illusion2 = "OpticalIllusion2 2.png";
		image1 = this.loadImageFromComputer(illusion1);
		label = this.loadImageFromComputer(illusion2);
		frame.add(label);
		frame.pack();
		frame.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		frame.remove(label);
		frame.add(image1);
		frame.pack();
		if (clicked == true) {
			clicked = false;
			System.out.println("Wassam!");
			frame.remove(label);
			frame.add(image1);
			frame.pack();
		} else if (clicked == false) {
			clicked = true;
			System.out.println("Wassam!");
			frame.add(label);
			frame.remove(image1);
			frame.pack();
		}
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
