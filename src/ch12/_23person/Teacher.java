package ch12._23person;

public class Teacher extends Person {
	
	String subject;
	
	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	@Override
	public void printInfo() {
		System.out.println("이름=" + getName() + "나이=" + getAge() + "과목=" + subject);
	}
}
