package ch06_2;

public class UserApp {

	public static void main(String[] args) {
		
		System.out.println("=object1=");
		User u1 = new User();
		u1.setName("james");
		u1.setAge(30);
		u1.setHeight(178.5F);
		u1.setSex('M');
		u1.setMarriageYn(true);
		u1.printInfo();
		
		System.out.println("=object2=");
		User u2 = new User("Paige", 25, 'W');
		u2.setHeight(175.2F);
		u2.setMarriageYn(false);
		u2.printInfo();
		
		 System.out.println("=object3=");
		 User u3 = new User("Victoria", 30, 180.0f, 'W',  false);
		 u3.printInfo();

	}

}
