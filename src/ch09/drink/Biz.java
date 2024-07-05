package ch09.drink;

public class Biz implements Drink{

	public void biz(Drink d) {
		d.drink();
	}
	public void drink() {}
}
