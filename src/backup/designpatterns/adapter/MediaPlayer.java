package backup.designpatterns.adapter;


/**
 * Interface that represents a media player.
 * @author Michelle Ritzema
 */
public interface MediaPlayer {
	
	public void play(String audioType, String fileName);
	
}