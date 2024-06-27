package ch06_2;

public class User {
	private String name;
	private int age;
	private float height;
	private char sex;
	private boolean marriageYn;
	
	
	
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
		
    public void setAge(int age) {
        this.age = age;
    }
    
    public float getHeight() {
    	return height;
    }
    
    public void setHeight(float height) {
    	this.height = height;
    }
	
    
	public char getSex() {
		return sex;
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
    
    public boolean getMarriageYn() {
    	return marriageYn;
    }

    public void setMarriageYn (boolean marriageYn) {
        this.marriageYn = marriageYn;
    }
    
    public User() {}
    
    public User(String name, int age, char sex) {
    	this.name = name;
		this.age = age;
		this.sex = sex;
    }
    
    public User(String name, int age, float height, char sex, boolean marriageYn) {
    	this.name = name;
		this.age = age;
		this.height = height;
		this.sex = sex;
		this.marriageYn = marriageYn;
    }
    
    
    public void printInfo() {
    	System.out.println("이름:" + name);
    	System.out.println("나이:" + age);
    	System.out.println("키:" + height);
    	
    	switch (sex) {
    	case 'W' :
			System.out.println("성별: 여자");
			break;
    	case 'M' :
			System.out.println("성별: 남자");
			break;
		default:
			System.out.println("false");
    	}
    	
 
    	
    	
    	if (marriageYn) {
    		System.out.println("결혼여부: 기혼");
    	} else {
    		System.out.println("결혼여부: 미혼");
    	}
    }
    
}
