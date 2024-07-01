package ch05;

public class MusicChartApp {

	public static void main(String[] args) {
		
		Song[] songArray = new Song[3];
		songArray[0] = new Song("불타오르네", "BTS", "20160502");
		songArray[1] = new Song("밤편지", "아이유", "20131212");
		songArray[2] = new Song("잔소리맞나", "IU", "20240302");
		
		MusicChart mc = new MusicChart(songArray);
		mc.printMusicChart();
	}

}
