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
                            {3, 3, 4},
                            {5, 6, 7}});
    }
}
