package ch06;

public class CarExample239 {

	public static void main(String[] args) {

		Car239 myCar = new Car239();
		
		myCar.setGas(5);
		
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			myCar.run();
		}
		
		System.out.println("gas를주입하세요.");
	}

}
