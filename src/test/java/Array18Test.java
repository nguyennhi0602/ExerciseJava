import org.junit.Assert;
import org.junit.Test;

public class Array18Test {
    @Test
    public void test_sortArray() {
        Assert.assertArrayEquals(new Array18().sortArray(
                new int[][]{{5, 6, 4},
                            {1, 2, 3},
                            {4, 2, 7}}),
                new int[][]{{2, 2, 1},
                            {4, 4, 3},
                            {7, 6, 5}});
        Assert.assertArrayEquals(new Array18().sortArray(
                new int[][]{{5, 6, 4, 3},
                        {1, 2, 3, 4},
                        {4, 2, 7, 8}}),
                new int[][]{{3, 2, 2, 1},
                        {4, 4, 4, 3},
                        {8, 7, 6, 5}});
    }
}
