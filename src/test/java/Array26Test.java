import org.junit.Assert;
import org.junit.Test;

public class Array26Test {
    @Test
    public void test_reverseNumber() {
        Assert.assertEquals(new Array26().reverseNumber(1), 1);
        Assert.assertEquals(new Array26().reverseNumber(2345), 5432);
    }

    @Test
    public void test_calculateSum() {
        Assert.assertEquals(new Array26().calculateSum(new int[]{2, 4, 27, 12, 71}), 116);
    }
}
