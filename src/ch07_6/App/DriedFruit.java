package ch07_6.App;

public class DriedFruit extends Fruit {
	
	public DriedFruit(String name, int price) {
		super(name, price, "상온(냉동포장)");
		
	}
	
	public DriedFruit(String name, int price, String type) {
		super(name, price);
		this.type = type;
		
	}
	
	
	public void printInfo() {
		System.out.println("제품명 : " + name + "가격 : " + price + "포장타입 = " + type );
	}

}






