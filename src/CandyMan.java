import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CandyMan implements ActionListener {
	JButton button = new JButton();

	
	public static void main(String[] args) {
		CandyMan cany = new CandyMan();
		cany.name();
	}
	int count;
public void name()
{
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	frame.add(panel);
	panel.add(button);
	button.setText("CanyMan");
	frame.setVisible(true);
	frame.pack();
	button.addActionListener(this);
}
private void showPictureFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
static final int CREEPY = 0;
static final int Meow = 1;

public static void playSound(int whichSound) {
File soundFile = null;
	 if (whichSound == CREEPY)
		 soundFile = new File(
				 "/Users/league/Desktop/EclipseLucasLvl1/src/110011__tuberatanka__cat-meow.wav");
	 else if (whichSound == Meow)
		 soundFile = new File(
				 "/Users/league/Desktop/EclipseLucasLvl1/src/110011__tuberatanka__cat-meow.wav");
	 try {
		 AudioInputStream audioInputStream = AudioSystem
				 .getAudioInputStream(soundFile);
		 Clip clip = AudioSystem.getClip();
		 clip.open(audioInputStream);
		 clip.start();
		 Thread.sleep(3400);
	 } catch (Exception ex) {
		 ex.printStackTrace();
	 }
}


@Override

public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(button)){
		count++;
	}
	if(count==5){
		showPictureFromTheInternet("http://www.laughspark.info/thumbfiles/705X705/cute-cat-with-beanie-and-glasses-635731307117442594-13752.jpg");
		playSound(Meow);
	}
}
}