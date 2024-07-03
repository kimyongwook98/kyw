package ch07_11;

public class Ade extends Menu {

	String jr;
	
	public Ade(String menu, int price, String jr) {
		super(menu, price);
		this.jr = jr;
	}
	
	public void makeAde() {
		System.out.println("메뉴 : " + menu + " | 가격 : " + price + " | 재료 : " + jr + "\n");
	}
}
