package ch04.m2;

import java.util.Scanner;


public class PersonApp {
	public static void main(String[] args) {
		System.out.println("==START==");
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
	
		
		while (run) {
		System.out.println("---[메뉴 선택]---");
		System.out.println("2. 등록");
		System.out.println("9. 종료");
		System.out.println("메뉴를 선택하세요 =>");
		String menu = sc.nextLine();
		
		if(menu.equals("2")) {
			System.out.println("[등록]");
			System.out.println("이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			System.out.println("나이를 입력하세요 : ");
			String age = sc.nextLine();
			Person p = new Person(name, Integer.parseInt(age));
			p.printInfo();
			
			
		} else if(menu.equals("9")) {
			run = false;
			sc.close();
			System.out.println("종료");			
		} else {
			System.out.println("잘못 설택하셨습니다.");
			System.out.println("계속 진행합니다.");
		}
	}
	}
}
		

