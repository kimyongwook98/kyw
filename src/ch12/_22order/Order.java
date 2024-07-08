package ch12._22order;

import java.util.List;

public class Order extends Menu{
	
	public String name;
	public int price;
	Menu menu;
	
	public Order(String name, int price) {
		super(name, price);
	}
	
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

	public Order(Menu menu) {
		super(name, price);
	}
	

	
	
	public void printOrder() {
		
		
		System.out.println("==주문서==");
		System.out.println("주문번호 : ");

			
		System.out.println("주문 메뉴수 : ");
		System.out.println("주문액 : " + price);
		System.out.println("주문시간 : ");
	}
	
	
	public void printSummary() {
		System.out.println("==정산==");
		System.out.println("총 주문 건수 : ");
		System.out.println("총 매출: " + "(원)");
	}
}

