package ch14.ex2;

public class App {

	public static void main(String[] args) {
		System.out.println("==main() start==");
		
		Task task = new Task();
		task.biz();
		
		for (int i = 0; i < 3000; i++) {
			System.out.print("|");
		}
		
		System.out.println("\n==main() end==");

	}

}
