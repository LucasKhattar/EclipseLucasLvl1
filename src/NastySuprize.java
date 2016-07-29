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

public class NastySuprize implements ActionListener{
	JButton button = new JButton();
	JButton butto = new JButton();
	public static void main(String[] args) {
		NastySuprize nasty = new NastySuprize();
		nasty.showsuprize();
	}
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = getClass().getResource(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 void showsuprize(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(butto);
		panel.add(button);
		frame.pack();
		butto.setText("Trick");
		button.setText("Treat");
		button.addActionListener(this);
		butto.addActionListener(this);
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(butto==e.getSource()){
			showPictureFromTheInternet("trick.jpg");
		}
		if(button==e.getSource()){
			showPictureFromTheInternet("treat.jpg");
		}
	}

}
