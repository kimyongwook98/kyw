package ch12._18person;

import java.util.*;

import ch12._14person.Person;


public class PersonApp {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person("Paige", 30));
		set.add(new Person("Paige", 30));
		set.add(new Person("Smith", 20));
		set.add(new Person("Smith", 20));
		set.add(new Person("Tom", 40));
		
	
for (Person person : set) {
	person.printInfo();
}
	
	}
}
