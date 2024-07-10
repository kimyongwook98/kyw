package ch12._23person;

public class Person {
	private String name;
	private int age;
	private String information;
	
	

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, String information) {
		this.name = name;
		this.age = age;
		this.information = information;
	}
	



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void printInfo() {
		System.out.println("이름=" + name + "나이=" + age);
	}
	
	   @Override
	    public String toString() {
	        return "이름=" + name + " 나이=" + age;
	    }
}
