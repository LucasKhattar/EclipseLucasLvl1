import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class SensitiveKeyboard extends KeyAdapter {
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		SensitiveKeyboard key = new SensitiveKeyboard();
		key.frame.setVisible(true);
		key.frame.addKeyListener(key);
	}

	public void keyPressed(KeyEvent e) {
		speak("OUCH");
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
