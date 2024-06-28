package ch06_3;

public class Company {
	private String name;
	private String biz;
	
	public Company(String name, String biz) {
		this.name = name;
		this.biz = biz;
	}
	
	public void printInfo() {
		System.out.println("회사명=" + name + "| 사업분야 =" + biz);
	}
}
