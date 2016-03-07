package technicalPractice;

public class StockTrading {
	
	//get largest profit from buying once then selling once
	//indices give chronological order of prices
	public static int Trade(int[] Stocks) {
		int currMin = Stocks[0];
		int maxDiff = Stocks[1]-Stocks[0];
		
		for (int i = 1; i < Stocks.length; i++) {
			if (maxDiff < Stocks[i] - currMin) {
				maxDiff = Stocks[i] - currMin;
			}
			if (currMin > Stocks[i]) {
				currMin = Stocks[i];
			}
		}
		return maxDiff;

	}

	public static void main(String[] args) {
		
		

	}

}
