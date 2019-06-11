import org.junit.Assert;
import org.junit.Test;

public class String17Test {
    @Test
    public void test_isBiger() {
        Assert.assertEquals(new String17().isBiger("10000045", "124678"), true);
        Assert.assertEquals(new String17().isBiger("12", "1232"), false);
    }

    @Test
    public void test_sub() {
        Assert.assertEquals(new String17().sub("10000045", "124678"), "09875367");
    }

    @Test
    public void test_calculateResult() {
        Assert.assertEquals(new String17().calculateResult("10000045", "124678"), "9875367");
        Assert.assertEquals(new String17().calculateResult("10000045", "1232"), "9998813");
    }
}
