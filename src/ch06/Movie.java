package ch06;

public class Movie {
	
	String title;
	String category;
	String director;
	int runningTime;
	
	
	public void printInfo() {
		System.out.println("title=" + title);
		System.out.println("category=" + category);
		System.out.println("director=" + director);
		System.out.println("runningTime=" + runningTime + "\n");
		}
}
