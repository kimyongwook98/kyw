package ch14.m3;

import java.text.SimpleDateFormat;
import java.util.Date;
public class User1Thread extends Thread{
	public void run() {
		
		while (true) {
			Date d = new Date();
			SimpleDateFormat dd = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(dd.format(d) + "1초");
		}
		
		
	}
}


