package ch06_2;

public class Car_static {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
		Car_static myCar = new Car_static();
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simulate();
	
		Car_static myCar = new Car_static();
		
		myCar.speed = 60;
		myCar.run();
	}
	
	

}
