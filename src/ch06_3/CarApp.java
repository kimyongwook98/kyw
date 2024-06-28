package ch06_3;

public class CarApp {
	public static void main(String[] args) {
		System.out.println("-CompanyInfo-");
		String name = "Hyundai";
		String biz = "자동차";
		Company company = new Company(name,biz);
		company.printInfo();
		
		System.out.println("\n-CarInfo-");
		String model="Santafe";
		String color="White";
		String type = "SUV";
		Car_2 car = new Car_2(model, color, type, company);
		car.printInfo();
	}
	
	
}
