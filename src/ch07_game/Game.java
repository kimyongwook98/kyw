package ch07_game;

public abstract class Game {
	private String id;

	public Game(String id) {
		this.id = id;
	}
	

	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public abstract void connect();
	
	public abstract void play();
}
