package ch07_2;

public class SmartPhone extends Phone {
	public SmartPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String Color)생성자 실행됨");
	}
}
