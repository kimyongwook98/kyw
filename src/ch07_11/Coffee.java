package ch07_11;

public class Coffee extends Menu {

	String wd;
	
	public Coffee(String menu, int price, String wd) {
		super(menu, price);
		this.wd = wd;
	}
	
	public void makeCoffee() {
		System.out.println("메뉴 : " + menu + " | 가격 : " + price + " | 재료 : " + wd + "\n");
	}
}
