package ch07_9.Inheritance_Person_Student_Teacher;

public class Archer extends Character{

	public Archer(String name) {
		super(name, "Archer");
	}
	

	
	public void printInfo() {
		System.out.println("이름=" + name + "캐릭터=" + character);
	}
	
	
	 @Override
	    public void attack() {
	        System.out.println("[" + getName() + "/" + getCharacter() + "] 원거리 공격");
	    }
}
