import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise24Test {
    @Test
    public void test_countFibonaciNumber() {
        assertEquals(new Exercise24().countFibonaciNumber(3), 5);
        assertEquals(new Exercise24().countFibonaciNumber(0), 0);
    }
}
