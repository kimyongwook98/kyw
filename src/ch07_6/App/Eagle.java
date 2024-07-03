package ch07_6.App;

public class Eagle extends Animal {

	
	int wings;
	
	
	public int getWings() {
		return wings;
	}



	public void setWings(int wings) {
		this.wings = wings;
	}



	public Eagle(String name, int age, String sex, int wings) {
		super("독수리", name, age, sex);
		this.wings = wings;
	}
	
	
	
	public void printInfo() {
		System.out.print("동물 : " + animal + "이름 : " + name + "나이 : " + age);
		if (sex == "F") {
			System.out.print("| 성별 : 여");
		} else if (sex == "M") {
			System.out.print("| 성별 : 남");
		}
		System.out.print("날개 : " + wings + "(개)");
	}

	public void fly() {
		System.out.println("");
	}
}
