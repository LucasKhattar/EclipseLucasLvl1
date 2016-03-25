import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();

	
	public static void main(String[] args) {
		CutenessTV cute = new CutenessTV();
		cute.showTV();
	}

	void showTV() {
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		frame.setTitle("Cuteness TV");
		frame.add(panel);
		panel.setVisible(true);
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		button.setVisible(true);
		button.setText("Ducks");
		button.addActionListener(this);
		button1.setVisible(true);
		button1.setText("Frog");
		button1.addActionListener(this);
		button2.setVisible(true);
		button2.setText("Unicorn");
		button2.addActionListener(this);
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button3 = (JButton) e.getSource();
		
if(button3.equals(button))
{
	showDucks();
}
if(button3.equals(button1))
{
	showFrog();	
}
if(button3.equals(button2))
{
	 showFluffyUnicorns();
}
	}

}
