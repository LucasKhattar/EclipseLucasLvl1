
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		String guy = "http://www.corrie.net/kabin/archive/1999/briggs_johnny2.jpg";

		Component image;

		image = createImage(guy);

		quizWindow.add(image);

		quizWindow.pack();

		String name = JOptionPane.showInputDialog(null, "What is this mans name?");

		if (name.equals("Mike Baldwin")) {
			System.out.println("Correct!");
		}

		else {
			System.out.println("Incorrect!");
		}

		quizWindow.remove(image);

		String starwars = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Star_Wars_Logo.svg/2000px-Star_Wars_Logo.svg.png";
		image = createImage(starwars);
		quizWindow.add(image);
		quizWindow.pack();

		String war = JOptionPane.showInputDialog(null, "What is the title of this new episode in the series?");
		if (war.equalsIgnoreCase("The Force Awakens")) {
			JOptionPane.showMessageDialog(null, "Corrcet!");
		}

		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())
}
