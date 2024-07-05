package ch09.drink;

public class DrinkApp {
	public static void main(String[] args) {
		System.out.println("==Variable==");
		System.out.println("==implements Interface==");
		Drink beer = new Beer();
		beer.drink();
		
		Drink water = new Water();
		water.drink();
		
		System.out.println("\n--AnonymousObject--");
		Drink beer1 = new Beer()
		{
			@Override
			public void drink() {
				System.out.println("맥주를 마신다");
			}
		};
		
		beer1.drink();
		
		Drink water1 = new Water()
		{
			@Override
			public void drink() {
				System.out.println("물을 마신다");
			}
		};
		
		
		System.out.println("\n==Method==");
		System.out.println("--implements Interface--");
		
		Biz b = new Biz();
		b.biz(beer);
		b.biz(water);
		
		System.out.println("\n--AnonymousObject--");
		b.biz(new Biz() {
			
			public void drink() {
				System.out.println("와인을 마시다");
			}
		});
		b.biz(new Biz() {
			
			public void drink() {
				System.out.println("커피를 마시다");
			}
		});
	}
}
	