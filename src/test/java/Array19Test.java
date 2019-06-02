import org.junit.Assert;
import org.junit.Test;

public class Array19Test {
    @Test
    public void test_sortArray() {
        Assert.assertArrayEquals(new Array19().sortArray(
                new int[][]{{3, 4, 5, 2, 1},
                        {6, 9, 10, 13, 11},
                        {7, 8, 11, 15, 6}}),
                new int[][]{{1, 2, 3, 4, 5},
                        {11, 11, 13, 15, 6},
                        {10, 9, 8, 7, 6}});
    }
}
