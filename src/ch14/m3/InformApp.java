package ch14.m3;

public class InformApp {
	public static void main(String[] args) {
		User1Thread user1Thread = new User1Thread();
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.start();
	}
	
}

