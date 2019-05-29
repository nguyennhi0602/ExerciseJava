import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Array7Test {
    @Test
    public void test_getArray() {
        assertEquals(new Array7().getArray(new int[]{2, 3, 1, 3, 4, 5, 6, 2, 3, 4, 5, 6, 7, 8}), Arrays.asList(2, 3, 4, 5, 6, 7, 8));
    }
}
