import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Exercise17Test {
    @Test
    public void test_countNumber() {
        assertEquals(new Exercise17().countNumber(1532123), 7);
    }

    @Test
    public void test_isValidNumber() {
        assertEquals(new Exercise17().isValidNumber(153), true);
    }

    @Test
    public void test_getValidNumbers() {
        assertEquals(new Exercise17().getValidNumbers(), Arrays.asList(153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084));
    }
}
