package ch12._22order;

public class Ade extends Menu{
	String jr;

	public String getJr() {
		return jr;
	}

	public void setJr(String jr) {
		this.jr = jr;
	}
	
	public Ade(String name, int price, String jr) {
		super(name, price);
		this.jr = jr;
	}
	
	public void printInfo() {
		System.out.println("메뉴 : " + name + " | 가격 : " + formatCurrency(price) + " | 재료 : " + jr + "\n");
	}
}