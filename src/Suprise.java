import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Suprise {
public static void main(String[] args) {
	Suprise toot = new Suprise();
	toot.run();
}
void run(){
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
frame.setVisible(true);
frame.add(panel);
panel.add(button);
button.setText("Suprise");
frame.pack();
}
}