import org.junit.Assert;
import org.junit.Test;

public class Array4Test {
    @Test
    public void test_sortArray() {
        Assert.assertArrayEquals(new Array4().sortArray(new int[]{1, 3, 4, 2, 4, 5}), new int[]{2, 4, 4, 5, 3, 1});
    }

}
