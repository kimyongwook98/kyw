package ch06_2;

public class Calculator {
	
	public void plus(int val1, int val2) {
		int result1 = val1 + val2;
		System.out.println("plus()::" + result1);
	}
	
	double minus(int val1, int val2) {
		return val1 - val2;
	}
	
	double multiply(int val1, int val2) {
		return val1 * val2;
	}
	
	double divide(int val1, int val2) {
		return val1 / val2;
	}
	
	double rest(int val1, int val2) {
		return val1 % val2;
	}
	
	
}
