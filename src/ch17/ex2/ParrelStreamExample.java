package ch17.ex2;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

public class ParrelStreamExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		Stream<String> parrelStream = list.parallelStream();
		parrelStream.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});
	}

}
