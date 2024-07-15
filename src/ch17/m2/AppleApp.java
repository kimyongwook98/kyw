package ch17.m2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ch17.m2.Apple.Color;

public class AppleApp {
	public static void main(String[] args) {
	List<Apple> inventory = Arrays.asList(
			new Apple(200, Color.GREEN),
			new Apple(180, Color.RED),
			new Apple(120, Color.RED),
			new Apple(160, Color.RED),
			new Apple(80, Color.GREEN),
			new Apple(155, Color.GREEN));
			
	System.out.println("==녹색사과(정렬:무게오름차순)==");
	List<Apple> greenApples = null;
	
	greenApples = inventory.stream()
			.filter(apple -> apple.color == Color.GREEN)
			.sorted(Comparator.comparing(Apple::getWeight))
			.collect(Collectors.toList());
	
	
	for(Apple apple : greenApples) {
		apple.printInfo();
	}
	
	System.out.println("\n==빨간사과(정렬:무게내림차순)==");
	List<Apple> redApples=null;
	redApples = inventory.stream()
			.filter(apple -> apple.color == Color.RED)
			.sorted(Comparator.comparing(Apple::getWeight).reversed())
			.collect(Collectors.toList());
	
	
	
	for(Apple apple:redApples) {
		apple.printInfo();
	}
	
	System.out.println("\n==무거운사과(정렬:무게오름차순)==");
	System.out.println("기준:무게150이상");
	List<Apple> heavyApples=null;
	
	
	heavyApples = inventory.stream()
			.filter(apple -> apple.getWeight() >= 150)
			.sorted(Comparator.comparing(Apple::getWeight))
			.collect(Collectors.toList());
	
	for(Apple apple : heavyApples) {
		apple.printInfo();
	}
	
	System.out.println("\n==무거운 빨간 사과(정렬:무게오름차순)==");
	System.out.println("기준:무게150이상");
	List<Apple> redHeavyApples=null;
	
	redHeavyApples = inventory.stream()
			.filter(apple -> apple.color == Color.RED && apple.getWeight() >= 150)
			.sorted(Comparator.comparing(Apple::getWeight))
			.collect(Collectors.toList());
	
	
	for(Apple apple : redHeavyApples) {
		apple.printInfo();
	}
	}
}
