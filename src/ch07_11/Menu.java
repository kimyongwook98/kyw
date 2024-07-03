package ch07_11;

public class Menu {
	String menu;
	int price;
	Menu[] menuArray;

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	public Menu(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("메뉴=" + menu + "가격=" + price);
	}
	
}
