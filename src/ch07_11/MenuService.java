package ch07_11;
/*
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
    
    */
    

public class MenuService {
	static Ade ade;
	static Coffee coffee;
	
	

/*	
 * String menu;
		int price;
		String wd;
		String jr;
 * 
 * public MenuService(String menu, int price) {
		this.menu = menu;
		this.price = price;
	
	} */


	
	public static Coffee makeCoffee(String menu, int price, String wd) {
		
		return new Coffee(menu, price, wd);
		
      
    }

    public static Ade makeAde(String menu, int price, String jr) {
       
       return new Ade(menu, price, jr);
        
    }
}
