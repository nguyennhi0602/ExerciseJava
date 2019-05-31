import org.junit.Assert;
import org.junit.Test;

public class Array17Test {
    @Test
    public void test_setArray() {
        Assert.assertArrayEquals(new Array17().setArray(5),
                new int[][]{{1, 2, 3, 4, 5},
                        {16, 17, 18, 19, 6},
                        {15, 24, 25, 20, 7},
                        {14, 23, 22, 21, 8},
                        {13, 12, 11, 10, 9}});
    }

}
