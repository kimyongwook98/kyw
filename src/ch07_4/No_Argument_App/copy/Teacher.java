package ch07_4.No_Argument_App.copy;

public class Teacher extends Person {

	private String lesson;

	public Teacher() {
		System.out.println("Teacher()");
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public String getLesson() {
		return lesson;
	}

}
