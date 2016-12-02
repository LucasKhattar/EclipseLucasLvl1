import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	public static void main(String[] args) {
		PigLatin pig = new PigLatin();
		pig.CallMe();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField field1 = new JTextField();
	JTextField field2 = new JTextField();

	void CallMe() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(field1);
		panel.add(button);
		panel.add(field2);
		button.setText("Translate");
		field1.setPreferredSize(new Dimension(200, 20));
		field2.setPreferredSize(new Dimension(200, 20));
		frame.pack();
		button.addActionListener(this);
		field2.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		PigLatinConverter latin = new PigLatinConverter();
		String translate = latin.translate(field1.getText());
		field2.setText(translate);
	}
}
