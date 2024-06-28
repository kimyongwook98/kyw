package ch07;

public class CardRankApp {

	public static void main(String[] args) {
		
		String[] cardRanks;
		
		cardRanks = new String[13];
		
		cardRanks[0] = "1";
		cardRanks[1] = "2";
		cardRanks[2] = "3";
		cardRanks[3] = "4";
		cardRanks[4] = "5";
		cardRanks[5] = "6";
		cardRanks[6] = "7";
		cardRanks[7] = "8";
		cardRanks[8] = "9";
		cardRanks[9] = "10";
		cardRanks[10] = "Jack";
		cardRanks[11] = "Queen";
		cardRanks[12] = "King";
		
		
		System.out.println("-cardRanks-");	
		for (int i = 0; i < cardRanks.length; i++) {
			System.out.print("cardRanks[" + i + "]");
			System.out.println(cardRanks[i]);
		}
	}

}
