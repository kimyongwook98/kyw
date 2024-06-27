package ch06;

public class Biz {
	
	private int age;
	private int height;
	private int month;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age < 0) {
			age = 0;
		}
		this.age = age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		if (height < 0) {
			height = 0;
		}
		this.height = height;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if (month != 3) {
			month = 1;
		}
		this.month = month;
	}
}
