package backup.designpatterns.adapter;


/**
 * STRUCTURAL PATTERN - ADAPTER
 * 
 * Class that works as a bridge between two incompatible infsen02.interfaces.
 * @author Michelle Ritzema
 */
public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
	    } else if(audioType.equalsIgnoreCase("mp4")) {
	        advancedMusicPlayer = new Mp4Player();
	    }	
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMusicPlayer.playVlc(fileName);
	    } else if(audioType.equalsIgnoreCase("mp4")) {
	        advancedMusicPlayer.playMp4(fileName);
	    }
	}
	
}