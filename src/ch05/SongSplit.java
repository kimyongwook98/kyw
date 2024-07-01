package ch05;

public class SongSplit {
	private String title;
	private String releaseDate;
	private String singer;
	
	public SongSplit(String title, String singer, String releaseDate) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.singer = singer;
	}
	
	String firstNum = releaseDate.substring(0,4); 
	String secondNum = releaseDate.substring(4,6);
	String thirdNum = releaseDate.substring(6,8); 
	
	
	
	public void printInfo() {
		
			System.out.println( "제목=" + title + "| 가수= " + singer + "| 발매일=" + firstNum);
			System.out.println( "제목=" + title + "| 가수= " + singer + "| 발매일=" + secondNum);
			System.out.println( "제목=" + title + "| 가수= " + singer + "| 발매일=" + thirdNum);
	  
	    }
	}
