import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;
public class SimonSays extends KeyAdapter {
 
int points = 0;

 JFrame frame;
 	HashMap<Integer,String> images = new HashMap<Integer, String>();
 	private int imageIndex;
 	private int tries = 0;
 	private int simonSays = 0;
 	Date timeAtStart;
 	private  void makeAlbum() {  	

 JOptionPane.showMessageDialog(null, "Press the matching key when 'Simon says' otherwise press a different key");
//2. add 4 images which match keyboard keys like this: images.put(new Integer(KeyEvent.VK_UP), "image.jpg");
 images.put(new Integer(KeyEvent.VK_UP), "imgres.png");
 images.put(new Integer(KeyEvent.VK_DOWN), "imgres.jpg");
 images.put(new Integer(KeyEvent.VK_RIGHT), "imgres-1.png");
 images.put(new Integer(KeyEvent.VK_LEFT), "imgres-2.png");
showImage();

 	}
	public void keyPressed(KeyEvent e) {
    	int keyCode = e.getKeyCode();
    	if(keyCode == imageIndex&&simonSays!=2){
    		points++;
    		speak("Correct");
    	}
    	if(keyCode != imageIndex&&simonSays==2){
    		points++;
    		speak("Correct");
    	}
    	else{
    		speak("Inorrect");
    	}
 
  	tries++;
    	if(tries == 9){
    		JOptionPane.showMessageDialog(null, "You had "+points+" points.");
    	System.exit(0);
    	}
    	frame.dispose();
    	showImage();

	}
	private void showImage() {  
	 frame = new JFrame();
	frame.setVisible(true);  	
	frame.add(getNextRandomImage());
     	frame.setSize(500, 500);
     	frame.addKeyListener(this);

     	simonSays = new Random().nextInt(3);
     	if(simonSays == 2){
     		speak("Press this key");
     	}
     	else{
     		speak("Simon says press this key");
     	}
    	
	}
	private Component getNextRandomImage() {
    	this.imageIndex = new Random().nextInt(4) + 37;
    	return loadImage(images.get(imageIndex));
	}
	private JLabel loadImage(String fileName) {
    	URL imageURL = getClass().getResource(fileName);
    	Icon icon = new ImageIcon(imageURL);
    	return new JLabel(icon);
	}
  void speak(String words) {
  	  try {
  	   Runtime.getRuntime().exec("say " + words).waitFor();
  	  } catch (Exception e) {
  	   e.printStackTrace();
  	  }
   	}
	public static void main(String[] args) throws Exception {
	 new SimonSays().makeAlbum();
	}
}


/* 
* 20. add a timer
* ~~~ where the code starts running ~~~
* timeAtStart = new Date();
*
* ~~~ where the code ends ~~~
* Date timeAtEnd = new Date();
* System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
* System.exit(0);
*/
