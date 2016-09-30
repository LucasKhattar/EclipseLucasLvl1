import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMashine implements ActionListener {
	JLabel label4 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label1 = new JLabel();
	JLabel label3 = new JLabel();
	public void showSlotMashine() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		frame.add(panel);
		panel.add(label2);
		panel.add(label1);
		panel.add(label3);
		panel.add(label4);
		frame.setVisible(true);
		button.setText("Spin for a cance to win $1000000!");
		label1.setText(" ");
		label2.setText(" ");
		label3.setText(" ");
		label4.setText(" ");
		panel.add(button);
		frame.setSize(500, 300);
		button.addActionListener(this);
		frame.pack();
		for (int i = 0; i < 2147483647; i++) {
			for (int j = 0; i < 2147483647; i++) {
				for (int k = 0; i < 2147483647; i++) {
					for (int l = 0; i < 2147483647; i++) {
						for (int m = 0; i < 2147483647; i++) {
							for (int n = 0; i < 2147483647; i++) {
								frame.pack();
							}
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		SlotMashine slot = new SlotMashine();
		slot.showSlotMashine();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int randy1 = new Random().nextInt(3);
		int randy2 = new Random().nextInt(3);
		int randy3 = new Random().nextInt(3);
		if(randy1==randy2&&randy2==randy3){
			label4.setText("You Win $1000000!");
			label2.setText(randy2+"");
			label1.setText(randy1+"");
			label3.setText(randy3+"");
		}
		else{
			label4.setText("You Lose!");
			label2.setText(randy2+"");
			label1.setText(randy1+"");
			label3.setText(randy3+"");
		}

		// TODO Auto-generated method stub
		
	}
}
