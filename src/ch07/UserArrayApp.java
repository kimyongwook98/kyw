package ch07;

public class UserArrayApp {

	public static void main(String[] args) {
		
		
		
		
		User[] userArray;
		
		userArray = new User[3];
		
		userArray[0] = new User();
	    userArray[0].setName("James");
	    userArray[0].setAge(25);
	    userArray[0].setHeight(182.5);
	    userArray[0].setSex('M');
	    userArray[0].setMarriageYn(true);
	    
	    userArray[1] = new User("Sophia", 30, 178.2, 'F', false);
	    	
	    User u = new User("Archer", 35, 175.3, 'M', false);
	    userArray[2] = u;
	    
	    System.out.println("-for()-");
	    for (int i = 0; i < userArray.length; i++) {
	    	System.out.print("userArray [" + i + "]");
	    	userArray[i].printInfo();
	    }
	    
	    
	}

}
