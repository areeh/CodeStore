package technicalPractice;


import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class HighestProductTest {
	List<Integer> ints = Arrays.asList(-5, 0, 10, 3, 1);
	List<Integer> ints2 = Arrays.asList(-5, -3, -1, 0, 1);
	List<Integer> ints3 = Arrays.asList(-5, -3, -10, -3, -1);
	List<Integer> ints4 = Arrays.asList(-10, -10, 1, 3, 2);
	
	@Test
	public void prodTest() {
		Assert.assertEquals(30, HighestProduct.maxProd(ints));
	}
	@Test
	public void prodTest2() {
		Assert.assertEquals(15, HighestProduct.maxProd(ints2));
	}
	@Test
	public void prodTest3() {
		Assert.assertEquals(-9, HighestProduct.maxProd(ints3));
	}
	@Test
	public void prodTest4() {
		Assert.assertEquals(300, HighestProduct.maxProd(ints4));
	}


}
