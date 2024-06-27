package ch06;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "999999-1111111");
		
		System.out.println("k1.nation:" + k1.nation);
		System.out.println("k1.ssn:" + k1.ssn);
		System.out.println("k1.name:" + k1.name);
		System.out.println();
		
		Korean k2 = new Korean("김자바", "8888888-2222222");
		
		System.out.println("k2.nation:" + k2.nation);
		System.out.println("k2.ssn:" + k2.ssn);
		System.out.println("k2.name:" + k2.name);
	}

}
