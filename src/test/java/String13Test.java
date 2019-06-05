import org.junit.Assert;
import org.junit.Test;

public class String13Test {
    @Test
    public void test_getStringIsValid() {
        Assert.assertEquals(new String13().getStringIsValid("nguyen thi nhi", "tran thi nhi"), false);
        Assert.assertEquals(new String13().getStringIsValid("nguyen thi nhi", "nguyen thi"), true);
    }
}
