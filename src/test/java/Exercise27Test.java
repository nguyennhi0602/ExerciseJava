import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise27Test {
    @Test
    public void test_countZeroNumber() {
        assertEquals(new Exercise27().countZeroNumber(12), 4);
        assertEquals(new Exercise27().countZeroNumber(100), 30);
        assertEquals(new Exercise27().countZeroNumber(4), 0);
    }
}
