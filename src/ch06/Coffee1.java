package ch06;

public class Coffee1 {
	String coffeeName;
	int price;
	String note;
	
	public String getCoffeeName() {
		return coffeeName;
	}
	
	public void setCoffeeName(String newCoffeeName) {
		coffeeName = newCoffeeName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String newNote) {
		note = newNote;
	}
	
	public void printInfo() {
		System.out.println("커피= " + coffeeName);
		System.out.println("가격= " + price);
	}
	
	
	
	
}
