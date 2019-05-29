import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Array11Test {
    @Test
    public void test_sortArray() {
        assertArrayEquals(new Array11().sortArray(new int[]{1, 2, 4, 5, 6, 7, 8, 10}), new int[]{7, 10, 8, 5, 6, 1, 4, 2});
    }
}
