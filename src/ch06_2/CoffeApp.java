package ch06_2;

public class CoffeApp {

	public static void main(String[] args) {
		
		System.out.println("-object1-");
		Coffee coffee1 = new Coffee();
		coffee1.setName("아메리카노");
		coffee1.setPrice(4000);
		coffee1.printInfo();
		
		System.out.println("-object2-");
		Coffee coffee2 = new Coffee("카푸치노", 5000);
		coffee2.printInfo();

	}

}
