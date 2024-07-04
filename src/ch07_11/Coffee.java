package ch07_11;

public class Coffee extends Menu {

	String wd;
	
	public Coffee(String menu, int price, String wd) {
		super(menu, price);
		this.wd = wd;
	}
	
	public String getWd() {
		return wd;
	}

	public void setWd(String wd) {
		this.wd = wd;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
	}

	
}
