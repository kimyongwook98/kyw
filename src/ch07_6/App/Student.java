package ch07_6.App;

public class Student extends Person {

	private String hakbun;

	public Student() {
	}

	public Student(String name, int age, String hakbun) {
		super(name, age);
		this.hakbun = hakbun;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	
	public void printInfo() {
		System.out.println("이름 :" + name + "나이 : " + age + "학번 : " + hakbun );
		
		
	}

}