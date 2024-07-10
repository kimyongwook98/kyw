package ch13.m2;

public class Box<T> implements IBox<T>{
	private T data;
	
	
	@Override
	public T get() {
		return data;
	
	}
	
	@Override
	public void set(T t) {
		this.data = t;
	}
}
