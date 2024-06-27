package ch06_2;

public class Kart {
	
	private int booster;
	private int speed;
	private String name;
	private String color;
	private int speedUp = 40;
	private int speedDown = 80 ;
	private int highestSpeed = 150;
	private int useBoosterSpeed = 100;
	private int boosterLimit = 1;
	
	public int getBooster() {
		return booster;
	}
	
	public void setBooster(int booster) {
		this.booster = booster;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHighestSpeed() {
		return highestSpeed;
	}
	
	public void setHighestSpeed(int highestSpeed) {
		this.highestSpeed = highestSpeed;
	}
	
	public int getUseBoosterSpeed() {
		return useBoosterSpeed;
	}
	
	public void setUseBoosterSpeed(int useBoosterSpeed) {
		this.useBoosterSpeed = useBoosterSpeed;
	}
	
	public int getSpeedUp() {
		return speedUp;
	}
	
	public void setSpeedUp(int speedUp) {
		this.speedUp = speedUp;
	}
	
	public int getSpeedDown() {
		return speedDown;
	}
	
	public void setSpeedDown(int speedDown) {
		this.speedDown = speedDown;
	}
	
	public int getBoosterLimit() {
		return boosterLimit;
	}
	
	public void setBoosterLimit(int boosterLimit) {
		this.boosterLimit = boosterLimit;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.name = color;
	}
	
	
	Kart() {}
	Kart(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void speedUp() {
		speed += 40;
		if (speed > highestSpeed) {
			speed = highestSpeed;
		}
		System.out.println(name+"("+ color +")"+ "speedUp"+ "속도:" + speed+ "부스터 : " + booster + "개");
	}
	
	
	public void pickupBooster() {
		if (booster < boosterLimit) {
			booster++;
			System.out.println(name+"("+ color +")"+ "pickupBooster"+ "속도:" + speed+ "부스터 : " + booster + "개");
		} else if (booster == 1) {
			System.out.println(name+"("+ color +")"+ "pickupBooster"+ "속도:" + speed+ "부스터 : " + booster + "개 | 부스터를 더이상 추가할 수 없음");
		}
	}
	
	
	public void useBooster() {
		if (booster == 1 && speed < 50) {
			booster--;
			speed += useBoosterSpeed;
			System.out.println(name+"("+ color +")"+ "speedDown"+ "속도:" + speed + "부스터 : " + booster + "개");
		} else if (booster == 1 && speed >= 50) {
			booster--;
			speed = 150;
			System.out.println(name+"("+ color +")"+ "speedDown"+ "속도:" + speed + "부스터 : " + booster + "개");
		} else if (booster == 0) {
			System.out.println(name+"("+ color +")"+ "speedDown"+ "속도:" + speed + "부스터 : " + booster + "개 | 사용 가능한 부스터 없음");
		} 
	}
	
		
		
	public void speedDown() {
		speed -= speedDown ;
		if (speed < 0) {
			speed = 0;
			System.out.println(name+"("+ color +")"+ "speedDown"+ "속도:" + speed + "부스터 : " + booster + "개");
		} else {
			System.out.println(name+"("+ color +")"+ "speedDown"+ "속도:" + speed + "부스터 : " + booster + "개");
		}
		
	}

	
	
	
	public void printKartInfo() {
		System.out.println("카트명: " + name);
		System.out.println("카트컬러: " + color);
		System.out.println("속도 up 호출 시 증가 속도 : " + speedUp);
		System.out.println("속도 down 호출 시 감소 속도 : " + speedDown );
		System.out.println("최대 속도 : " + highestSpeed);
		System.out.println("부스터 사용시 증가 속도: " + useBoosterSpeed);
		System.out.println("부스터 최대 보유 개수 : " + boosterLimit );
	}
}

