import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {
    @Test
    public void test_isPrimeNumber(){
        assertEquals(new Exercise2().isPrimeNumber(1),false);
        assertEquals(new Exercise2().isPrimeNumber(12),false);
    }
    @Test
    public void test_calculateSumOfNumber(){
        assertEquals(new Exercise2().calculateSumOfNumber(12),0);
        assertEquals(new Exercise2().calculateSumOfNumber(13),4);
    }
}
