import java.applet.AudioClip;

import javax.swing.JApplet;

public class SoundEffects {

	public static void main(String[] args) {
		SoundEffects se = new SoundEffects();
		se.playSound("sawing-wood-daniel_simon.wav");
	}
	
	
	
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

}
