package ch08.ch08_FlyerApp;

public class SuperMan extends Human implements Flyer{
	
	
	
	
	SuperMan(int age, String name) {
		super(age, name);
	}
	
	@Override
	public void printInfo() {
		System.out.println("나이=" + getAge() + "이름" + getName());
	}
	
	
	
	public void eat(){
		System.out.println("Human.eat()");
	}
	public void takeOff(){
		System.out.println("Human.takeOff()");
	}
	public void land(){
		System.out.println("Human.land()");
	}
	public void fly(){
		System.out.println("Human.fly()");
	}
}
