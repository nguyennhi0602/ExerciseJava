import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise12Test {
    @Test
    public void test_caculateFactorial() {
        assertEquals(new Exercise12().calculateFactorial(1), 1);
        assertEquals(new Exercise12().calculateFactorial(5), 120);
    }
    
    @Test
    public void test_calculateSum() {
        assertEquals(new Exercise12().calculateSum(3), 2.67, 0.01);
    }
}
