import java.applet.AudioClip;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fart implements ActionListener{
JFrame frame = new JFrame();
JButton button = new JButton();
JButton butto = new JButton();
JButton butt = new JButton();
JPanel panel = new JPanel();
public static void main(String[] args) {
	Fart fart = new Fart();
	fart.meathod();
}
private void meathod() {
	frame.add(panel);
	panel.add(button);
	frame.setVisible(true);
	panel.setVisible(true);
	button.setVisible(true);
	button.setText("Fart 1");
	frame.setSize(275, 60);
	butto.setVisible(true);
	butt.setVisible(true);
	butto.setText("Fart 2");
	butt.setText("Fart 3");
	panel.add(butto);
	panel.add(butt);
	button.addActionListener(this);
	butto.addActionListener(this);
	butt.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().equals(button)){
		playSound("fart1.wav");
	}
	if(e.getSource().equals(butto)){
		playSound("fart2.wav");
	}
	if(e.getSource().equals(butt)){
		playSound("fart3.wav");
}
}
private void playSound (String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}
}
