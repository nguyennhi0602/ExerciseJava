import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Array10Test {
    @Test
    public void test_minusArray() {
        assertEquals(new Array10().minusArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 5), Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8), Arrays.asList(9, 10, 11, 12), Arrays.asList(13, 14, 15, 16), Arrays.asList(17, 18, 19, 20)));
        assertEquals(new Array10().minusArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 6), Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8), Arrays.asList(9, 10, 11, 12), Arrays.asList(13, 14, 15, 16), Arrays.asList(17, 18, 19, 20), Arrays.asList()));
    }
}
