package ch11.thrws2.App;

public class App {

	public static void main(String args[]) {
		System.out.println("App.main()::Start");
		
		Control c = new Control();
		c.method();
		
		System.out.println("App.main()::End");

	}

}