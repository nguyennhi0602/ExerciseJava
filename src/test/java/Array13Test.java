import org.junit.Assert;
import org.junit.Test;

public class Array13Test {
    @Test
    public void test_sortArray() {
        Assert.assertArrayEquals(new Array13().sortArray(new int[][]{{1, 2, 3}, {4, 5, 6}}), new int[][]{{4, 1}, {5, 2}, {6, 3}});
        //Assert.assertArrayEquals(new Array13().sortArray(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {3, 4, 3}}), new int[][]{{3, 7, 4, 1}, {4, 8, 5, 2}, {3, 9, 6, 3}});
    }
}
