package ch12._22order;
import java.text.NumberFormat;
public class Menu {
	String name;
	int price;
	
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
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("메뉴 : " + name + " | 가격 : " + formatCurrency(price) + "\n");
	}
	protected String formatCurrency(int amount) {
        return NumberFormat.getNumberInstance().format(amount);
    }
}