package ch06_3;

public class Car_2 {
	private String model;
	private String color;
	private String type;
	private Company company;
	
	public Car_2(String model, String color, String type, Company company) {
		this.model = model;
		this.color = color;
		this.type = type;
		this.company = company;
	}
	
	public void printInfo() {
		System.out.println("모델 :" + model + "| 색상: " + color + "| 타입 : " + type);
		company.printInfo();
	}
	
	
}
