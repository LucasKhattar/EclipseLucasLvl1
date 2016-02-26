import java.awt.Component;
import java.util.Random;

import javax.swing.JFrame;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		JFrame frame =  new JFrame();
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
	
		frame.add(panel);

		panel.showPanel();
	

		
		panel.setBackgroundImage(galapagosIslands);


		
		/* 4. Put 50 Turtles on the beach. */
		for (int i = 0; i < 50; i++) {
			Turtle t = new Turtle();
			t.setX(new Random().nextInt(2000));
			t.setY(new Random().nextInt(1000));
			panel.addTurtle(t);
		}

	}
}
