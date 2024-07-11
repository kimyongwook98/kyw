package ch14.m1;

public class App {
	public static void main(String[] args) {
		System.out.println("\n==메인스타드==");
		
		MyThread mt = new MyThread();
		mt.start();
		
		for (int i=0; i<3000; i++) {
			System.out.print("|");
		}
		
		
		/*
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i =0; i < 3000; i++) {
					System.out.print("|");
				}
			}
		})
		
		
		
		MyRunnable mr = new MyRunnable();
		Thread th = new Thread(mr);
		th.start();
		
		for ( int i = 0; i < 3000; i++) {
			System.out.print("|");
		}
		System.out.println("\n==메인끝==");	
	*/
	}
	
	
}
