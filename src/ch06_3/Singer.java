package ch06_3;

public class Singer {
	private String name;
	private char sex;
	private String birthDate;
	private String companyt;
	
	
	public Singer(String name, char sex, String birthDate, String companyt) {
		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
		this.companyt = companyt;
	}
	
	public void printInfo() {
		System.out.println("이름= " + name + "| 성별= " + sex + "| 생년월일=" + birthDate + "| 소속사=" + companyt );
	}
}
