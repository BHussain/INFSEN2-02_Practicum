package backup.designpatterns.adapter;


/**
 * VlcPlayer that implements the AdvancedMediaPlayer.
 * @author Michelle Ritzema
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);
	}

	@Override
	public void playMp4(String fileName) {
		//do nothing
	}
	
}