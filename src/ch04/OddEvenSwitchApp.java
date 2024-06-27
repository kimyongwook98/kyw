package ch04;

public class OddEvenSwitchApp {

	public static void main(String[] args) {
		int data = 5;
		int result = data % 2;
		
		switch (result) {
		case 0:
			System.out.println(data + ": 짝수");
		
		default:
			System.out.println(data + ": 홀수");
		}
	}
}
