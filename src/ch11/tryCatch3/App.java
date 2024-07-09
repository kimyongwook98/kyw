package ch11.tryCatch3;

public class App {
	public static void main(String[] args) {
		try {
			Person p = null;
			String name = p.getName();
			System.out.println("이름 : " + name);
		}
		catch (NullPointerException e){
			System.out.println("\n--catch--");
		}
		finally {
			System.out.println("--finally--");
		}
		
	}
}
