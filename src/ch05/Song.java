package ch05;

public class Song {
	private String title;
	private String releaseDate;
	private String singer;
	
	public Song(String title, String singer, String releaseDate) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.singer = singer;
	}
	
	public String toString() {
	     return "제목 =" + title + "가수 = " + singer + "발매일" + releaseDate;
	    }
}
