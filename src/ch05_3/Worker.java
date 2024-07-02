package ch05_3;

public class Worker {
	String name;
	int career;
	Job job;

	public Worker(String name, int career, Job job) {
		this.name = name;
		this.career = career;		
		this.job = job;
	}

	
	public void printInfo() {
		System.out.println("이름:" + name + "커리어:" + career + "직업:" + job);
	}
}
