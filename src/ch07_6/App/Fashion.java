package ch07_6.App;

public class Fashion extends Product {
	String AS;

	public String getAS() {
		return AS;
	}

	public void setAS(String aS) {
		AS = aS;
	} 
	
	public Fashion(String name, int price, String AS) {
		super(name,price);
		this.AS = AS;
	}
}
