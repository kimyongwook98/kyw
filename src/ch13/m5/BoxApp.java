package ch13.m5;

import ch07_9.Inheritance_Person_Student_Teacher.Person;

public class BoxApp {

	public static void main(String[] args) {
		Box<Person> stringBox = new Box<>();
		
		stringBox.printInfoGeneric("hello", "world");
		stringBox.printInfoGeneric(10, 20);
		stringBox.printInfoGeneric("hello", 20);
		
	}

}

