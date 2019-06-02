import org.junit.Assert;
import org.junit.Test;

public class Array6Test {
    @Test
    public void test_sortArray() {
        Assert.assertArrayEquals(new Array6().sortArray(new int[]{6, 3, 1, 2, 4, 6, 8, 4, 5}), new int[]{2, 5, 3, 4, 4, 6, 6, 8, 1});
    }
}
