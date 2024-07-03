package ch07_6.App;

public class Fruit extends Product {

	String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Fruit(String name, int price) {
		super(name, price);
	}
	
	public Fruit(String name, int price, String type) {
		super(name, price);
		this.type = type;
	}
	
	public void printInfo() {
		System.out.println("메뉴 : " + name + " | 가격 : " + price + " | 포장타입 : " + type + "\n");
	}

}
