package ch13.m4;

public class Box<T> {
	public void printInfo(T t) {
		System.out.println("printInfo(T t) :: t =" + t + "| 클래스=" + t.getClass().getSimpleName());
	}
	
	public <T> void printInfoGeneric(T t) {
		System.out.println("printInfoGeneric(T t) :: t=" + t + " | 클래스=" + t.getClass().getSimpleName());
	}
}
