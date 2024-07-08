package ch12._15menu;


public class Coffee extends Menu{
	String wd;

	public String getWd() {
		return wd;
	}

	public void setWd(String wd) {
		this.wd = wd;
	}
	
	public Coffee(String name, int price, String wd) {
		super(name, price);
		this.wd = wd;
	}
	
	public void printInfo() {
		System.out.println("메뉴 : " + name + " | 가격 : " + price + " | 원두 : " + wd + "\n");
	}
}

