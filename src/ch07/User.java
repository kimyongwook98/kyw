package ch07;

public class User {
	private String name;
	private int age;
	private double height;
	private char sex;
	private boolean marriageYn;
	
	User () {}
	
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
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
	
	
	public User (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public User (String name, int age, double height, char sex, boolean marriageYn) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.sex = sex;
		this.marriageYn = marriageYn;
	}
	
	
	public void printInfo() {
		System.out.println("이름:" + name + "나이:" + age + "키:" + height + "성별:" + sex + "결혼여부:" + marriageYn);
	}
	
}
