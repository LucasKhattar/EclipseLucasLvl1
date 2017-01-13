import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TutorForTyping implements KeyListener {
	char currentLetter = generateRandomLetter();
	JFrame frame = new JFrame("Type or Die");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char newLetter = generateRandomLetter();
public static void main(String[] args) {
	TutorForTyping typing = new TutorForTyping();
	typing.setup();
	typing.generateRandomLetter();
}
	void setup(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		frame.setSize(200, 200);
		label.setFont(label.getFont().deriveFont(125.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(""+currentLetter);
		frame.addKeyListener(this);
		}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(""+e.getKeyChar());
		if(newLetter==e.getKeyChar()){
			System.out.println("Correct!");
			panel.setBackground(Color.GREEN);
		}
		else{
			System.out.println("Wrong!");
			panel.setBackground(Color.RED);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	    newLetter = generateRandomLetter();
		label.setText(""+newLetter);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
