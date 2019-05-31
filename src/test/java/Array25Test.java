import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array25Test {
    @Test
    public void test_caculateGCD() {
        assertEquals(new Array25().caculateGCD(2, 0), 2);
        assertEquals(new Array25().caculateGCD(4, 8), 4);
    }

    @Test
    public void test_calculateGCDOfArray() {
        assertEquals(new Array25().calculateGCDOfArray(new int[]{1, 2, 3}), 1);
        assertEquals(new Array25().calculateGCDOfArray(new int[]{16, 8, 32}), 8);
    }
}
