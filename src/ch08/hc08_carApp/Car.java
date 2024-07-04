package ch08.hc08_carApp;

public abstract class Car {
	private String name;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Car(String name) {
		this.name = name;
	}
	
	
	
	public abstract void getOn();
	public abstract void getOff();
	public abstract void load();
	public abstract void unload();
	
}
