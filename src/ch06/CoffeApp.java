package ch06;

public class CoffeApp {

	public static void main(String[] args) {
		
		Coffee1 c1 = new Coffee1();
		
		c1.setCoffeeName("아메리카노");
		c1.setPrice(2000);
		c1.printInfo();
		
        System.out.println("\n----- printInfo() -----");
        c1.printInfo();

	}

}
