import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise24Test {
    @Test
    public void test_calculateFibonaci() {
        assertEquals(new Exercise24().caculateFibonaci(1), 1);
        assertEquals(new Exercise24().caculateFibonaci(3), 2);
    }

    @Test
    public void test_countFibonaciNumber() {
        assertEquals(new Exercise24().countFibonaciNumber(2), 3);
        assertEquals(new Exercise24().countFibonaciNumber(1), 2);
    }
}
