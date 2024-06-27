package ch06_2;

public class CarExample_this {

	public static void main(String[] args) {
		Car_this car1 = new Car_this("자가용");
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model :" + car1.model);
		//System.out.println("car1.maxSpeed :" + car1.maxSpeed);
		System.out.println();
		
		Car_this car2 = new Car_this("자가용", "빨강");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model :" + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println();
		
		Car_this car3 = new Car_this("택시", "검정", 200);
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model :" + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println();
		

		
		

	}

}
