import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise12Test {
    @Test
    public void test_calculateSum() {
        assertEquals(new Exercise12().calculateSum(0), 1, 0.01);
        assertEquals(new Exercise12().calculateSum(3), 2.67, 0.01);
    }
}
