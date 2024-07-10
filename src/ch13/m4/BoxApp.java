package ch13.m4;

import ch07_9.Inheritance_Person_Student_Teacher.Person;

public class BoxApp {

	public static void main(String[] args) {
		System.out.println("==Box<Integer>==");
		Box<Integer> integerBox = new Box<>();
		
		integerBox.printInfo(Integer.valueOf(10));
		integerBox.printInfo(20);
		//integerBox.printInfo(new String("hello"));
		
		
		System.out.println("\n==제네릭메소드==");
		integerBox.printInfoGeneric(Integer.valueOf(10));
		integerBox.printInfoGeneric(Double.valueOf(20.2));
		integerBox.printInfoGeneric(new String("hello"));
		integerBox.printInfoGeneric(new Person("James", 30));
	}

}
