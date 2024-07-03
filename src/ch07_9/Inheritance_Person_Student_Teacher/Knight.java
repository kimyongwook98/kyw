package ch07_9.Inheritance_Person_Student_Teacher;

public class Knight extends Character{

	

	public Knight(String name) {
		super(name, "Knight");
	}

	
	public void printInfo() {
		System.out.println("이름=" + name + "캐릭터=" + character);
	}
	
	
	@Override
    public void attack() {
        System.out.println("[" + name + "/" + character + "] 근거리 공격");
    }
}
