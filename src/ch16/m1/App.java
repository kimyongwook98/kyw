package ch16.m1;

public class App {

	public static void main(String[] args) {
		System.out.println("==anonymous==");
		
		ISayable sayable = new ISayable() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello");
			}
		};
		sayable.sayHello();
		
		System.out.println("\n==lambda==");
		
		System.out.println("==type1==");
		// 실행문 1개
		
		ISayable sayable1 = () -> {
			System.out.println("Hello");
		};
		sayable1.sayHello();
		
		
		System.out.println("\n==type2==");
		// 실행문 1개, 중괄호 삭제
		
		ISayable sayable2 = () -> System.out.println("Hello");
		sayable2.sayHello();
		
		System.out.println("\n==type2==");
		// 실행문 2개
		ISayable sayable3 = () -> {
			System.out.println("Hello");
			System.out.println("Welcome");
		};
		sayable3.sayHello();
		
	}

}
