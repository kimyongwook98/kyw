package ch05;



public class Order {
	Menu[] order;
	int price;
	
	public Menu[] getMenuArray() {
		return order;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setMenuArray(Menu[] order) {
		this.order = order;
	}
	
	
	public Order (Menu[] order) {
		this.order = order;
	}
	
	public void printInfo() {
		System.out.println("=[영수증]=");
		System.out.println("-주문시간-");
		
		
	    System.out.println(DateUtil.getLocalDateTimeDash());
	    
		for (int i = 0; i < order.length; i++) { 
			order[i].printInfo();
		}
		System.out.println("-주문금액합계-");
		int total = 0;
		for (int i = 0; i < order.length; i++) {
			int price = order[i].getPrice();
			total = total + price;
		}
		System.out.println(DecimalUtil.decimalComma(total) + "(원)");

	}
}
