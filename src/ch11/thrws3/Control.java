package ch11.thrws3;


public class Control {

	public void method() {
		System.out.println("\tControl.method()::Start");
		
		try {
			Service s = new Service();
			s.method();
		}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println("캐치");
			} finally {
				System.out.println("파이널");
			}
				
		
		
		System.out.println("\tControl.method()::End");
	}

}
