import org.junit.Assert;
import org.junit.Test;

public class Array12Test {
    @Test
    public void test_sortArray() {
        Assert.assertArrayEquals(new Array12().sortArray(new int[]{1, 2, 4, 5, 6, 7}, 3), new int[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertArrayEquals(new Array12().sortArray(new int[]{1, 2, 4, 5, 6, 7}, 4), new int[]{1, 2, 4, 4, 5, 6, 7});
    }
}
