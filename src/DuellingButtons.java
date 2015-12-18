import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuellingButtons implements ActionListener {

	public static void main(String[] args) {
		new DuellingButtons().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {

		frame.setVisible(true);
		frame.setSize(1000, 1000);

		leftButton.setText("Click Me!");

		rightButton.setText("Click Me!");

		leftButton.addActionListener(this);

		rightButton.addActionListener(this);

		panel.add(leftButton);
		
		panel.add(rightButton);
		frame.add(panel);
		frame.pack();
		
		frame.setTitle("Demanding Buttons");
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
if(buttonPressed.equals(leftButton)){
	rightButton.setText("No, click Me!");
	rightButton.setPreferredSize(BIG);
	leftButton.setPreferredSize(SMALL);
	leftButton.setText("Click Me!");
}
if(buttonPressed.equals(rightButton)){
	leftButton.setText("No, click Me!");
	leftButton.setPreferredSize(BIG);
	rightButton.setPreferredSize(SMALL);
	rightButton.setText("Click Me!");
}
		/* If the buttonPressed was the leftButton.... */
		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL

		/* If the buttonPressed was the rightButton, do the opposite. */

		frame.pack();
	}
}
