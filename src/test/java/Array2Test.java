import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array2Test {
    @Test
    public void test_caculateSum() {
        assertEquals(new Array2().calculateSum(new int[]{2, 4, 2, 6, 1, 2, 5}), 15);
    }
}
