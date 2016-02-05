// Copyright Wintriss Technical Schools 2013
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PhotoAlbum extends MouseAdapter {

	/* We’re going to make a slideshow of cool optical illusions. */


	JFrame frame = new JFrame();
	
	JLabel label;

	private void makeAlbum() throws MalformedURLException {

		frame.setVisible(true);

		frame.setSize(500,500);

		
		

		String pic = "hekko.png";

		label = loadImageFromComputer(pic);
		
		frame.add(label);
		
		frame.pack();
		frame.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print to the console when the mouse is pressed
System.out.println("Hekko");
		// 12. remove everything from the frame (the image will not disappear until step 14)
		// 13. load a new image like before (this is more than one line of code)
		// 14. pack the frame
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	public JLabel loadImageFromTheInternet(String imageURL) throws MalformedURLException {
		URL url = new URL(imageURL);
		Icon icon = new ImageIcon(url);
		return new JLabel(icon);
	}

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public static void main(String[] args) throws Exception {
		new PhotoAlbum().makeAlbum();
	}
}



