package ch06;

public class CalculatorExample243 {
	public static void main(String[] args) {
		Calculator242 myCalcu = new Calculator242();
		
		double result1 = myCalcu.areaRectangle(10);
		
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
		
	}
}
