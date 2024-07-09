package ch11.tryCatch;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class App {
	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			System.out.print("a=" + a);
			System.out.print(" b=" + b);
			int result = a / b;
			System.out.println("result=" + result);
			
		} 
		
			catch (ArithmeticException e) {
				System.out.println("\n--catch--");
			} finally {
				System.out.println("--finally--");
			}
		}
		
		

	}	
		

