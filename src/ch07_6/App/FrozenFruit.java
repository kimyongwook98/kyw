package ch07_6.App;

public class FrozenFruit extends Fruit {

	public FrozenFruit(String name, int price) {
		super(name, price, "냉동(종이포장)");
		
	}
	
	
	public void printInfo() {
		System.out.println("제품명 : " + name + "가격 : " + price + "포장타입 = " + type );
	}

}
