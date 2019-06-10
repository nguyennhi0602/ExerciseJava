import org.junit.Assert;
import org.junit.Test;

public class String17Test {
    @Test
    public void test_calculate() {
        Assert.assertEquals(new String17().calculate("123", "111"), "12");
        Assert.assertEquals(new String17().calculate("10000045", "124678"), "9875367");
        Assert.assertEquals(new String17().calculate("10000045", "1232"), "9998813");
    }
}
