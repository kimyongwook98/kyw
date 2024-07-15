package ch17.m1;

import java.util.ArrayList;
import java.util.List;


public class StreamPersonApp {
	public static void main(String[] args) {
		System.out.println("==List<PERSON>==");
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Paige", 20));
		list.add(new Person("James", 30));
		list.add(new Person("Smith", 40));
		list.add(new Person("Tom", 50));
		list.add(new Person("Victoria", 60));
		for (Person p : list) {
			p.printInfo();
		}
		
		
		System.out.println("\n==이름:제임스==");
		list.stream()
		
		.filter(p -> p.getName() == ("James"))
		.forEach(p -> p.printInfo());
		System.out.println();
		
		System.out.println("\n==나이:50세이상==");
		list.stream()
		
		.filter(p -> p.getAge() >= 50)
		.forEach(p -> p.printInfo());
		System.out.println();
		
		
		
		System.out.println("\n==이름에a가있고 , 나이가 60세미만==");
		list.stream()
		
		.filter(p -> p.getAge() < 60 && p.getName().contains("a"))
		.forEach(p -> p.printInfo());
		System.out.println();
		
		
	}
}
