package ch12._15menu;

import java.util.ArrayList;


public class MenuApp {
	public static void main(String[] args) {
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		
		menuList.add(new Coffee("아메리카노", 3000, "에티오피아 예가체프"));
		menuList.add(new Coffee("카푸치노", 3500, "케냐, 오클랜드"));
		menuList.add(new Coffee("레몬에이드", 4000, "레몬, 시럽"));
		menuList.add(new Coffee("한라봉에이드", 4500, "한라봉"));
		
		System.out.println("==ArrayList<Menu>==");
		for (int i = 0; i < menuList.size(); i++) {
			Menu menu = menuList.get(i);
			menu.printInfo();
		}
		
		
	}
}
