import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Array5Test {
    @Test
    public void test_isPrimeNumber() {
        assertEquals(new Array5().isPrimeNumber(1), false);
        assertEquals(new Array5().isPrimeNumber(7), true);
    }

    @Test
    public void test_getArray() {
        assertEquals(new Array5().getArray(new int[]{1, 4, 5, 3, 7, 17, 23}), Arrays.asList(5, 3, 7, 17, 23));
    }
}
