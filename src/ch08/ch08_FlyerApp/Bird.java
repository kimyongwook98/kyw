package ch08.ch08_FlyerApp;

public class Bird extends Animal implements Flyer{
	
	int wings;
	
	Bird(int age, int wings){
		super(age);
		this.wings = wings;
	}
	
	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	@Override
	public void printInfo() {
		System.out.println("나이=" + getAge() + "날개수=" + getWings());
	}

	public void eat() {
		System.out.println("Bird.eat()");
	}
	public void takeOff(){
		System.out.println("Bird.takeOff()");
	}
	public void land(){
		System.out.println("Bird.land()");
	}
	public void fly(){
		System.out.println("Bird.fly()");
	}
}
