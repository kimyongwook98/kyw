package ch12._11Car;

public class GetClassExample {
	public static void main(String[] args) throws Exception {
		//how1
		Class clazz = Car.class;
		
		
		//how2
		//Class clazz = Class.forName("ch12._11Car");
		
		//how3
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println("패키지 : " + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름 : " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름 : " + clazz.getName());
		
		
	}
}
