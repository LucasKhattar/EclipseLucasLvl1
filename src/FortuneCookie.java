import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	 void showButton(){
		JFrame frame = new JFrame();
		JButton button = new JButton();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		button.setText("Click Me!");
		frame.pack();
	}
public static void main(String[] args) {
	FortuneCookie cookie = new FortuneCookie();
	cookie.showButton();
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	Random rand = new Random();
	int randy = rand.nextInt(4);
	String m = null;
	switch(randy){
	case 0:
		m = "You will have great fourtune today";
		break;
	case 1:
		m = "You will have bad luck today";
		break;
	case 2:
		m = "You will buy a new plant";
		break;
	case 3:
		m = "You will find $100 today";
	case 4:
		m = "You will get another fortune cookie :)";
		break;
	}
	JOptionPane.showMessageDialog(null, m);
}
}
