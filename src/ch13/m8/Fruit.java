package ch13.m8;

public abstract class Fruit extends Product {
	Fruit (String name, int price) {
		super(name, price);
	}
	
	
	
	public void printInfo() {
		System.out.println("제품명=" + name + "가격=" + price);
	}
}