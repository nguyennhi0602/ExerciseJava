import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise24Test {
    @Test
    public void test_countFibonaciNumber() {
        assertEquals(new Exercise24().countFibonaciNumber(2), 3);
        assertEquals(new Exercise24().countFibonaciNumber(4), 4);
        assertEquals(new Exercise24().countFibonaciNumber(0), 0);
    }
}
