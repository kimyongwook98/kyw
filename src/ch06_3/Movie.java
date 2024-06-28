package ch06_3;

public class Movie {
	private String title;
	private String category;
	private String director;
	private int runningTime;
	private Actor actor;
    
    
	public Movie(String title, String category, String director, int runningTime, Actor actor) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actor = actor;
	}
	
	
    public void printInfo() {
    	System.out.println("제목= " + title);
    	System.out.println("카테고리= " + category);
    	System.out.println("감독= " + director);
    	System.out.println("상영시간= " + runningTime);
    	actor.printInfo();
    	    }
}
