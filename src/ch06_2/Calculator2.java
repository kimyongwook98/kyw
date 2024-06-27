package ch06_2;

public class Calculator2 {

	private int val1;
	private int val2;
	
	Calculator2() {
		this(0, 0);
	}
	
	Calculator2(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	
	
	public void plus() {
		int result1 = val1 + val2;
		System.out.println("plus()::" + result1);
	}
	
	public void minus() {
		int result2 = val1 - val2;
		System.out.println("minus()::" + result2);
	}
	
	public void multiply() {
		int result3 = val1 * val2;
		System.out.println("multiply()::" + result3);
	}
	
	public void divide() {
		int result4 = val1 / val2;
		System.out.println("divide()::" + result4);
	}
	
	public void rest() {
		int result5 = val1 % val2;
		System.out.println("rest()::" + result5);
	}
	
	
	
	public void printInfo() {
		System.out.println("값1=" + val1);
		System.out.println("값2=" + val2);
	}
	public void clear() {
		val1=0;
		val2=0;
		System.out.println("필드 초기화 완료");
	}
		
	/* Calculator2 calculator2 = new Calculator2;
		public void clear() {
		calculator2.claer();	
		}
		
	public void printInfo()	
	*/		

	}
	
	

		
