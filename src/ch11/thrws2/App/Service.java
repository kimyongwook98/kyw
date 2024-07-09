package ch11.thrws2.App;

public class Service {
	
	public void method(){		
		System.out.println("\t\tService.method()::Start");
		
		
		try {
		String[] stringArray = new String[3];
		stringArray[0] = "A";
		stringArray[1] = "B";
		stringArray[2] = "C";
		
			for (int i = 0; i < 4; i++) {
				System.out.println("\t\tstringArray[" + i + "]=" + stringArray[i]);
			}
		}	catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("캐치캐치");
			}
			finally {
				System.out.println("finally" );
			}

		

		
		System.out.println("\t\tService.method()::End");
		
	}

}
