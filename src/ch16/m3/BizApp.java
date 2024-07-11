package ch16.m3;

public class BizApp {
	Biz biz = new Biz();
	
	System.out.println("==익명객체==");
	
	biz.work(new ISayable() {
		public void sayHello() {
			System.out.println("헬로");
		}
	});
	
	System.out.println("\n==람다==");
	System.out.println("--타입1--");
	//실행문 1개
	
	biz.work();
	
	
	System.out.println("\n--타입2--");
	//실행문1개, 중괄호 삭제
	
	biz.work();
	
	System.out.println("\n--타입3--");
	//실행문2개
	
	biz.work(() -> {
		System.out.println("헬로");
		System.out.println("웰컴");
	});
}
