/* package ch06;

public class MobilePhoneApp {

	public static void main(String[] args) {

		System.out.println("===Object 1===");
		MobilePhone mp1 = new MobilePhone();
		mp1.setCompany("삼성전자");
		mp1.setName("Galaxy S23 Ultra");
		mp1.setOs("Android");
		mp1.setColor("black");
		mp1.setPen(true);
		mp1.setMemory(12);
		mp1.setStorage(512);
		mp1.setBattery(5000);
		
		mp1.printInfo();
		
		System.out.println("\n===Object 2===");
		MobilePhone mp2 = new MobilePhone();
		mp2.setCompany("애플");
		mp2.setName("iPhone 14 Pro");
		mp2.setOs("IOS");
		mp2.setColor("gold");
		mp2.setPen(false);
		mp2.setMemory(8);
		mp2.setStorage(512);
		mp2.setBattery(5000);
		
		mp2.printInfo();
		

	}

}*/













package ch06;

public class MobilePhoneApp {

    public static void main(String[] args) {
        System.out.println("===Object 1===");
        MobilePhone mp1 = new MobilePhone();
        mp1.setCompany("삼성전자");
        mp1.setName("Galaxy S23 Ultra");
        mp1.setOs("Android");
        mp1.setColor("black");
        mp1.setHasPen(true);
        mp1.setMemory(12);
        mp1.setStorage(512);
        mp1.setBattery(5000);
        mp1.printInfo();

        System.out.println("\n===Object 2===");
        MobilePhone mp2 = new MobilePhone();
        mp2.setCompany("애플");
        mp2.setName("iPhone 14 Pro");
        mp2.setOs("IOS");
        mp2.setColor("gold");
        mp2.setHasPen(false);
        mp2.setMemory(8);
        mp2.setStorage(512);
        mp2.setBattery(5000);
        mp2.printInfo();
    }
}

