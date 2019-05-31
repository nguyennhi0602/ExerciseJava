import org.junit.Assert;
import org.junit.Test;

public class Array27Test {
    @Test
    public void test_getSubArray() {
        Assert.assertArrayEquals(new Array27().getSubArray(new int[]{5, 2, 3, 18, 7, 3}, 3), new int[]{18, 7, 5});
    }
}
