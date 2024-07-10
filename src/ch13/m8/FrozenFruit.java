package ch13.m8;


public class FrozenFruit extends Fruit {

	FrozenFruit (String name, int price) {
		super(name, price);
	}
	
	
	@Override
	public void printInfo() {
		System.out.println("제품명=" + name + "가격=" + price);
	}

}

