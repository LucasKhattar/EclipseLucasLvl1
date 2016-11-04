import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySuprises implements ActionListener {
	JButton button = new JButton();
	JButton butto = new JButton();
public static void main(String[] args) {
	nastySuprises nasty = new nastySuprises();
	nasty.showsuprize();
}
  void showsuprize(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(label);
	panel.add(butto);
	button.setVisible(true);
	label.setVisible(true);
	butto.setVisible(true);
	button.setText("Trick");
	label.setText("or");
	butto.setText("Treat");
	button.addActionListener(this);
	butto.addActionListener(this);
	frame.pack();
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(butto==e.getSource()){
			showPictureFromTheInternet("http://www.imagefully.com/wp-content/uploads/2015/07/Beautiful-Pikachu-Cute-Picture.jpg");
		}
		if(button==e.getSource()){
			showPictureFromTheInternet("https://media4.giphy.com/media/3oEjHICDl30tEYF5Oo/200_s.gif");
		}
	}



}
