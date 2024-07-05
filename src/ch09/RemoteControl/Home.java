package ch09.RemoteControl;

public class Home {
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("tv ON");
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv OFF");
		}
	
};

public void use1() {
	rc.turnOn();
	rc.turnOff();
}

public void use2() {
	RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("에어컨을 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("에어컨을 끕니다.");
		}
	};
	rc.turnOn();
	rc.turnOff();
}
	
	public void use3(RemoteControl rc) {
		rc.turnOff();
		rc.turnOff();
	}
}
