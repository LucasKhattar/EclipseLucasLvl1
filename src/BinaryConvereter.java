import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConvereter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField putin = new JTextField(20);
	JTextField answer = new JTextField(20);
	JButton button2 = new JButton();
	JTextField putin2 = new JTextField(20);
	JTextField answer2 = new JTextField(20);
	public static void main(String[] args) {
		BinaryConvereter binary = new BinaryConvereter();
		binary.setup();	
		}

	private void setup() {
		frame.setSize(650, 95);
		frame.add(panel);
		frame.setVisible(true);
		panel.add(putin);
		panel.add(button);
		button.setText("Convert!");
		panel.add(answer);
		answer.setEditable(false); 
		button.addActionListener(this);
		panel.add(putin2);
		panel.add(button2);
		button2.setText("Convert!");
		panel.add(answer2);
		answer2.setEditable(false); 
		button2.addActionListener(this);
	}
	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("\\A[01]+\\Z", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

	String convert1(String binary) {
		int asciiValue = Integer.parseInt(binary);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}

//	String getBinary(String letter) {
//		if (letter.length() > 1) {
//			JOptionPane.showMessageDialog(null, "Only enter one character!!!");
//			return "0";
//		}
//		int myc = letter.charAt(0);
//		
//		
//	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed.equals(button)){
			String BinaryNum = putin.getText();
			int num = convert(BinaryNum);
			String num2 = convert1(num+"");
			answer.setText(num2);	
		}
		if(buttonPressed.equals(button2)){
			
		}
	}
}
