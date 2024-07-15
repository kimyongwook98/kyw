package ch04.m1;

import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {
		System.out.println("==START==");
		
		Scanner sc = new Scanner(System.in);
	
	
		
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		String age = sc.nextLine();
		
		Person p = new Person(name, Integer.parseInt(age));
		p.printInfo();
		
		sc.close();
		
		System.out.println("end");
	}

}
