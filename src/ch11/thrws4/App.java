package ch11.thrws4;


public class App {

	public static void main(String args[]) {
		System.out.println("App.main()::Start");
		try {
			Control c = new Control();
			c.method();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\tㅡㅡcatch:Main.main()ㅡㅡ");
		} finally {
			System.out.println("\tㅡㅡfinㅡㅡ");
		}
		
		
		System.out.println("App.main()::End");

	}

}