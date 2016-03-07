package technicalPractice;

import org.junit.Assert;
import org.junit.Test;

public class StockTradingTest {
	public static int[] S1 = {50, 30, 20, 50, 60, 70, 10, 30, 50, 100, 40, 50};
	
	//Special case if there's never a positive profit
	public static int[] S2 = {100, 30, 20, 10, 0};

	@Test
	public void TradeTest() throws Exception {
		Assert.assertEquals(90, StockTrading.Trade(S1));
	}
	
	@Test
	public void TradeTest2() throws Exception {
		Assert.assertEquals(-10, StockTrading.Trade(S2));
	}
}
