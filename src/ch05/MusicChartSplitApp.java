package ch05;

public class MusicChartSplitApp {

	public static void main(String[] args) {
		
		
		SongSplit[] songArray = new SongSplit[3];
		songArray[0] = new SongSplit("불타오르네", "BTS", "20160502");
		songArray[1] = new SongSplit("밤편지", "아이유", "20131212");
		songArray[2] = new SongSplit("잔소리맞나", "IU", "20240302");
		
		MusicChartSplit mc = new MusicChartSplit(songArray);
		mc.printMusicChartSplit();
		
	}

}
