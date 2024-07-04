package ch08.ch08_dog.DogApp;

public class Dog extends Animal implements Pet {

	@Override
	void walk() {
		System.out.println("Dog.walk()");
	}

	@Override
	public void gotoDogCafe() {
		System.out.println("Dog.gotoDogCafe()");

	}

}
