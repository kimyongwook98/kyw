package ch17.m3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;





public class DishBiz {
	
	List<Dish> dishList;
	String category;
	
	public DishBiz(List<Dish> dishList) {
		this.dishList = dishList;
		
	}
	
	public void printAllDishes() {
		System.out.println("==음식전체==");
		System.out.println("------------------------------------------");
		System.out.println("음식 | 종류 | 채식주의자 식사 가능 여부 | 열량(칼로리)");
		System.out.println("------------------------------------------");
		for (Dish d : dishList) {
			d.printInfo();
		}
	}
	public void printMeatDish() {
		System.out.println("==꼬기==");
		
		
		List<Dish> meat = null;
	    
	    meat = dishList.stream()
	            .filter(dish -> dish.category.contains("고기"))
	            .collect(Collectors.toList());
	    
	    for(Dish dish : meat) {
	        dish.printInfo();
	    }
		/*
		List<Dish> meat = null;
		
		meat = dishList.stream()
				.filter(dish -> dish.category.contains("고기"))
				
			
		for(Dish dish : category) {
			dish.printInfo();
		}*/
	}
	
	
	
	
	public void printFishDish() {
		System.out.println("==물고기==");
	
	List<Dish> fish = null;
    
	fish = dishList.stream()
            .filter(dish -> dish.category.contains("생선"))
            .collect(Collectors.toList());
    
    for(Dish dish : fish) {
        dish.printInfo();
    }
    
	}
    
	public void printVegetarianDish() {
		System.out.println("==채식주의 식사 가능==");
		
		List<Dish> vegan = null;
	    
		vegan = dishList.stream()
	            .filter(dish -> dish.vegan.contains("채소"))
	            .collect(Collectors.toList());
	    
	    for(Dish dish : vegan) {
	        dish.printInfo();
	    }
		
		
	}
	
	
	/*
	public void printHighCaloriesDish() {
		System.out.println("==고열량(정렬:열량 내림차순)==");
	}
	public void printLowCaloriesDish() {
		System.out.println("==저열량(정렬:열량 오름차순)==");
	}
	public void printHowManyDishes() {
		System.out.println("==음식 개수==");
	}
	public void printTotalCalory() {
		System.out.println("==전체 칼로리==");
	}
	public void printAverageCalory() {
		System.out.println("==평균 칼로리==");
	}*/
}
