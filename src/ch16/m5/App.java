package ch16.m5;

public class App {

	public static void main(String[] args) {
		
		System.out.println("==익명객체==");
		
		
		IAddable addable0 = new IAddable() {
			
			@Override
			public int add(int i, int j) {
				int add = i + j;
				return add;
		
			}
		};
	
		
		int add0 = addable0.add(1,2);
		System.out.println("i +  j=" + add0);
		
		
		
		
		System.out.println("\n==람다==");
		
		System.out.println("==타입1==");
		// 중괄호, 리턴 생략
		IAddable addable1 = ((i, j) -> (i + j));
		
		int add1 = addable1.add(1,2);
		System.out.println("i + j=" + add1);
		
		
		
		System.out.println("==타입2==");
		//타입1과 동일, 중괄호 및 리턴 사용
		IAddable addable2 = ((i, j) -> {
			int add = i + j;
			return add;
		});
				
		
		int add2 = addable2.add(1, 2);
		System.out.println("i + j=" + add2);
		
		
		System.out.println("==타입3==");
		IAddable addable3 =((i, j) -> {
			int add = i + j;
			return add;
		});
				
				
				int add3 = addable3.add(1, 2);
				System.out.println("i + j=" + add3); 	
	}

}
