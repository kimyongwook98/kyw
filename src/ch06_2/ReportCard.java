package ch06_2;

public class ReportCard {

	private String name;
	private int korean;
	private int english;
	private int math;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKorean() {
		return korean;
	}
	
	public void setKorean(int korean) {
		this.korean = korean;
	}
	
	public int getEnglish() {
		return english;
	}
	
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	
	public int sum() {
		return korean + english + math;
	}
	
	public int average() {
		return sum() / 3;
	}

	public char hakjum() {
		if (average() >= 90) {
            return 'A';
        } else if (average() >= 80) {
        	return 'B';
        } else if (average() >= 70) {
        	return 'C';
        } else if (average() >= 60) {
        	return 'D';
        } else {
        	return 'E';
        }
		
	}
	

	
	ReportCard(String name) {
		this.name = name;
	}
	
	ReportCard(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sum());
		System.out.println("학점 : " + hakjum());
		System.out.println("평균 : " + average());
	}
} 
