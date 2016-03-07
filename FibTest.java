package technicalPractice;

import org.junit.Assert;
import org.junit.Test;



public class FibTest {
	

	@Test
	public void Fib() {
		Assert.assertEquals(512559680, Fib.Fibb(48));
	}
	
	@Test
	public void FibMemo() {
		Assert.assertEquals(512559680, Fib.FibMemo(48));
	}
	
	
	@Test
	public void FibTail() {
		Assert.assertEquals(512559680, Fib.FibbTail(48));
	}

}
