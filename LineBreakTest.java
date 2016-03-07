package technicalPractice;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

public class LineBreakTest {
	static String s = "This is a fairly long sentence that should be split at breakpoints given by brk";
	static List<String> out1 = Arrays.asList("This is a fa-", "irly long se-", "ntence that ","should be sp-","lit at break-","points given ","by brk");


	@Test
	public void BreakBigTest() {
		Assert.assertEquals(out1, LineBreak.LineBreaker(s, 13));
	}
}
