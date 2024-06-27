package ch06;

public class MovieExample {

	public static void main(String[] args) {
		Movie m1 = new Movie();
		
		System.out.println("----초기값----");
		m1.printInfo();
		
	
		m1.title ="매버릭";
		m1.category="액션";
		m1.director="조셉 코신스키";
		m1.runningTime=132;				
		
		System.out.println("----값 변경----");
		System.out.println("title=" + m1.title);
		System.out.println("category=" + m1.category);
		System.out.println("director=" + m1.director);
		System.out.println("runningTime=" + m1.runningTime);
	}

}
