package ch13.m3;

public class PlayerApp {
	public static void main(String[] args) {
		System.out.println("==BaseballPlayer==");
		BaseballPlayer baseballPlayer = new BaseballPlayer();
		baseballPlayer.set(new Baseball());
		baseballPlayer.run();
		baseballPlayer.stop();
		
		System.out.println("\n==FootballPlayer==");
		FootballPlayer footballPlayer = new FootballPlayer();
		footballPlayer.set(new Football());
		footballPlayer.run();
		footballPlayer.stop();
	}
}
