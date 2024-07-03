package ch07_9.Inheritance_Person_Student_Teacher;

public class Character {
	String name;
	String character;
	
	
	public Character(String name) {
		this.name = name;

	}
	
	public Character(String name, String character) {
		this.name = name;
		this.character = character;
	}
	
	




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public void printInfo() {
		System.out.println("이름=" + name + "캐릭터=" + character);
	}
	
	public void attack() {
		System.out.println("공격");
	}
}
