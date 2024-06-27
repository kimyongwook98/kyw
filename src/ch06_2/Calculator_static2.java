package ch06_2;

public class Calculator_static2 {
	static double pi = 3.14159;
	
	private int val1;
	private int val2;
	
	Calculator_static2() {
		this(0, 0);
	}
	
	Calculator_static2(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	
	
	public static void plus(int val1, int val2) {
		int result = val1 + val2;
		System.out.println("plus()::" + result);
	}
	
	public static void minus(int val1, int val2) {
		int result = val1 - val2;
		System.out.println("minus()::" + result);
	}
	
	public static void multiply(int val1, int val2) {
		int result = val1 * val2;
		System.out.println("multiply()::" + result);
	}
	
	public static void divide(int val1, int val2) {
		int result = val1 / val2;
		System.out.println("divide()::" + result);
	}
	
	public static void rest(int val1, int val2) {
		int result = val1 % val2;
		System.out.println("rest()::" + result);
	}
}
