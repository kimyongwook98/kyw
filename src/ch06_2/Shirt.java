package ch06_2;

public class Shirt {

	private String name;
	private String color;
	private String company;
	private String size;
	private int price;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	Shirt() {}
	
	Shirt(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	Shirt(String name, String color, String company, String size, int price) {
		this.name = name;
		this.color = color;
		this.company = company;
		this.size = size;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("컬러 : " + color);
		System.out.println("회사 : " + company);
		System.out.println("사이즈 : " + size);
		System.out.println("가격 : "+ price);
	}
}
