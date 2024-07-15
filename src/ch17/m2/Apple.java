package ch17.m2;

public class Apple {

	Color color;
	private int weight;
	
	public Apple(int weight, Color color) {
		this.color = color;
		this.weight = weight;
	}
	
	
	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}

	enum Color {
		RED,
		GREEN
	}




	public void printInfo() {
		System.out.println("컬러 =" + color + "무게= " + getWeight());
	}
}
