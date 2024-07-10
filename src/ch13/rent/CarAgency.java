package ch13.rent;

public class CarAgency implements Rentable<Car>{
	@Override
	public Car rent() {
		return new Car();
	}
}
