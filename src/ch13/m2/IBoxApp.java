package ch13.m2;


public class IBoxApp {
	
	public static void main(String[] args) {
		
		System.out.println("==Box<Apple>==");
		Box<Apple> appleBox = new Box<>();
		appleBox.set(new Apple());
		appleBox.get().printInfo();
		
		
		System.out.println("==Box<Banana>==");
		Box<Banana> bananaBox = new Box<>();
		bananaBox.set(new Banana());
		bananaBox.get().printInfo();
	}
}

