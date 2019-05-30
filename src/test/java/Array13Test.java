import org.junit.Assert;
import org.junit.Test;

public class Array13Test {
    @Test
    public void test_sortArray() {
        Assert.assertArrayEquals(new Array13().sortArray(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 3}}), new int[][]{{1, 7, 4, 1}, {2, 8, 5, 2}, {3, 9, 6, 3}});
        Assert.assertArrayEquals(new Array13().sortArray(new int[][]{{1, 2}, {4, 5}}), new int[][]{{4, 1}, {5, 2}});
    }
}
