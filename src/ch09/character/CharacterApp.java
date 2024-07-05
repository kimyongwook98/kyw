package ch09.character;

public class CharacterApp {

	public static void main(String[] args) {
		
		System.out.println("===anonymousObject===");
		System.out.println("---1---");
		Character c1 = new Character() {
			@Override
			public void attack() {
				System.out.println("근거리공격");
			}
		};
		
				
		c1.attack();
		
		System.out.println("\n---2---");
		Character c2 = new Character("에이스") {
			@Override
			public void attack() {
				System.out.println("소총공격");
			}

		}; 
				
		c2.attack();
		System.out.println(c2.getName());
		
		System.out.println("\n---3---");
		
		Character c3 = new Character("제임스", "라이플맨") {
			@Override
			public void attack() {
				System.out.println("소총공격");
			}
			@Override
			public void printInfo() {
				System.out.print("이름=" + getName());
				System.out.println(" | 캐릭터=" + getCharacter());
				
				
			}
		}; 		
				
		c3.attack();
		c3.printInfo();
	}

}
