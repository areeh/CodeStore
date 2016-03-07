package technicalPractice;

import org.junit.Assert;
import org.junit.Test;


public class PalindromTest {

    @Test
    public void OttoShouldBeAPalindrom() throws Exception {
        Assert.assertEquals(true, Palindrom.isPalindrom("OTTO"));
    }

    @Test
    public void OttaShouldNotBeAPalindrom() throws Exception {
        Assert.assertEquals(false, Palindrom.isPalindrom("OTTA"));
    }

    @Test
    public void AdaShouldBeAPalindrom() throws Exception {
        Assert.assertEquals(true, Palindrom.isPalindrom("ADA"));
    }
}
