package ch05_3;

public class SalaryManager {
	Employee employees[];

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	} 


	public SalaryManager(Employee[] employees) {
		this.employees = employees;
	}
	
	
	public void printInfo() {
		System.out.println("사번 | 이름 | 연봉 | 사원평가 | 등급 | 내년연봉");
		for (int i = 0;  i <employees.length;  i++) {
			employees[i].printInfo();
		}
	}
}

