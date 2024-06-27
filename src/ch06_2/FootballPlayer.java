package ch06_2;

public class FootballPlayer {

	String name;
	String uniformNumber;
	String teamName;
	int speed;
	int tech;
	
	
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    public String getUniformNumber() {
        return uniformNumber;
    }

    public void setUniformNumber(String uniformNumber) {
        this.uniformNumber = uniformNumber;
    }
    
    public void setSpeed(int speed) {

        this.speed = speed;
    }
    
    public void setTech(int tech) {

        this.tech = tech;
    }
    
    
    FootballPlayer() {}
    
	FootballPlayer(String name, String uniformNumber, String teamName, int speed, int tech) {
		this.name = name;
		this.uniformNumber = uniformNumber;
		this.teamName = teamName;
		this.speed = speed;
		this.tech = tech;
	}
	
	
	
	
	
	
	
	
	
	public void printInfo() {
		System.out.println("선수 :" + name);
		System.out.println("팀 :" + teamName);
		System.out.println("백넘버 :" + uniformNumber);
		System.out.println("속도 :" + speed);
		System.out.println("기술 :" + tech);
	}
	
	/*public void printInfo() {
		System.out.println("선수 :" + fp2.name);
		System.out.println("팀 :" + fp2.teamName);
		System.out.println("백넘버 :" + fp2.uniformNumber);
		System.out.println("속도 :" + fp2.speed);
		System.out.println("기술 :" + fp2.tech);
	} */
 
}
