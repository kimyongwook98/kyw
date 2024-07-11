package ch16.m4;

public class BizApp {

	public static void main(String[] args) {
		System.out.println("==implements interface==");
		Biz b = new Biz();
		IDrink beer = new Beer();
		IDrink water = new Water();
		
		b.biz(beer);
		b.biz(water);
		
		System.out.println("\n==익명객체==");
		b.biz(new Beer() {
			public void drink() {
				System.out.println("맥주를 마신다");
			}
		});
		
		
		b.biz(new Water() {
			public void drink() {
				System.out.println("물을 마신다");
			}
		});
		
		System.out.println("\n==람다==");
		b.biz(() -> 
		System.out.println("맥주를 마시다")
	);
		b.biz(() -> 
		System.out.println("물을 마시다")
	);
		b.biz(() -> 
		System.out.println("와인을 마시다")
	);
		b.biz(() -> 
		System.out.println("커피를 마시다")
	);


	}

}
