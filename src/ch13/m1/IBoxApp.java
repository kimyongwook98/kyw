package ch13.m1;

public class IBoxApp {
	public static void main(String[] args) {
		System.out.println("==AppleBox==");
		AppleBox appleBox = new AppleBox();
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		apple.printInfo();
		
		System.out.println("\n==BananaBox==");
		BananaBox bananaBox = new BananaBox();
		bananaBox.set(new Banana());
		Banana banana = bananaBox.get();
		banana.printInfo();
	}
}
