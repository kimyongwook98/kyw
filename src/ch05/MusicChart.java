package ch05;


public class MusicChart {
	private Song[] songArray;
	
	
	public Song[] getSongArray() {
		return songArray;
	}
	public void setSongArray(Song[] songArray) {
		this.songArray = songArray;
	}
	
	public MusicChart (Song[] songArray) {
		this.songArray = songArray;
	}
	

	
	public void printMusicChart() {
		for (int i = 0; i < songArray.length; i++) { 
			System.out.print(songArray[i]);
		}
	}
}