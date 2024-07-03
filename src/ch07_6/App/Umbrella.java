package ch07_6.App;

public class Umbrella extends Fashion {
	int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Umbrella(String name, int price, int weight, String AS) {
		super(name, price, AS);
		this.weight = weight;
	}
	
	
	public void printInfo() {
		System.out.println("제품명=" + name + "가격=" + price + "크기" + weight + "A/S=" + AS);
	}
}
