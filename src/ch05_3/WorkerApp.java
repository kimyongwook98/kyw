package ch05_3;

public class WorkerApp {

	public static void main(String[] args) {
		Worker w1 = new Worker("Rose", 3, Job.PROGRAMMER);
		w1.printInfo();
		
		Worker w2 = new Worker("James", 10, Job.WEB_DESIGNER);
		w2.printInfo();
		
		Worker w3 = new Worker("Paige", 15, Job.UI_DESIGNER);
		w3.printInfo();
	}

}
