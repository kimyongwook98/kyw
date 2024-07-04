package ch08.ch08_FlyerApp;

public class Airplane implements Flyer, Transport{
	
	Airplane(){}
	
	
	public void load(){
		System.out.println("Human.load()");
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
	public void unload(){
		System.out.println("Human.unload()");
	}

}
