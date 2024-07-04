package ch08.hc08_carApp;

public class Sedan extends Car implements PassengerModel{

	public Sedan(String name) {
		super(name);
	}
	
	
	@Override
	public void load() {
		
	}
	
	@Override
	public void unload() {
	
	}
	
	
	@Override
	public void getOn() {
		System.out.println(getName() + "에 타다.");
	}
	
	@Override
	public void getOff() {
		System.out.println(getName() + "에서 내리다.");
	}
	
	
}
