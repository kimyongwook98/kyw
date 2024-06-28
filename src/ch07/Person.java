package ch07;

public class Person {
	private float height;
	private char sex;
	private boolean marriageYn;
	private String name;
	private int age;

	
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



	public float getHeight() {
		return height;
	}



	public void setHeight(float height) {
		this.height = height;
	}



	public char getSex() {
		return sex;
	}



	public void setSex(char sex) {
		this.sex = sex;
	}



	public boolean isMarriageYn() {
		return marriageYn;
	}



	public void setMarriageYn(boolean marriageYn) {
		this.marriageYn = marriageYn;
	}

	public Person() {}
	
	public Person(String name ,int age) {
		this.name = name;
		this.age = age;
	}

	public void printInfo() {
		System.out.println("이름 : "+ name + "나이 : " + age);
	}
	
}
