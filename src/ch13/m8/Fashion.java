package ch13.m8;

public abstract class Fashion extends Product{
	String as;
	
	
	
	Fashion(String name, int price) {
		super(name, price);
	}
	
	
	public String getAs() {
		return as;
	}

	public void setAs(String as) {
		this.as = as;
	}
	
	public void printInfo() {
		System.out.println("제품명=" + name + "가격=" + price + "A/S=" + as);
	}
}
