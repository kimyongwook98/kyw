package ch05_3;

public class Employee {
	String number;
	String name;
	int money;
	int point;

	
	
	public Employee(String number, String name, int money, int point) {
		this.number = number;
		this.name = name;
		this.money = money;
		this.point = point;
		
	}
	
	public void printInfo() {
		System.out.print(number + "|" + name + "|" + money +"|" + point +"|");
		if (point >95) {
			System.out.print("S |");
			System.out.println(money + (money * 15/100)); 
		}
		else if (95 > point && point >= 90) {
			System.out.print("A |");
			// System.out.println(String.format("%d", (money + (money * 0.1))));
			
			System.out.println(money + (money * 1/10)); 
		} else if (90 > point && point >= 80) {
			System.out.print("B |");
			System.out.println(money + (money * 5/100)); 
		} else if (80 > point && point >= 70) {
			System.out.print("C |");
			System.out.println((int)(money + (money * 0.03))); 
		} else if (70 > point && point >= 60) {
			System.out.print("D |");
			System.out.println(money); 
		}
		
	}	
		
}