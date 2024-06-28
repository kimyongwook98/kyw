package ch06_2;

public class KartApp {
	public static void main(String[] args) {
		Kart_2 kart = new Kart_2("버스트", "Green");
		
		System.out.println("=kartInfo=");
		kart.printKartInfo();
		
		System.out.println("=run=");
		kart.speedUp();
		kart.speedUp();
		kart.speedUp();
		kart.speedUp();
		kart.speedDown();
		kart.pickupBooster();
		kart.pickupBooster();
		kart.useBooster();
		kart.useBooster();
		kart.speedDown();
		kart.speedDown();
		kart.speedDown();
		kart.speedDown();
		kart.speedDown();
		
	}
}
