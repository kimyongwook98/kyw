package ch07_6.App;

public class Animal {
	String animal;
	String name;
	int age;
	String sex;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
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
	
	

	
	 Animal(String animal, String name, int age, String sex) {
		this.animal = animal;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	
	public void printInfo() {
		System.out.print("동물 : " + animal + "이름 : " + name + "나이 : " + age);
		if (sex == "F") {
			System.out.println("| 성별 : 여");
		} else if (sex == "M") {
			System.out.println("| 성별 : 남");
		}
	}
}
