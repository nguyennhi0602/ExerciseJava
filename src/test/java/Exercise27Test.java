import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise27Test {
    @Test
    public void test_countZeroNumber() {
        assertEquals(new Exercise27().countZeroNumber(10), 2);
        assertEquals(new Exercise27().countZeroNumber(100), 24);
        assertEquals(new Exercise27().countZeroNumber(4), 0);
    }
}
