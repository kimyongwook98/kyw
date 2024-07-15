package ch17.m3;

public class Dish {
	String name;
	String category;
	String vegan;
	int kcal;
	
	public Dish(String name, String category, String vegan, int kcal) {
		this.name = name;
		this.category = category;
		this.vegan = vegan;
		this.kcal = kcal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getVegan() {
		return vegan;
	}
	public void setVegan(String vegan) {
		this.vegan = vegan;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	public void printInfo() {
		System.out.println(name + "|" + category + "|" + vegan + "|" + kcal);
	}
	
}
