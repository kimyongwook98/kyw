package ch05;

public class Movie {
	private String title;
	private String category;
	private String director;
	private int runningTime;
	private String[] actorArray;

	public String[] getActorArray() {
		return actorArray;
	}
	
	public void setActorArray(String[] actorArray) {
		this.actorArray = actorArray;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getRunningTime() {
		return runningTime;
	}
	
    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

	public Movie() {}
	
	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	public Movie(String title, String category, String director, int runningTime, String[] actorArray) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actorArray = actorArray;
	}
	
	public void printInfo() {
		System.out.println("제목:" + title);
		System.out.println("카테고리:" + category);
		System.out.println("감독:" + director);
		System.out.println("상영시간:" + runningTime);
		System.out.print("배우:");
		for (int i = 0; i < actorArray.length-1; i++) {
			System.out.print(actorArray[i] + ",");
		}
		for (int i = actorArray.length-1; i < actorArray.length; i++) {
			System.out.print(actorArray[i]);
		}
	}
}


