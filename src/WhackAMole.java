import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	public static void main(String[] args) {
		WhackAMole mole = new WhackAMole();
		mole.template();
	}

	void template() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		Random rand = new Random();
		int x = rand.nextInt(24);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(250, 300);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			button.setText("Mole");
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
