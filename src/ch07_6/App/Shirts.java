package ch07_6.App;

public class Shirts extends Fashion{
	String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public Shirts(String name, int price, String size, String AS) {
		super(name, price, AS);
		this.size = size;
	}
	
	public void printInfo() {
		System.out.println("제품명=" + name + "가격=" + price + "크기" + size + "A/S=" + AS);
	}
}
