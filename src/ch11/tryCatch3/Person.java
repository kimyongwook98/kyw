package ch11.tryCatch3;

public class Person {

	private String name;


	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
	
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void printInfo() {
		System.out.print("이름=" + name);
		
	}

}
