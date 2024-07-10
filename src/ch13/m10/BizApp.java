package ch13.m10;

public class BizApp {
	public static void main(String[] args) {
		Shirts s = new Shirts("루즈핏 반팔 티셔츠", 30000, "L", "070-0123-5678");
		Biz.something(s);
		
		Umbrella u = new Umbrella("3단 자동우산", 18000, 105, "010-1111-2222 반품 배송료 5,000(원)");
		Biz.something(u);
	}
}
