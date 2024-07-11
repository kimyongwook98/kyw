package ch16.m6;

public class App {

	public static void main(String[] args) {
		System.out.println("==익명객체==");
		ISayable sayable0 = new ISayable() {
			@Override
			public void sayHello() {
				System.out.println("Hello");
			}
		};
		sayable0.sayHello();

		
		System.out.println("==람다==");
		System.out.println("===타입1===");
		
		ISayable sayable1 = () -> {
			System.out.println("웰컴");
		};
				
		sayable1.sayHello();
		
		
		
		System.out.println("===타입2===");
		
		
		ISayable sayable2 = () -> French.greeting(); 
		sayable2.sayHello();
		
		
		System.out.println("===타입3===");
		ISayable sayable3 = French :: greeting;
		sayable3.sayHello();
	}

}
