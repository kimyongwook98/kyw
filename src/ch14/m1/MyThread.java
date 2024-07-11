package ch14.m1;

public class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 3000; i++) {
			System.out.print("-");
		}
	}
}
