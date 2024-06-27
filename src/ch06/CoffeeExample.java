package ch06;

public class CoffeeExample {

	public static void main(String[] args) {
		
		Coffee c1 = new Coffee();
		
		System.out.println("----초기값----");
		System.out.println("커피=" + c1.coffeeName);
		System.out.println("가격=" + c1.price);
		System.out.println("요구사항=" + c1.note + "\n");
			
		c1.coffeeName ="아메리카노";
		c1.note="샷 추가. 아이스. 디카페인";
		c1.price=2000;				
		
		System.out.println("----값 변경----");
		System.out.println("커피=" + c1.coffeeName);
		System.out.println("가격=" + c1.price);
		System.out.println("요구사항=" + c1.note);

	}

}
