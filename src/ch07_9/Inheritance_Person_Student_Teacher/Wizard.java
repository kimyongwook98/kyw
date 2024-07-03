package ch07_9.Inheritance_Person_Student_Teacher;

public class Wizard extends Character{

	public Wizard(String name) {
		super(name, "Wizard");
	}
	
	public void printInfo() {
		System.out.println("이름=" + name + "캐릭터=" + character);
	}
	

	@Override
    public void attack() {
        System.out.println("[" + name + "/" + character + "] 마법 공격");
    }
}
