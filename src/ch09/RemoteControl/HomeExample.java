package ch09.RemoteControl;

public class HomeExample {
	public static void main(String[] args) {
		Home home = new Home();
		
		home.use1();
		
		home.use2();
		
		home.use3(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("난방 켭니다");
			}
			@Override
			public void turnOff() {
				System.out.println("난방 끕니다");
			}
		});
	}
}
