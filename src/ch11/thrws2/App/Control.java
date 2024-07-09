package ch11.thrws2.App;

public class Control {

	public void method() {
		System.out.println("\tControl.method()::Start");
		
		Service s = new Service();
		s.method();
		
		System.out.println("\tControl.method()::End");
	}

}
