import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Array4Test {
    @Test
    public void test_sortArray() {
        assertEquals(new Array4().sortArray(new int[]{1, 3, 2, 6, 5, 4, 5, 1, 2}), Arrays.asList(2, 2, 4, 6, 5, 5, 3, 1, 1));
    }

}
