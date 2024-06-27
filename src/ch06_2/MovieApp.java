package ch06_2;

public class MovieApp {

	public static void main(String[] args) {
		System.out.println("-object-");
		Movie m1 = new Movie();
		m1.setTitle("탑건:매버릭");
		m1.setCategory("액션");
		m1.setDirector("조셉코신스키");
		m1.setRunningTime(110);
		m1.printInfo();
		
		System.out.println("\n-object2-");
		Movie m2 = new Movie("아바타 물의길", "SF");
		m2.setDirector("제임스 카메룬");
		m2.setRunningTime(192);
		m2.printInfo();
		
		System.out.println("\n-object3-");
		Movie m3 = new Movie("인사이드아웃", "애니메이션", "캘시맨", 96);
		m3.printInfo();

	}

}
