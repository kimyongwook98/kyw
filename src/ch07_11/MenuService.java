package ch07_11;

public class MenuService {

	Ade ade;
	Coffee coffee;
	Menu[] menuArray;
	
	
	
	
	public MenuService(Ade ade, Coffee coffee, Menu[] menuArray) {
		this.ade = ade;
		this.coffee = coffee;
		this.menuArray = menuArray;
	}
	
	
    public printInfo() {
    	Ade.makeAde();
    	Coffe.makeCoffee
    }
    
    
    
    
    
/*
public class MenuService {
	String name;
	int price;
	String wd;
	Menu[] menuArray;
	
	
	public MenuService(String name, int price, String wd) {
		this.name = name;
		this.price = price;
		this.wd = wd;
	}
	
	public static void  makeCoffee(String name, int price, String wd) {
        
        System.out.println( name + price + " 원두: " + wd);
      
    }

    public static void  makeAde(String name, int price, String wd) {
       
        System.out.println(name + price + " 재료: " + wd);
        
    }
}*/
