package ch08;

public class Television implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("티비를켭니다");
	}
}
