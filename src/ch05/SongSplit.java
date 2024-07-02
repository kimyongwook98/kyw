package ch05;

public class SongSplit {
	private String title;
	private String releaseDate;
	private String singer;
	SongSplit[] songArray;
	
	public SongSplit[] getSongArray() {
		return songArray;
	}
	
	public void setSongArray(SongSplit[] songArray) {
		this.songArray = songArray;
	}
	
	public SongSplit(String title, String singer, String releaseDate) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.singer = singer;
	}
	
	
	
	
	public void printInfo() {
			
		String firstNum = releaseDate.substring(0,4); 
		String secondNum = releaseDate.substring(4,6);
		String thirdNum = releaseDate.substring(6,8); 
		
			System.out.println( "제목=" + title + "| 가수= " + singer + "| 발매일=" + firstNum + "." + secondNum + "." + thirdNum);

	  
	    }
	}
