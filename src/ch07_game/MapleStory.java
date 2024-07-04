package ch07_game;

public class MapleStory extends Game{

	public MapleStory(String id) {
		super(id);
	}
	
	public void connect() {
		System.out.println(getId() + "메이플스토리 접속중");
		System.out.println(getId() + "메이플스토리 접속완");
		System.out.println("호ㅘㄴ영해");
	}
	
	public void play() {
		System.out.println(getId() + "메이플스토리 게임 시작");
	}
}
