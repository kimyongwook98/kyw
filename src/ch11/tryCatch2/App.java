package ch11.tryCatch2;

public class App {
	public static void main(String[] args) {
		
		try {
			System.out.println("--Object1--");
			String string1 = "Hello";
			System.out.println(string1.charAt(1));
			
			System.out.println("\n--object2--");
			String string2 ="";
			System.out.println(string2.charAt(1));
		}
		catch (StringIndexOutOfBoundsException e){
			System.out.println("\n--catch--");
		}
		finally {
			System.out.println("--finally--");
		}
		
	}
}
