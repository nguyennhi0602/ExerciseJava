import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise4Test {
    @Test
    public void test_isPrimeNumber(){
        assertEquals(new Exercise4().isPrimeNumber(1),false);
        assertEquals(new Exercise4().isPrimeNumber(2),true);
        assertEquals(new Exercise4().isPrimeNumber(4),false);
    }
    @Test
    public void test_analysisPrimeNumber(){
        assertEquals(new Exercise4().analysisPrimeNumber(600),"2^3 * 3 * 5^2");
        assertEquals(new Exercise4().analysisPrimeNumber(7),"7");
        assertEquals(new Exercise4().analysisPrimeNumber(9),"3^2");
    }

}
