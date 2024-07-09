package ch11.thrws3;


public class App {

	public static void main(String args[]) {
		System.out.println("App.main()::Start");
		
		Control c = new Control();
		c.method();
		
		System.out.println("App.main()::End");

	}

}