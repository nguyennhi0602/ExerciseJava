import org.junit.Assert;
import org.junit.Test;

public class Array21Test {
    @Test
    public void test_getArray() {
        Assert.assertArrayEquals(new Array21().getSubMatrix(
                new int[][]{{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15}}, 3, 3),
                new int[][]{{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15}});
        Assert.assertArrayEquals(new Array21().getSubMatrix(
                new int[][]{{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15}}, 1, 3),
                new int[][]{{1, 2, 3, 5},
                        {11, 12, 13, 15}});
    }
}
