package ch13.m1;

public class AppleBox implements IBox<Apple>{
	private Apple apple;
	
	@Override
	public Apple get() {
		return apple;
	}
	
	@Override
	public void set(Apple apple) {
		this.apple = apple;
	}
}
