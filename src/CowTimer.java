import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;

public class CowTimer {
	/*
	 * This is an advanced recipe. There may be more than one line of code for
	 * each instruction.
	 */

	public static void main(String[] args) throws InterruptedException {

		CowTimer cow = new  CowTimer();
		cow.setTime(5);
		cow.start();

	}

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {

		for (int i = minutes; i > 0; i--) {
			
		System.out.println(i);
		Thread.sleep(1000);
 
		playSound("275154__bird-man__moo.wav");
		}

		//playSound("275154__bird-man__moo.wav");
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}

