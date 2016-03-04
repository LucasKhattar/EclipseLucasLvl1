

import java.applet.AudioClip;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;

public class SeaCreature {

	private String name;

	SeaCreature(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}

	public void laugh() {
		try {
			AudioClip sound = JApplet
					.newAudioClip(getClass().getResource(this.name + ".wav"));
			
		
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
