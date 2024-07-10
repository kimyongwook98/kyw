package ch13.m8;

public abstract class Shirts extends Fashion{
	String size;

	
	Shirts(String name, int price, String size, String as) {
		this.name = name;
		this.price = price;
		this.size = size;
		this.as=as;
	}
	
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
