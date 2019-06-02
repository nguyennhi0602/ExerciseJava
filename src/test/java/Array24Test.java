import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array24Test {
    @Test
    public void test_caculateGCD() {
        assertEquals(new Array24().caculateLGM(2, 0), 0);
        assertEquals(new Array24().caculateLGM(2, 3), 6);
    }

    @Test
    public void test_calculateGCDOfArray() {
        assertEquals(new Array24().calculateLGMOfArray(new int[]{1, 2, 3}), 6);
        assertEquals(new Array24().calculateLGMOfArray(new int[]{0, 2, 3}), 0);
    }
}
