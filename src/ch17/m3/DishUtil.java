package ch17.m3;

import java.util.ArrayList;
import java.util.List;

public class DishUtil {

	// Di u = new Umbrella("3단 자동우산", 18000, 105, "010-1111-2222 반품 배송료 5,000(원)");

	public static List<Dish> getAllDishes() {
		List<Dish> dishList = new ArrayList<>() ;
		dishList.add(new Dish("갈비찜", "고기", "불가능", 531));
		dishList.add(new Dish("불고기", "고기", "불가능", 471));
		dishList.add(new Dish("산적", "고기", "불가능", 653));
		dishList.add(new Dish("떡국", "기타", "불가능", 440));
		dishList.add(new Dish("잡채", "기타", "불가능", 191));
		dishList.add(new Dish("취나물무침", "채소", "가능", 30));
		dishList.add(new Dish("배추김치", "채소", "가능", 25));
		dishList.add(new Dish("고등어구이", "생선", "불가능", 302));
		dishList.add(new Dish("갈치구이", "생선", "불가능", 450));
		dishList.add(new Dish("사과", "과일", "가능", 50));
		
		
		return dishList;
	}
}
