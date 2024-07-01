package ch05;

public class WeekIntent {

	public static void main(String[] args) {
		
		String dayString = "일,월,화,수,목,금,토";
		
		String[] tokens = dayString.split(",");
		

		
		for(int i = 0; i < tokens.length; i++) {
     
            for(int j = 0; j < i; j++) {
                System.out.print("\t");
            }
    
            System.out.println(tokens[i]);
        }
		
	}

}
