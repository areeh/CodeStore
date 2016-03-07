package technicalPractice;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MultipliedTest {
	public static List<Integer> input = Arrays.asList(2, 0, -3, 5);
	public static List<Integer> output = Arrays.asList(0, -30, 0, 0);
	
	@Test
	public void MultiplyTest() throws Exception {
		Assert.assertEquals(output, Multiplied.Multiply(input));
	}


}
