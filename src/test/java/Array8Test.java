import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array8Test {
    @Test
    public void test_caculateSum() {
        assertEquals(new Array8().calculate(new int[]{2, 4, 2, 6, 1, 2, 5}), 5);
    }
}
