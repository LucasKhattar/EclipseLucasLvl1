import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
	

public class TypingTudor implements KeyListener {
	JFrame frame;
	JLabel label;
	 char CurrentLetter;
	public void createUI(){
		 CurrentLetter = generateRandomLetter();
		 frame = new JFrame();
		 label = new JLabel();
		frame.setVisible(true);
		frame.setSize(500, 200);
		frame.setTitle("Type Or Die!");
		label.setText(generateRandomLetter()+"");
		frame.add(label);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this); 
 }
public static void main(String[] args) {
	TypingTudor type = new TypingTudor();
	type.createUI();
}	

 static char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("You have pressed the letter "+e.getKeyChar() );
//	 CurrentLetter = generateRandomLetter();
//		label.setText(CurrentLetter+"");
	if (e.getKeyChar()==(CurrentLetter)){
		System.out.println("Correct");
		frame.setBackground(Color.GREEN);
	}
	else{
		System.out.println("Incorrect");
		frame.setBackground(Color.RED);
	}
	CurrentLetter = generateRandomLetter();
	label.setText(CurrentLetter+"");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
