package ch06_2;

public class Coffee {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	Coffee() {
	}
	
	Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("커피명: " + name);
		System.out.println("price: " + price);
		
	}
}
