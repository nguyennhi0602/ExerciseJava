import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise3Test {

    @Test
    public void test_analysisPrimeNumber(){
        assertEquals(new Exercise3().analysisPrimeNumber(12),"2*2*3");
        assertEquals(new Exercise3().analysisPrimeNumber(7),"7");
        assertEquals(new Exercise3().analysisPrimeNumber(9),"3*3");
        assertEquals(new Exercise3().analysisPrimeNumber(1),"1");
    }
}
