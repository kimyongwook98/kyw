package ch17.m3;

import java.util.List;

public class DishApp {

	public static void main(String[] args) {
		List<Dish> dishList = DishUtil.getAllDishes();

		
		
		DishBiz dishBiz = new DishBiz(dishList);
		
		dishBiz.printAllDishes();
		dishBiz.printMeatDish();
		dishBiz.printFishDish();
		dishBiz.printVegetarianDish();
		//dishBiz.printHighCaloriesDish();
		//dishBiz.printLowCaloriesDish();
		//dishBiz.printHowManyDishes();
	//	dishBiz.printTotalCalory();
		//dishBiz.printAverageCalory();

	}

}
