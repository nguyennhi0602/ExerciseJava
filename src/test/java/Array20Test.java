import org.junit.Assert;
import org.junit.Test;

public class Array20Test {
    @Test
    public void test_getSubMatrix() {
        Assert.assertArrayEquals(new Array20().getSubMatrix(
                new int[][]{{1, 2, 3, 4, 5, 6},
                        {7, 8, 9, 10, 11, 12},
                        {13, 14, 15, 16, 16, 17}}, 1, 1, 2, 3),
                new int[][]{{8, 9, 10},
                        {14, 15, 16}});
        Assert.assertArrayEquals(new Array20().getSubMatrix(
                new int[][]{{1, 2, 3, 4, 5, 6},
                        {7, 8, 9, 10, 11, 12},
                        {13, 14, 15, 16, 16, 17}}, 4, 1, 1, 3),
                new int[][]{});
    }
}
