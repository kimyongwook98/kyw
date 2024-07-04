package ch08.hc08_carApp;

public class Truck extends Car implements TruckModel{

	
	public Truck(String name) {
		super(name);
	}

	
	@Override
	public void getOn() {
	
	}
	
	@Override
	public void getOff() {
		
	}
	
	@Override
	public void load() {
		System.out.println(getName() + "에 짐을 싣다.");
	}
	
	@Override
	public void unload() {
		System.out.println(getName() + "에 짐을 내리다.");
	}
}
