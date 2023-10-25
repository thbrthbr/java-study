package study1;

interface Playable {
	void play();
	void pause();
	void stop();
}

class MP3Player implements Playable {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("음악재생");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("음악일시중지");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("음악정지");
	}
	
}

class DVDPlayer implements Playable {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("영상재생");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("영상일시중지");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("영상정지");
	}
	
}

public class MP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3Player mp3 = new MP3Player();
		DVDPlayer dvd = new DVDPlayer();
		mp3.play();
		mp3.pause();
		mp3.stop();
		dvd.play();
		dvd.pause();
		dvd.stop();
	}

}
