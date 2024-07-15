package ch04.m3;

public class Person {
	private String id;
	private String name;
	private String age;
	private String sex;
	
	public Person(String id, String name, String age, String sex) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Person() {};
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public void printInfo() {
		System.out.println("아이디=" + getId() + "| 이름 : " + getName() + " | 나이 : " + getAge() + "|" + getSex() );
		
	}
}