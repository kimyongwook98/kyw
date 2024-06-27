package ch06;

public class SunCream {
    private String company;
    private String name;
    private boolean stickiness; 
    private char skinType;
    private int capacity;
    private int spf;
    private String pa;

    
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public boolean stickiness() {
        return stickiness;
    }

    public void setStickiness(boolean stickiness) {
        this.stickiness = stickiness;
    }

    
    public char getSkinType() {
        return skinType;
    }

    public void setSkinType(char skinType) {
        this.skinType = skinType;
    }

 
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {

        this.capacity = capacity;
    }

   
    public int getSpf() {
        return spf;
    }

    public void setSpf(int spf) {

        this.spf = spf;
    }

    
    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    
    public void printInfo() {
        System.out.println("회사: " + company);
        System.out.println("제품: " + name);
		if (stickiness) {
			System.out.println("끈적임");
			
		} else {
			System.out.println("안끈적임");
		}
		
		switch (skinType) {
		case 's' :
			System.out.println("민감성");
			break;
		case 'o' :
			System.out.println("지성");
			break;
		case 'n' :
			System.out.println("중성");
			break;
		case 'd' :
			System.out.println("건성");
			break;
		}
		
		
				
				

        System.out.println("용량: " + capacity); 
        System.out.println("SPF: " + spf);
        System.out.println("PA: " + pa);
    }
    

}

