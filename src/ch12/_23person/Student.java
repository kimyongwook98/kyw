package ch12._23person;

public class Student extends Person {
	
	String studentId;
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	@Override
	public void printInfo() {
		System.out.println("이름=" + getName() + "나이=" + getAge() + "학번=" + studentId);
	}
	
    @Override
    public String toString() {
        return "이름=" + getName() + " 나이=" + getAge() + " 학번=" + studentId;
    }
}
