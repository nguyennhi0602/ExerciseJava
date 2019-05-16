import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise4Test {
    @Test
    public void test_analysisPrimeNumber(){
        assertEquals(new Exercise4().analysisPrimeNumber(9),"3*3");
        assertEquals(new Exercise4().analysisPrimeNumber(600),"2^3 * 3 * 5^2");
        assertEquals(new Exercise4().analysisPrimeNumber(9),"3^2");

    }

}
