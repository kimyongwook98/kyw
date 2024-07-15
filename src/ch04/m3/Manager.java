package ch04.m3;

import java.util.Scanner;


public class Manager{
	
		

	 public Manager() {};
	
	 public void addPerson(Scanner sc) {
		System.out.println("ID를 입력하세요=>");
		String id = sc.nextLine();
		
		System.out.println("이름을 입력하세요=>");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요=>");
		String age = sc.nextLine();
		
		System.out.println("성별을 입력하세요 F여 M남 =>");
		String sex = sc.nextLine();
		if (sex == "F") {
			sex = "여";
		} else if (sex == "M") {
			sex = "남";
		}
		
		Manager manager = new Manager();
		
	}
		public void printPersonList() {
					
					//for (int i =0; i< manager; i++) {
			
		}
	}

	
	


