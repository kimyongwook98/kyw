package ch06_2;

public class CalculatorApp2 {

	public static void main(String[] args) {
		
		Calculator2 cal = new Calculator2(10, 6);
		
		cal.plus();
		cal.minus();
		cal.multiply();
		cal.divide();
		cal.rest();
		
		System.out.println("-printInfo()-");
		cal.printInfo();
		
		
		System.out.println("-clear()-");
		cal.clear();
		
		System.out.println("-printInfo()-");
		cal.printInfo();

	}

}
