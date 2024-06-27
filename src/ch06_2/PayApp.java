package ch06_2;

public class PayApp {

	public static void main(String[] args) {
		int hourPay = 9860;
		Pay p = new Pay(hourPay);
		
		System.out.println("\n=하루급여=");
		int dayPay = p.getDayPay();
		System.out.println("급여=" + dayPay);
		
		System.out.println("\n=주급여=");
		int weekPay = p.getWeekPay(dayPay);
		System.out.println("급여=" + weekPay);
		
		System.out.println("\n=연급여=");
		int yearPay=p.getYearPay(weekPay);
		System.out.println("급여=" + yearPay);
		

	}

}
