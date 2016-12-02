import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Caculator {
	public static void main(String[] args) {
		Caculator cacl = new Caculator();
		cacl.Brain();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel(new FlowLayout());
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton Mulit = new JButton();
	JButton Div = new JButton();
	JTextField num1 = new JTextField();
	JTextField num2 = new JTextField();
	JTextField awn = new JTextField();

	void Brain() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(Div);
		panel.add(add);
		panel.add(sub);
		panel.add(Mulit);
		panel.add(num1);
		panel.add(num2);
		panel.add(awn);
		Div.setText("Divide");
		add.setText("Add");
		Mulit.setText("Multiply");
		sub.setText("Subtract");
		num1.setPreferredSize(new Dimension(150, 20));
		num2.setPreferredSize(new Dimension(150, 20));
		awn.setPreferredSize(new Dimension(100, 20));
		awn.setEditable(false);
		frame.setSize(375, 125);
	}
}