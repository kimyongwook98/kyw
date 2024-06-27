/*
package ch06;
public class MobilePhone {
	private String company;
	private String name;
	private String os;
	private String color;
	private boolean pen;
	private int memory;
	private int storage;
	private int battery;
	

	public String getCompany() {
		return company;
	}
	
	public void setCompany(String string) {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String string) {
		
	}
	
	public String getOs() {
		return os;
	}
	
	public void setOs(String string) {
		
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String string) {
		
	}
	
	
	
	public void setPen(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	
	public int getStorage() {
		return storage;
	}
	
	public void setStorage(int storage) {
		if (storage < 0) {
			storage = 0;
		}
		this.storage = storage;
	}
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		if (memory < 0) {
			memory = 0;
		}
		this.memory = memory;
	}
	
	public int getBattery() {
		return battery;
	}
	
	public void setBattery(int battery) {
		if (battery < 0) {
			battery = 0;
		}
		this.battery = battery;
	}
	
	public void printInfo() {
		System.out.println("회사: " + company);
		System.out.println("제품: " + name);
		System.out.println("운영체제: " + os);
		System.out.println("컬러: " + color);
		if (pen) {
			System.out.println("지원");
			
		} else {
			System.out.println("미지원");
		}
		System.out.println("메모리: " + memory);
		System.out.println("스토리지: " + storage);
		System.out.println("배터리: " + battery);
	}

} */

















package ch06;

public class MobilePhone {
    private String company;
    private String name;
    private String os;
    private String color;
    private boolean hasPen;
    private int memory;
    private int storage;
    private int battery;

    
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

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean hasPen() {
        return hasPen;
    }

    public void setHasPen(boolean hasPen) {
        this.hasPen = hasPen;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        if (memory < 0) {
            memory = 0;
        }
        this.memory = memory;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        if (storage < 0) {
            storage = 0;
        }
        this.storage = storage;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        if (battery < 0) {
            battery = 0;
        }
        this.battery = battery;
    }

  
    public void printInfo() {
        System.out.println("회사: " + company);
        System.out.println("제품: " + name);
        System.out.println("운영체제: " + os);
        System.out.println("컬러: " + color);
        System.out.println("펜: " + (hasPen ? "Yes" : "No"));
        System.out.println("메모리: " + memory);
        System.out.println("스토리지: " + storage);
        System.out.println("배터리: " + battery);
    }
}

