import org.junit.Assert;
import org.junit.Test;

public class String14Test {
    @Test
    public void test_isBarcode() {
        Assert.assertEquals(new String14().isBarcode("8938505974194"), true);
    }
}
