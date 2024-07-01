package ch05;



public class Menu {
	String name;
	int price;
	private Menu[] order;
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public Menu[] getMenuArray() {
		return order;
	}




	public void setMenuArray(Menu[] order) {
		this.order = order;
	}




	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	
	
	
	public void printInfo() {
	     System.out.println("메뉴 : " + name + "가격 :" + price);
	
	    }
	
}
