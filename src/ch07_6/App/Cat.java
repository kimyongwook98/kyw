package ch07_6.App;

public class Cat extends Animal {
	
	int legs;
	
	
	
	
	public int getLegs() {
		return legs;
	}





	public Cat(String name, int age, String sex, int legs) {
		super("고양이", name, age, sex);
		this.legs = legs;
	}


	
	public void printInfo() {
		System.out.print("동물 : " + animal + "이름 : " + name + "나이 : " + age);
		if (sex == "F") {
			System.out.print("| 성별 : 여");
		} else if (sex == "M") {
			System.out.print("| 성별 : 남");
		}
		System.out.print("다리 : " + legs + "(개)");
	}

	public void sleep() {
		System.out.println("");
	}
}








