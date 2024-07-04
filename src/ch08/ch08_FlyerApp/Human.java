package ch08.ch08_FlyerApp;

public class Human extends Animal{
	
	Human(int age, String name) {
		super(age, name);
	}
	
	@Override
	public void printInfo() {
		System.out.println("나이=" + getAge() + "이름" + getName());
	}
	
	@Override
	public void eat() {
		System.out.println("Human.eat()");
	}
}
