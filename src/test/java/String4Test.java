import org.junit.Assert;
import org.junit.Test;

public class String4Test {
    @Test
    public void test_calcuateSum() {
        Assert.assertEquals(new String4().calcuateSum("abc 123 def 33 mn 3.221"), 380);
    }
}
