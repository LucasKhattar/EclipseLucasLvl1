import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener {
	public static void main(String[] args) {
		chuckleClicker button = new chuckleClicker();
				
		button.makeButtons();
		
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton butto = new JButton();
	private void makeButtons() {
		// TODO Auto-generated method stub

		frame.setSize(500, 500);
		frame.setVisible(true);


		frame.add(panel);

		button.setText("Joke");
		panel.add(button);
		panel.setSize(200, 200);
		JButton butto = new JButton();
		butto.setText("Punchline");
		panel.add(butto);
		panel.setSize(200, 200);
		frame.pack();
		button.addActionListener(this);
		butto.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == button){
		JOptionPane.showMessageDialog(null, "Do you want to hear some cat jokes?");	
		}
		else{
		JOptionPane.showMessageDialog(null, "Just kittin!");	
		}

	}
}
