package ch12._23person;

import java.util.Map;
import java.util.HashMap;


public class PersonApp {
	public static void main(String[] args) {
		System.out.println("==클래스==");
		Person p = new Person("Kim", 20);
		p.printInfo();
		
		Person s = new Student("Smith", 25, "2024-001");
		s.printInfo();
		
		Person t = new Teacher("Tom", 30, "Music");
		t.printInfo();
		
		System.out.println("\n==Map==");
		Map<String, Person> personMap2 = new HashMap<String, Person>();
		
		personMap2.put("s1", s);
		personMap2.put("s2", new Student("Susan", 28, "2024-002"));
		personMap2.put("t1", t);
		personMap2.put("t2", new Teacher("Tiffany", 32, "Art"));
		
		
		
		for (String key: personMap2.keySet()) {
			Person value = personMap2.get(key);
			if (key.contains("s")) 
			System.out.println("[학생]:" + key + ", Value:" + value);	
			else
			System.out.println("[교수]:" + key + ", Value:" + value);	
		}

	}
}
