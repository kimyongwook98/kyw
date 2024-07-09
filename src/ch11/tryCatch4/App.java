package ch11.tryCatch4;

public class App {
	public static void main(String[] args) {
		
		
		
		try {
			System.out.println("=object1=");
			String string1 = "Hello";
			System.out.println(Integer.parseInt(string1));
			
			System.out.println("=object2=");
			String string2 = "World";
			System.out.println(Integer.parseInt(string2));	
		}
		catch (NumberFormatException e) {
			System.out.println("\n--catch--");
		}
		finally {
			System.out.println("--finally--");
		}
		
		
	}
}
