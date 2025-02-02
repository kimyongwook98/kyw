package ch17.ex1;

import java.util.Set;
import java.util.stream.Stream;
import java.util.HashSet;
import java.util.Iterator;

public class StreamExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("감자바");
	
		Stream<String> stream = set.stream();
		stream.forEach( name -> System.out.println(name));
	}

}
