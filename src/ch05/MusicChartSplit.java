package ch05;


public class MusicChartSplit {
	private SongSplit[] songArray;
	
	
	public SongSplit[] getSongArray() {
		return songArray;
	}
	public void setSongArray(SongSplit[] songArray) {
		this.songArray = songArray;
	}
	
	public MusicChartSplit (SongSplit[] songArray) {
		this.songArray = songArray;
	}
	

	
	public void printMusicChartSplit() {
		for (int i = 0; i < songArray.length; i++) { 
			songArray[i].printInfo();
		}
	}
	
	
	
}