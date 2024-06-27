package ch04;

public class HakjumSwitchApp {

	public static void main(String[] args) {
		int kor = 38;
		int eng = 92;
		int math = 100;
		
		int avg = (kor + eng + math) / 3;
		
		switch(avg / 10) {
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			default :
				System.out.println("C");
		}
	}

}
