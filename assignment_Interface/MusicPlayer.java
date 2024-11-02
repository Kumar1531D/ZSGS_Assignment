package assignment_Interface;

public class MusicPlayer {

	public static void main(String[] args) {
		Playable mp3Player = new MP3Player();
		Playable cdPlayer = new CDPlayer();
		Playable streamingPlayer = new StreamingPlayer();
		
		mp3Player.play();
		mp3Player.pause();
		mp3Player.stop();
		
		cdPlayer.play();
		cdPlayer.pause();
		cdPlayer.stop();
		
		streamingPlayer.play();
		streamingPlayer.pause();
		streamingPlayer.stop();
		
	}

}

interface Playable{
	void play();
	void pause();
	void stop();
}

class MP3Player implements Playable{

	@Override
	public void play() {
		System.out.println("MP3 Player is playing...");
	}

	@Override
	public void pause() {
		System.out.println("MP3 Player is paused!");
	}

	@Override
	public void stop() {
		System.out.println("MP3 Player is stopped!");
	}
	
}

class CDPlayer  implements Playable{

	@Override
	public void play() {
		System.out.println("CD Player is playing...");
	}

	@Override
	public void pause() {
		System.out.println("CD Player is paused!");
	}

	@Override
	public void stop() {
		System.out.println("CD Player is stopped!");
	}
	
}

class StreamingPlayer  implements Playable{

	@Override
	public void play() {
		System.out.println("StreamingPlayer  is playing...");
	}

	@Override
	public void pause() {
		System.out.println("StreamingPlayer  is paused!");
	}

	@Override
	public void stop() {
		System.out.println("StreamingPlayer  is stopped!");
	}
	
}
