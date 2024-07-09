package ch12._11Exc;

import java.net.UnknownHostException;

public class App {
	public static void main(String[] args) {
		/*
		InetAddress ia;
		
		ia = InetAddress.getByName("www.naver.com");
		System.out.println("ia=" + ia);
		*/
		
		
		InetAddress ia;
		
		try {
			System.out.println("--try--");
			ia = InetAddress.getByName("www.naver.com");
			System.out.println("주소 정보=" + ia);
		} catch (UnknownHostException e) {
			System.out.println("--catch--");
		} finally {
			System.out.println("--finally--");
		}
			
	
	}
}
