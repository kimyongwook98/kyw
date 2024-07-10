package ch13.m8;

public class DriedFruit extends Fruit {
	
	String jr;
	
	DriedFruit (String name, int price) {
		super(name, price);
	}
	
	DriedFruit (String name, int price, String jr) {
		super(name, price);
		this.jr = jr;
	}
	
	
	@Override
	public void printInfo() {
		System.out.println("제품명=" + name + "가격=" + price + "보관=" + jr);
	}
}
