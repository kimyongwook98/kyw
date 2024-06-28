package ch06_3;

public class Song {
	private String title;
	private String releaseDate;
	private Singer singer;
	
	public Song(String title, Singer singer, String releaseDate) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.singer = singer;
	}
	
	public void printInfo() {
		System.out.println("제목 =" + title + "| 발매일" + releaseDate);
		singer.printInfo();
	}
}
