package backup.designpatterns.adapter;


/**
 * Interface that represents an advanced media player.
 * @author Michelle Ritzema
 */
public interface AdvancedMediaPlayer {

	public void playVlc(String fileName);
	
	public void playMp4(String fileName);
	
}