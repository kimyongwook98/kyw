package ch06_2;

public class Pay {

	int hourPay = 9860;
	
	Pay(int hourPay) {
		this.hourPay = hourPay;
	}
	
	public int getDayPay() {
		int dayPay = hourPay * 8;
		return dayPay;
	}
	
	public int getWeekPay(int dayPay) {
		int weekPay = dayPay * 5;
		return weekPay;
	}
	
	public int getYearPay(int weekPay) {
		int yearPay = weekPay * 52;
		return yearPay;
	}
	
}
