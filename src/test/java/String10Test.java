import org.junit.Assert;
import org.junit.Test;

public class String10Test {
    @Test
    public void test_getStringIsValid() {
        Assert.assertEquals(new String10().getStringIsValid("abc4e6fd"), "abcccceeeeeefd");
        Assert.assertEquals(new String10().getStringIsValid("ab13c"), "abbbbbbbbbbbbbc");
    }
}
